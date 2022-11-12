package Day2_10022022;

import java.util.ArrayList;

public class T3_ForLoop_ArrayList {
    public static void main(String[] args) {
        //declare and define the arrayList for zip code
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11218");
        zipCode.add("10001");
        zipCode.add("11219");
        zipCode.add("11230");

        //call for loop to print out all zip code values from the array list
        for (int i = 0; i < zipCode.size(); i++) {
            System.out.println("i is now: " + i);
            //print out each zip code automatically
            System.out.println("Zip Code: " + zipCode.get(i));

        }//end of for loop
    }//end of main
}//end of java class
