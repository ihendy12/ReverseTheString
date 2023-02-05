import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please type the word or sentence you would like to reverse: ");
        String whatToReverse = userInput.nextLine();

        char r;
        String reversed = "";

        System.out.println("Original Word = " + whatToReverse);
        for (int i = 0; i < whatToReverse.length(); i++){
            r = whatToReverse.charAt(i);
            reversed = r + reversed;
        }
        System.out.println("The reverse of this is: " + reversed);
    }


}