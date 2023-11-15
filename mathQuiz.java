/*Angela M.
 *11/02/23
 */

import java.util.Scanner;

public class mathQuiz {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        //hard question = multiplication , easy question = addition
        System.out.println("Do you want a hard question or an easy question?");
        String userAnswer = userInput.nextLine();

        //declare constants
        int max = 10;
        int min = 1;
        int range = max - min; 

        int x = (int) (Math.random()*range+min);
        int y = (int) (Math.random()*range+min);

        if (userAnswer.equals("easy")) {
            System.out.print(x + " + " + y + " = ");
            int sum = x + y;
            System.out.println(sum);
        } else if (userAnswer.equals("hard")) {
            System.out.print(x + " * " + y + " = ");
            int product = x*y;
            System.out.println(product);
        }


        // System.out.println("Hi, my name is Angela.");
        // System.out.println("Robotics is fun!");

        // int firstInteger = 5;
        // int secondInteger = 7;
        // int sum = firstInteger + secondInteger;
        // //System.out.println(sum);
    }
}
