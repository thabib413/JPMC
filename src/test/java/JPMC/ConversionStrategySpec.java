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
        mapTest.secondMappedValues();
        String testValue = "1";

        StringBuilder sb = new StringBuilder();
        String test = sb.toString();

        sb.append("test").append("test2");
        String expectedValue = "OneDollars";
        String actualValue = testCon.conversionStrategy1(testValue,mapTest);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void conversionTestForOTwoValue(){

        ConversionStrategy testCon2 = new ConversionStrategy();

        Map mapTest = new Map();
        mapTest.secondMappedValues();
        String testValue = "11";

        StringBuilder sb = new StringBuilder();
        String test = sb.toString();

        sb.append("test").append("test2");
        String expectedValue = "NineteenDollars";

        String actualValue = testCon2.conversionStrategy1(testValue,mapTest);
        assertEquals(expectedValue, actualValue);

        firstIndex=Integer.parseInt(String.valueOf(value.charAt(0)));
    }


}
