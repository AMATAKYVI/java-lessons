import java.util.Scanner;

public class ConditionalExpression {
    public static void main(String[] args) {
        // this is like the conditional statement, except right now it an expression instead

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Are you sure you know about ConditionalExpression?");
        System.out.println("Yes----OR-----NO");
        String inputValue = keyboard.nextLine();

        String valueOfInput = inputValue.equals("yes") ? "yes I know about conditional expression"
                : "No I do not know about the conditional expression";
        System.out.println(valueOfInput);
    }
}
