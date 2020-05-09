import Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Item> items = new ArrayList<>();
        InstrumentParser parser = new InstrumentParser("https://kazan.vseinstrumenti.ru/tovary-pervoj-neobhodimosti/gigiena-polosti-rta/zubnye-schetki/");
       // InstrumentParser parser1 = new InstrumentParser("https://kazan.vseinstrumenti.ru/tovary-pervoj-neobhodimosti/mylo/detskoe/");
      //  InstrumentParser parser2 = new InstrumentParser("https://kazan.vseinstrumenti.ru/tovary-pervoj-neobhodimosti/mylo/tualetnoe/");
            parser.start();
           // parser1.start();
          //  parser2.start();
            parser.join();
          //  parser1.join();
         //   parser2.join();
            items.addAll(parser.getList());
         //   items.addAll(parser1.getList());
          //  items.addAll(parser2.getList());
        DataBaseConnection.openConnection();
        DataBaseConnection.insertNewInstr(items);
        DataBaseConnection.closeConnection();
    }

}
