package ReviewWednesday;

import java.util.ArrayList;

public class Review_10122022 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 8;
//
//        if (a > b) {
//            System.out.println("option 1");
//        } else if (b < a) {
//            System.out.println("option 2");
//        } else if (a == b) {
//            System.out.println("option 3");
//        } else if ((a + 3) == b) {
//            System.out.println("option 4");
//        } else if ((b - 1) >= (a + 2)) {
//            System.out.println("option 5");
//        }

//        ArrayList<String> countries = new ArrayList<>();
//        countries.add("USA");
//        countries.add("Mexico");
//        countries.add("Canada");
//
//        if (countries.get(0).equals("USA") && countries.get(2).equals("Canada")) {
//            System.out.println("Option 1");
//        } else if (countries.get(0).equals("USA") || countries.get(1).equals("Canada")) {
//            System.out.println("Option 2");
//        }

        //define automation string variable
        String subjectLine = "Automation_AI10";

        //As a professor, I would like to see only the action item number
        //might be useful to use split method
        //how could you grab the number portion of the second part of the string
        //expected result should be 05

        //split the string
        String[] splitMessageArray = subjectLine.split("_");
        //take the second string from the array then grab the number only
        String actionItemNumber = splitMessageArray[1].substring( 2,4);

        //print out John to the console
        System.out.println("The action number item is " + actionItemNumber);
        if(actionItemNumber.equals("10")){
            System.out.println("the number is 10");
        }

    }

    // you only have two option
    //option 1 - withdraw
    //option 2 - is deposit

}

