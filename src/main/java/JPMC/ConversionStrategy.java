package JPMC;

/**
 * Created by taiseerhabib on 6/9/16.
 */
public class ConversionStrategy {

    Map mappedData = new Map();


    public String conversionStrategy1(String value, Map mappedData) {

        mappedData.firstMappedValues();
        mappedData.secondMappedValues();
        mappedData.thirdMappedValues();
        String convertedValue=" ";
        String returnedValue=" ";


        int intValue = Integer.parseInt(value);
        int valueLength = String.valueOf(value).length();
        int firstIndex;
        String stringFirstIndex;
        int secondIndex;
        String stringSecondIndex;
        int thirdIndex;
        String stringThirdIndex;
        int fourthIndex;

        int i;

        switch(valueLength) {

            case 1:         //for values with length 1
                if (valueLength == 1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    convertedValue = mappedData.intToString1.get(value);
                    stringBuilder.append(convertedValue).append("Dollars");
                    convertedValue = stringBuilder.toString();

                    returnedValue = convertedValue;
                    convertedValue = null;
                    stringBuilder = null;
                }

            case 2: //for values with length 2


                if (valueLength==2 && intValue > 19){
                    StringBuilder stringBuilder = new StringBuilder();
                    switch(value) {
                            case "11": convertedValue = mappedData.intToString1.get(value);
                            case "12": convertedValue = mappedData.intToString1.get(value);
                            case "13": convertedValue = mappedData.intToString1.get(value);
                            case "14": convertedValue = mappedData.intToString1.get(value);
                            case "15": convertedValue = mappedData.intToString1.get(value);
                            case "16": convertedValue = mappedData.intToString1.get(value);
                            case "17": convertedValue = mappedData.intToString1.get(value);
                            case "18": convertedValue = mappedData.intToString1.get(value);
                            case "19": convertedValue = mappedData.intToString1.get(value);
                            default: break;
                        }

                        stringBuilder.append(convertedValue).append("Dollars");
                        returnedValue = stringBuilder.toString();
                        return returnedValue;
                    } else {

                    firstIndex=Integer.parseInt(String.valueOf(value.charAt(0)));

                }

            case 3: // for values with length 3

                if(valueLength == 3){
                    StringBuilder stringBuilder = new StringBuilder();
                    firstIndex = Integer.parseInt(String.valueOf(value.charAt(0)));
                    stringFirstIndex = mappedData.intToString3.get(firstIndex);
                    stringBuilder.append(stringFirstIndex);

                    secondIndex = Integer.parseInt(String.valueOf(value.charAt(1)));
                    stringSecondIndex = mappedData.intToString2.get(secondIndex);
                    stringBuilder.append(stringSecondIndex);

                    thirdIndex = Integer.parseInt(String.valueOf(value.charAt(2)));
                    stringThirdIndex = mappedData.intToString1.get(thirdIndex);
                    stringBuilder.append(stringThirdIndex);

                }
            default: break;
                }

        return returnedValue;
    }
}

        /*
        for(i=0; i<value.length(); i++){
            char indexedValue = value.charAt(i);
            String testString = String.valueOf(indexedValue);

            convertedValue = mappedData.intToString.get(testString);
            stringBuilder.append(convertedValue);
            if(i<value.length()-1){
                stringBuilder.append(" ");
            }
        }
        returnedValue = stringBuilder.toString();
        return returnedValue;

    }


}
*/

 /*
                    stringFirstIndex = Integer.toString(firstIndex);
                    convertedValue = mappedData.intToString.get(stringFirstIndex);
                    secondIndex = Integer.parseInt(String.valueOf(value.charAt(1)));
                    stringSecondIndex = Integer.toString(secondIndex);
                    */
