package ReviewWednesday;

public class review_11092022 {
    public static void main(String[] args) {
        String name = "First.Last";

        String[] splitMessage = name.split(".");
        System.out.println("My last name is " + splitMessage[1]);
    }
}
