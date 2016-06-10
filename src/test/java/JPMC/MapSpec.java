package JPMC;

import org.junit.Assert;
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
        Assert.assertEquals(exp, act);
    }

    @Test
    public void intTest2 (){
        Map testMap = new Map();
        testMap.secondMappedValues();
        String exp = "Twenty";
        String act = testMap.intToString2.get("2");
        Assert.assertEquals(exp, act);
    }

    @Test
    public void intTest3 (){
        Map testMap = new Map();
        testMap.thirdMappedValues();
        String exp = "Billion";
        String act = testMap.intToString3.get("1000000000");
        Assert.assertEquals(exp, act);
    }


}
