import java.util.Scanner;
public class ternaryOperator
{
    static void main(String[] args)
    {
        // variable = (condition) ? ifTrue : ifFalse
        Scanner scanner = new Scanner(System.in);
        //int score = 70;
        //String passOrFail = (score >= 70) ? "PASS" : "FAIL";
        //System.out.println(passOrFail);

        //int num = 0;

        //String evenOrOdd = (num % 2 == 0) ? "EVEN" : "ODD";
        //System.out.println(evenOrOdd);

        //int income = 30000;
        //double taxRate = (income >= 40000) ? 0.25 : 0.15;
        //System.out.printf("Your Income is: %,d\nSo your tax will be %.2f", income, taxRate);

        int overRated = 10;
        int Count;
        System.out.print("How much did you order?: ");
        Count = scanner.nextInt();
        System.out.printf("Order at : x%,d\n", Count);
        String overRatedOrNot = (10 >= Count) ? "Is under the System limit." : "Over the System Limit!.";
        
        if(overRated <= Count)
        {
            System.out.println(overRatedOrNot);
        }
        else
        {
            System.out.println(overRatedOrNot);
        }
        scanner.close();
    }
}
