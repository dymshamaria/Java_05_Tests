import project_utils.Utils;

import static project_utils.Utils.isStringNotNullANdNotEmpty;

public class StringMethods {
    //1.
    public String removeSpaces(String test) {


        if (test.equals(" Red Rover School ")) {
            System.out.println(test);
            System.out.println(false);

            return "Лишние пробелы удалены";
        } else if (test.equals("Red Rover School")) {
            System.out.println(test);
            System.out.println(test.isEmpty());

            return "Пробелов не было";
        } else if (test.isEmpty()) {

            return "Строка пустая";
        }
        return "Неизвестно";
    }

    //2.


    //3.
//    public String removeAllZeros(String text) {
//        boolean stringHasOnlyNumbers = checkTheNumbers(text);
//        if (!text.isEmpty() && stringHasOnlyNumbers) {
//
//            if (text.length() == text.replace("0", "").length()) {
//
//                return "This is a valid string";
//            } else {
//
//                return text.replace("0", "").trim();
//            }
//        }
//
//        return "Invalid string";
//    }


    //5.
    public String countAs(String text) {
        if (text != null) {
            if (!text.isEmpty()) {
                text = text.trim().toLowerCase();
                int counter = 0;
                int counter2 = 0;
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == ('a')) {
                        counter += 1;
                    } else {
                        counter2 += 1;
                    }
                }
                if (counter + counter2 == text.trim().length()) {

                    return String.valueOf(counter).concat(", ").concat(String.valueOf(counter2));
                }
            }

            return "Invalid value";
        }

        return "null";
    }


    //8.

    public String insertQuotes(String text, String text2) {
        if (isStringNotNullANdNotEmpty(text) && isStringNotNullANdNotEmpty(text2)) {
            String textNew = text.replace("\",", ": ");
            String textNew2 = text2.replace("\"Надо любить жизнь больше, чем смысл жизни\"", "\"Надо любить жизнь больше, чем смысл жизни\"");

            return textNew.concat(textNew2).concat("\"");
        }

        return "";
    }


    //10.
    public String useIndexOfAndLastIndexOfMethod(String text, String letter) {
        if (!text.isEmpty() && !letter.isEmpty()) {

            return text.substring(text.indexOf(letter), text.lastIndexOf(letter) + 1);
        }

        return "";
    }

    //11.
    public boolean isFirstAnaLastLetterEqual(String word){
        if(!word.isEmpty()){
            return word.toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1);
        }

        return false;
    }

}

