import Items.Item;

import java.sql.*;
import java.util.List;

public class DataBaseConnection {

   static Connection conn;

    public static void openConnection(){
        try{
            Class.forName("org.sqlite.JDBC");
             conn = DriverManager.getConnection("jdbc:sqlite:C://sqlite/items.db");
            System.out.println("connected");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void closeConnection(){
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void insertNewInstr(List<Item> list){

        for (Item i: list){
            String type = i.getType();
            int orderCode = i.getCode();
            String name = i.getName();
            Double price = i.getPrice();
            String query = "INSERT INTO items (type, code, name, price)" +
                    "VALUES ('" + type + "', '" + orderCode + "', '" + name + "', '" + price +"')";
            try{
                Statement statement = conn.createStatement();
                statement.execute(query);
                System.out.println("Rows added");
                statement.close();
            } catch (SQLException throwables) {
                System.err.println("Запись существует");
              //  System.out.println("Rows not added");
            }

        }
        }





    public static void select(){
        try{
            Statement statement = conn.createStatement();
            String query =
                    "SELECT codeToOrder, name, price " +
                            "FROM instr";
            ResultSet result = statement.executeQuery(query);
            while (result.next()){
                int code = result.getInt("codeToOrder");
                String name = result.getString("name");
                Double price = result.getDouble("price");
                System.out.println(code + "\t|" + name + "\t|" + price);
            }
            result.close();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}
