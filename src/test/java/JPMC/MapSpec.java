package JPMC;

import org.junit.Test;

/**
 * Created by taiseerhabib on 6/9/16.
 */
public class MapSpec {
    @Test
    public void intTest1 (){
        Map testMap = new Map();
        testMap.firstMappedValues();
        String exp = "One";
        String act = testMap.intToString1.get("1");
        System.out.println(act);
    }

    @Test
    public void intTest2 (){
        Map testMap = new Map();
        testMap.secondMappedValues();
        String exp = "Twenty";
        String act = testMap.intToString2.get("2");
        System.out.println(act);
    }

    @Test
    public void intTest3 (){
        Map testMap = new Map();
        testMap.thirdMappedValues();
        String exp = "Hundred";
        String act = testMap.intToString3.get("100");
        System.out.println(act);
    }


}
