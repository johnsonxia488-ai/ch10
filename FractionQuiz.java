import java.util.Scanner;

public class FractionQuiz
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] List = {"+", "-", "*", "/"};
        int correct = 0;
        int total = 0;
        boolean keepGoing = true;

        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");

        while(keepGoing){
            Fraction1 a = new Fraction1();
            Fraction1 b = new Fraction1();
            String op = List[(int)(Math.random() * 4)];
            Fraction1 ans;

            if(op.equals("+")) ans = Fraction1.add(a,b);
            else if(op.equals("-")) ans = Fraction1.sub(a,b);
            else if(op.equals("*")) ans = Fraction1.mult(a,b);
            else ans = Fraction1.div(a,b);

            System.out.print(a + " " + op + " " + b + " = ");
            String input = in.nextLine();

            if(input.equalsIgnoreCase("quit")) {
                keepGoing = false;
            } else {
                Fraction1 user = new Fraction1(input);
                total++;

                if(user.equals(ans)) {
                    System.out.println("Correct!");
                    correct++;
                } else {
                    System.out.println("Wrong, the answer was " + ans);
                }
            }
        }

        Fraction1 score = new Fraction1(correct, total);
        int percent = (int)(100.0 * correct / total);
        System.out.println("You answered " + score + " correctly, for a score of " + percent + " percent!");
        in.close();
    }
}

