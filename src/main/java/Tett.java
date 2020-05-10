import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
тестовый для определения правильности ссылок
 */

public class Tett {
    public static void main(String[] args) throws IOException {
        LinkParser parser = new LinkParser();
        ArrayList<String> ostatkido = new ArrayList<>(parser.getUrls());
        ArrayList<String> ostatki = new ArrayList<>();
        for (String s: ostatkido
             ) {
            ostatki.add("vseinstrumenti.ru" + s);

        }

       // System.out.println(ostatki);
        ostatki.removeAll(GetItems.essentialGoodsLinks);
        ostatki.removeAll(GetItems.instrumentLinks);
        ostatki.removeAll(GetItems.ruchnoyInstrLinks);
        ostatki.removeAll(GetItems.sadovayaTechnikaLinks);
        ostatki.removeAll(GetItems.silovayaTechnikaLinks);
        ostatki.removeAll(GetItems.stankiLinks);
        ostatki.removeAll(GetItems.autoGarageItemLinks);
        ostatki.removeAll(GetItems.santechnikaLinks);
        ostatki.removeAll(GetItems.krepezhLinks);
        ostatki.removeAll(GetItems.rashodnyeMaterLinks);
        ostatki.removeAll(GetItems.electrikaLinks);
        ostatki.removeAll(GetItems.klimatLinks);
        ostatki.removeAll(GetItems.otdyhLinks);
        ostatki.removeAll(GetItems.sroyTechnikLinks);
        ostatki.removeAll(GetItems.uborkaLinks);
        ostatki.removeAll(GetItems.spetsodezdaLinks);
        ostatki.removeAll(GetItems.bezopasnostLinks);
        File file = new File("ostatki.txt");
        File file1 = new File("perpom.txt");
        File file2 = new File("instrument.txt");
        File file3 = new File("ruchnoyinstr.txt");
        File file4 = new File("sadov.txt");
        File file5 = new File("silovaya.txt");
        File file6 = new File("satnki.txt");
        File file7 = new File("garage.txt");
        File file8 = new File("santechnika.txt");
        File file9 = new File("krepezh.txt");
        File file10 = new File("rashodniki.txt");
        File file11 = new File("electrika.txt");
        File file12 = new File("klimat.txt");
        File file13 = new File("otdyh.txt");
        File file14 = new File("stroytechika.txt");
        File file15 = new File("uborka.txt");
        File file16 = new File("spetsodezda.txt");
        File file17 = new File("bezopasnost.txt");
        FileWriter fw = new FileWriter(file);
        FileWriter fw1 = new FileWriter(file1);
        FileWriter fw2 = new FileWriter(file2);
        FileWriter fw3 = new FileWriter(file3);
        FileWriter fw4 = new FileWriter(file4);
        FileWriter fw5 = new FileWriter(file5);
        FileWriter fw6 = new FileWriter(file6);
        FileWriter fw7 = new FileWriter(file7);
        FileWriter fw8 = new FileWriter(file8);
        FileWriter fw9 = new FileWriter(file9);
        FileWriter fw10 = new FileWriter(file10);
        FileWriter fw11 = new FileWriter(file11);
        FileWriter fw12 = new FileWriter(file12);
        FileWriter fw13 = new FileWriter(file13);
        FileWriter fw14 = new FileWriter(file14);
        FileWriter fw15 = new FileWriter(file15);
        FileWriter fw16 = new FileWriter(file16);
        FileWriter fw17 = new FileWriter(file17);
        for (String s: ostatki
             ) {
            fw.write(s);
            fw.write("\n");
        }

        for (String s:
                GetItems.essentialGoodsLinks
             ){
            fw1.write(s);
            fw1.write("\n");
        }

        System.out.println(GetItems.essentialGoodsLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.instrumentLinks)
        {
            fw2.write(s);
            fw2.write("\n");
        }
        System.out.println(GetItems.instrumentLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.ruchnoyInstrLinks)
        {
            fw3.write(s);
            fw3.write("\n");
        }
        System.out.println(GetItems.ruchnoyInstrLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.sadovayaTechnikaLinks)
        {
            fw4.write(s);
            fw4.write("\n");
        }
        System.out.println(GetItems.sadovayaTechnikaLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.silovayaTechnikaLinks)
        {
            fw5.write(s);
            fw5.write("\n");
        }
        System.out.println(GetItems.silovayaTechnikaLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.stankiLinks)
        {
            fw6.write(s);
            fw6.write("\n");
        }
        System.out.println(GetItems.stankiLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.autoGarageItemLinks)
        {
            fw7.write(s);
            fw7.write("\n");
        }
        System.out.println(GetItems.autoGarageItemLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.santechnikaLinks)
        {
            fw8.write(s);
            fw8.write("\n");
        }
        System.out.println(GetItems.santechnikaLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.krepezhLinks)
        {
            fw9.write(s);
            fw9.write("\n");
        }
        System.out.println(GetItems.krepezhLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.rashodnyeMaterLinks)
        {
            fw10.write(s);
            fw10.write("\n");
        }
        System.out.println(GetItems.rashodnyeMaterLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.electrikaLinks)
        {
            fw11.write(s);
            fw11.write("\n");
        }
        System.out.println(GetItems.electrikaLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.klimatLinks)
        {
            fw12.write(s);
            fw12.write("\n");
        }
        System.out.println(GetItems.klimatLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.otdyhLinks)
        {
            fw13.write(s);
            fw13.write("\n");
        }
        System.out.println(GetItems.otdyhLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.sroyTechnikLinks)
        {
            fw14.write(s);
            fw14.write("\n");
        }
        System.out.println(GetItems.sroyTechnikLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.uborkaLinks)
        {
            fw15.write(s);
            fw15.write("\n");
        }
        System.out.println(GetItems.uborkaLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.spetsodezdaLinks)
        {
            fw16.write(s);
            fw16.write("\n");
        }
        System.out.println(GetItems.spetsodezdaLinks.size());
        System.out.println("______________________________________________________________________");

        for (String s: GetItems.bezopasnostLinks)
        {
            fw17.write(s);
            fw17.write("\n");
        }
        System.out.println(GetItems.bezopasnostLinks.size());

        fw.close();
        fw1.close();
        fw2.close();
        fw3.close();
        fw4.close();
        fw5.close();
        fw6.close();
        fw7.close();
        fw8.close();
        fw9.close();
        fw10.close();
        fw11.close();
        fw12.close();
        fw13.close();
        fw14.close();
        fw15.close();
        fw16.close();
        fw17.close();
















    }
}
