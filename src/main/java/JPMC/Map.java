package JPMC;

import java.util.HashMap;

/**
 * Created by taiseerhabib on 6/9/16.
 */
public class Map {

    HashMap<String, String> intToString1 = new HashMap<String, String>();
    String zero = "Zero";
    String one = "One";
    String two = "Two";
    String three = "Three";
    String four = "Four";
    String five = "Five";
    String six = "Six";
    String seven = "Seven";
    String eight = "Eight";
    String nine = "Nine";
    String ten = "Ten";

    String eleven = "Eleven";
    String twelve = "Twelve";
    String thirteen = "Thirteen";
    String fourteen = "Fourteen";
    String fifteen = "Fifteen";
    String sixteen = "Sixteen";
    String seventeen = "Seventeen";
    String eighteen = "Eighteen";
    String nineteen = "Nineteen";

    HashMap<String, String> intToString2 = new HashMap<String, String>();

    String twenty = "Twenty";
    String thirty = "Thirty";
    String forty = "Forty";
    String fifty = "Fifty";
    String sixty = "Sixty";
    String seventy = "Seventy";
    String eighty = "Eighty";
    String ninety = "Ninety";

    HashMap<String, String> intToString3 = new HashMap<String, String>();

    String hundred = "Hundred";
    String thousand = "Thousand";
    String million = "Million";
    String billion = "Billion";

    public void firstMappedValues() {
        intToString1.put("0", zero);
        intToString1.put("1", one);
        intToString1.put("2", two);
        intToString1.put("3", three);
        intToString1.put("4", four);
        intToString1.put("5", five);
        intToString1.put("6", six);
        intToString1.put("7", seven);
        intToString1.put("8", eight);
        intToString1.put("9", nine);
        intToString1.put("10", ten);
        intToString1.put("11", eleven);
        intToString1.put("12", twelve);
        intToString1.put("13", thirteen);
        intToString1.put("14", fourteen);
        intToString1.put("15", fifteen);
        intToString1.put("16", sixteen);
        intToString1.put("17", seventeen);
        intToString1.put("18", eighteen);
        intToString1.put("19", nineteen);
    }

    public void secondMappedValues() {

        intToString2.put("2", twenty);
        intToString2.put("3", thirty);
        intToString2.put("4", forty);
        intToString2.put("5", fifty);
        intToString2.put("6", sixty);
        intToString2.put("7", seventy);
        intToString2.put("8", eighty);
        intToString2.put("9", ninety);
    }

    public void thirdMappedValues(){
        intToString3.put("100", hundred);
        intToString3.put("1000", thousand);
        intToString3.put("1000000", million);
        intToString3.put("1000000000", billion);
    }


}
