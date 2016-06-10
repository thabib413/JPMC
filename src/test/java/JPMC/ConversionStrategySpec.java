package JPMC;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by taiseerhabib on 6/9/16.
 */
public class ConversionStrategySpec {
    @Test
    public void conversionTest(){
        int numberTest = 1234;
        String numberString = String.valueOf(numberTest);
        int numberLength = String.valueOf(numberTest).length();

        for(int j=0; j<4; j++) {
            int numberIndexValue = Integer.parseInt(String.valueOf(numberString.charAt(j)));
            System.out.println(numberIndexValue);
        }
    }

    @Test
    public void conversionTestForOneValue(){

        ConversionStrategy testCon = new ConversionStrategy();

        Map mapTest = new Map();
        mapTest.firstMappedValues();
        String testValue = "20";
        int intValue = Integer.parseInt(testValue);
        String expectedValue = "TwentyDollars";
        String actualValue = testCon.conversionStrategy1(testValue,mapTest);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void conversionTestForTwoValue(){

        ConversionStrategy testCon2 = new ConversionStrategy();

        int firstIndex = 0;

        Map mapTest = new Map();
        mapTest.secondMappedValues();
        String testValue = "99";

        StringBuilder sb = new StringBuilder();
        String test = sb.toString();

        sb.append("test").append("test2");
        String expectedValue = "NinetyNineDollars";

        String actualValue = testCon2.conversionStrategy1(testValue,mapTest);
        assertEquals(expectedValue, actualValue);

        firstIndex=Integer.parseInt(String.valueOf(testValue.charAt(0)));
        //System.out.println(actualValue);
    }



    @Test
    public void conversionTestForThreeValue(){

        ConversionStrategy testCon3 = new ConversionStrategy();

        int firstIndex = 0;

        Map mapTest = new Map();
        mapTest.secondMappedValues();
        String testValue = "923";

        StringBuilder sb = new StringBuilder();
        String test = sb.toString();

        sb.append("test").append("test2");
        String expectedValue = "NineHundredTwentyThreeDollars";

        String actualValue = testCon3.conversionStrategy1(testValue,mapTest);
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void conversionTestForFourValue(){

        ConversionStrategy testCon4 = new ConversionStrategy();

        int firstIndex = 0;

        Map mapTest = new Map();
        mapTest.secondMappedValues();
        String testValue = "1234";

        StringBuilder sb = new StringBuilder();
        String test = sb.toString();

        sb.append("test").append("test2");
        String expectedValue = "OneThousandTwoHundredThirtyFourDollars";

        String actualValue = testCon4.conversionStrategy1(testValue,mapTest);
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void conversionTestForFiveValue(){

        ConversionStrategy testCon5 = new ConversionStrategy();

        int firstIndex = 0;

        Map mapTest = new Map();
        mapTest.secondMappedValues();
        String testValue = "12345";

        StringBuilder sb = new StringBuilder();
        String test = sb.toString();

        sb.append("test").append("test2");
        String expectedValue = "TwelveThousandThreeHundredFortyFiveDollars";

        String actualValue = testCon5.conversionStrategy1(testValue,mapTest);
        assertEquals(expectedValue, actualValue);
    }

}
