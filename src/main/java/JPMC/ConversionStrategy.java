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
        String firstIndexValue;
        String stringFirstIndex;

        int secondIndex;
        String secondIndexValue;
        String stringSecondIndex;

        int thirdIndex;
        String thirdIndexValue;
        String stringThirdIndex;

        int fourthIndex;
        String fourthIndexValue;
        String stringFourthIndex;

        int fifthIndex;
        String fifthIndexValue;
        String stringFifthIndex;

        int sixthIndex;
        String sixhIndexValue;
        String stringSixthIndex;

        int seventhIndex;
        String seventhIndexValue;
        String stringSeventhIndex;

        int i;

        StringBuilder stringBuilder = new StringBuilder();

        switch(valueLength) {

            case 1:         //for values with length 1
                    convertedValue = mappedData.intToString1.get(value);
                    stringBuilder.append(convertedValue).append("Dollars");
                    convertedValue = stringBuilder.toString();

                    returnedValue = convertedValue;
                    //convertedValue = null;

                break;


            case 2: { //for values with length 2

                if (intValue < 21) {

                    switch (value) {
                        case "11":
                            convertedValue = mappedData.intToString1.get("11");
                            break;
                        case "12":
                            convertedValue = mappedData.intToString1.get("12");
                            break;
                        case "13":
                            convertedValue = mappedData.intToString1.get("13");
                            break;
                        case "14":
                            convertedValue = mappedData.intToString1.get("14");
                            break;
                        case "15":
                            convertedValue = mappedData.intToString1.get("15");
                            break;
                        case "16":
                            convertedValue = mappedData.intToString1.get("16");
                            break;
                        case "17":
                            convertedValue = mappedData.intToString1.get("17");
                            break;
                        case "18":
                            convertedValue = mappedData.intToString1.get("18");
                            break;
                        case "19":
                            convertedValue = mappedData.intToString1.get("19");
                            break;
                        case "20":
                            convertedValue = mappedData.intToString2.get("2");
                        default:
                            break;
                    }

                    stringBuilder.append(convertedValue).append("Dollars");
                    returnedValue = stringBuilder.toString();
                    //return returnedValue;

                } else if (valueLength == 2 && intValue > 20) {

                    firstIndex = Integer.parseInt(String.valueOf(value.charAt(0)));
                    switch (firstIndex) {
                        case 2:
                            convertedValue = mappedData.intToString2.get("2");
                            break;
                        case 3:
                            convertedValue = mappedData.intToString2.get("3");
                            break;
                        case 4:
                            convertedValue = mappedData.intToString2.get("4");
                            break;
                        case 5:
                            convertedValue = mappedData.intToString2.get("5");
                            break;
                        case 6:
                            convertedValue = mappedData.intToString2.get("6");
                            break;
                        case 7:
                            convertedValue = mappedData.intToString2.get("7");
                            break;
                        case 8:
                            convertedValue = mappedData.intToString2.get("8");
                            break;
                        case 9:
                            convertedValue = mappedData.intToString2.get("9");
                            break;
                        default:
                            break;
                    }

                    secondIndex = Integer.parseInt(String.valueOf(value.charAt(1)));
                    secondIndexValue = Integer.toString(secondIndex);
                    stringSecondIndex = mappedData.intToString1.get(secondIndexValue);
                    stringBuilder.append(convertedValue).append(stringSecondIndex).append("Dollars");
                    returnedValue = stringBuilder.toString();


                }
            } break;

            case 3: { // for values with length 3

                firstIndex = Integer.parseInt(String.valueOf(value.charAt(0)));
                firstIndexValue = Integer.toString(firstIndex);
                stringFirstIndex = mappedData.intToString1.get(firstIndexValue);
                stringBuilder.append(stringFirstIndex).append(mappedData.intToString3.get("100"));

                secondIndex = Integer.parseInt(String.valueOf(value.charAt(1)));
                secondIndexValue = Integer.toString(secondIndex);
                stringSecondIndex = mappedData.intToString2.get(secondIndexValue);
                stringBuilder.append(stringSecondIndex);

                thirdIndex = Integer.parseInt(String.valueOf(value.charAt(2)));
                thirdIndexValue = Integer.toString(thirdIndex);
                stringThirdIndex = mappedData.intToString1.get(thirdIndexValue);
                stringBuilder.append(stringThirdIndex);

                stringBuilder.append("Dollars");
                returnedValue = stringBuilder.toString();
            } break;

            case 4: {
                firstIndex = Integer.parseInt(String.valueOf(value.charAt(0)));
                firstIndexValue = Integer.toString(firstIndex);
                stringFirstIndex = mappedData.intToString1.get(firstIndexValue);
                stringBuilder.append(stringFirstIndex).append(mappedData.intToString3.get("1000"));

                secondIndex = Integer.parseInt(String.valueOf(value.charAt(1)));
                secondIndexValue = Integer.toString(secondIndex);
                stringSecondIndex = mappedData.intToString1.get(secondIndexValue);
                stringBuilder.append(stringSecondIndex).append(mappedData.intToString3.get("100"));

                thirdIndex = Integer.parseInt(String.valueOf(value.charAt(2)));
                thirdIndexValue = Integer.toString(thirdIndex);
                stringThirdIndex = mappedData.intToString2.get(thirdIndexValue);
                stringBuilder.append(stringThirdIndex);

                fourthIndex = Integer.parseInt(String.valueOf(value.charAt(3)));
                fourthIndexValue = Integer.toString(fourthIndex);
                stringFourthIndex = mappedData.intToString1.get(fourthIndexValue);
                stringBuilder.append(stringFourthIndex);

                stringBuilder.append("Dollars");
                returnedValue = stringBuilder.toString();
            } break;

            case 5: {
                firstIndex = Integer.parseInt(String.valueOf(value.charAt(0)));
                int firstIndexA = Integer.parseInt(String.valueOf(value.charAt(1)));
                stringBuilder.append(firstIndex).append(firstIndexA);
                String firstIndexB = stringBuilder.toString();

                stringFirstIndex = mappedData.intToString1.get(firstIndexB);
                stringBuilder.delete(0,2);

                stringBuilder.append(stringFirstIndex).append(mappedData.intToString3.get("1000"));

                secondIndex = Integer.parseInt(String.valueOf(value.charAt(2)));
                secondIndexValue = Integer.toString(secondIndex);
                stringSecondIndex = mappedData.intToString1.get(secondIndexValue);
                stringBuilder.append(stringSecondIndex).append(mappedData.intToString3.get("100"));

                thirdIndex = Integer.parseInt(String.valueOf(value.charAt(3)));
                thirdIndexValue = Integer.toString(thirdIndex);
                stringThirdIndex = mappedData.intToString2.get(thirdIndexValue);
                stringBuilder.append(stringThirdIndex);

                fourthIndex = Integer.parseInt(String.valueOf(value.charAt(4)));
                fourthIndexValue = Integer.toString(fourthIndex);
                stringFourthIndex = mappedData.intToString1.get(fourthIndexValue);
                stringBuilder.append(stringFourthIndex);

                stringBuilder.append("Dollars");
                returnedValue = stringBuilder.toString();

            } break;



            default: break;
                }

        return returnedValue;
    }
}

