import java.util.Set;
import java.util.TreeSet;

public class GetItems {
    private static final LinkParser linkParser = new LinkParser();

    static final Set<String> essentialGoodsLinks = new TreeSet<>();
    static final Set<String> instrumentLinks = new TreeSet<>();
    static final Set<String> ruchnoyInstrLinks = new TreeSet<>();
    static final Set<String> sadovayaTechnikaLinks = new TreeSet<>();
    static final Set<String> silovayaTechnikaLinks = new TreeSet<>();
    static final Set<String> stankiLinks = new TreeSet<>();
    static final Set<String> autoGarageItemLinks = new TreeSet<>();
    static final Set<String> santechnikaLinks = new TreeSet<>();
    static final Set<String> krepezhLinks = new TreeSet<>();
    static final Set<String> rashodnyeMaterLinks = new TreeSet<>();
    static final Set<String> electrikaLinks = new TreeSet<>();
    static final Set<String> klimatLinks = new TreeSet<>();
    static final Set<String> otdyhLinks = new TreeSet<>();
    static final Set<String> sroyTechnikLinks = new TreeSet<>();
    static final Set<String> uborkaLinks = new TreeSet<>();
    static final Set<String> spetsodezdaLinks = new TreeSet<>();
    static final Set<String> bezopasnostLinks = new TreeSet<>();

   static  {
       for (String s: linkParser.getUrls()){
           if (s.matches("^/tovary[_\\-]pervoj[_\\-]neobhodimosti/.*"))
               essentialGoodsLinks.add("vseinstrumenti.ru" + s);
           if (s.matches("^/instrument/.*"))
               instrumentLinks.add("vseinstrumenti.ru" + s);
           if (s.matches("^/ruchnoy[_\\-]instrument/.*"))
               ruchnoyInstrLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/sadovaya[_\\-]tehnika/.*"))
               sadovayaTechnikaLinks.add("vseinstrumenti.ru" + s);
           if (s.matches("^/silovaya[_\\-]tehnika/.*"))
               silovayaTechnikaLinks.add("vseinstrumenti.ru" + s);
           if (s.matches("^/stanki/.*"))
               stankiLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/avtogarazhnoe[_\\-]oborudovanie/.*"))
               autoGarageItemLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/santehnika/.*"))
               santechnikaLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/krepezh/.*"))
               krepezhLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/rashodnie[_\\-]materialy/.*"))
               rashodnyeMaterLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/electrika[_\\-]i[_\\-]svet/.*"))
               electrikaLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/klimat/.*"))
               klimatLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/otdyh[_\\-]i[_\\-]sport/.*"))
               otdyhLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("(^/stroitelnaya[_\\-]tehnika[_\\-]i[_\\-]oborudovanie/).*|(^/stroitelnoe[_\\-]oborudovanie/).*"))
               sroyTechnikLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/uborka/.*"))
               uborkaLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/spetsodezhda/.*"))
              spetsodezdaLinks.add("vseinstrumenti.ru" + s);
           if(s.matches("^/bezopasnost/.*"))
              bezopasnostLinks.add("vseinstrumenti.ru" + s);
       }
    }




//    static List<String> getEssentialGoods() {
//        List<String> list = new ArrayList<>();
//        for (String s : linkParser.getUrls()) {
//            if (s.contains("/tovary-pervoj-neobhodimosti/"))
//                list.add(s);
//        }
//        return list;
//    }
//
//    private static List<String> getInstrument() {
//        List<String> list = new ArrayList<>();
//        for (String s : linkParser.getUrls()) {
//            if (s.contains("/instrument/"))
//                list.add(s);
//        }
//        return list;
//    }
//
//    private static List<String> getRuchnoyInstr() {
//        List<String> list = new ArrayList<>();
//        for (String s : linkParser.getUrls()) {
//            if (s.contains("/ruchnoy_instrument/"))
//                list.add(s);
//        }
//        return list;
//    }
//
//    public static List<String> getSadTech() {
//        List<String> list = new ArrayList<>();
//        for (String s : linkParser.getUrls()) {
//            if (s.contains("/sadovaya_tehnika/"))
//                list.add(s);
//        }
//        return list;
//    }
//    public static List<String> getSilovayaTech() {
//        List<String> list = new ArrayList<>();
//        for (String s : linkParser.getUrls()) {
//            if (s.contains("/silovaya_tehnika/"))
//                list.add(s);
//        }
//        return list;
//    }
//    public static List<String> getStanki() {
//        List<String> list = new ArrayList<>();
//        for (String s : linkParser.getUrls()) {
//            if (s.contains("/stanki/"))
//                list.add(s);
//        }
//        return list;
//    }
//    public static List<String> getAutoGarageItems() {
//        List<String> list = new ArrayList<>();
//        for (String s : linkParser.getUrls()) {
//            if (s.contains("/avtogarazhnoe_oborudovanie/"))
//                list.add(s);
//        }
//        return list;
//    }



}

