package alphatoint;

import java.util.Scanner;

/**
 * @author jonathanchristie
 */
public class AlphaToInt {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Please enter an integer between 1-26: \n");
        int alphabetInt = user_input.nextInt();
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        System.out.print("Letter " + alphabetInt + " is: " + alpha[alphabetInt - 1] + "\n");
    }

}
