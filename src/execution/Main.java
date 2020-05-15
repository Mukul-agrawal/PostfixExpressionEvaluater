package execution;

import defination.PostfixEvaluator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PostfixEvaluator.SyntaxErrorException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter postfix Expression : ");
        String expression = scanner.nextLine();
        PostfixEvaluator postfixEvaluator = new PostfixEvaluator();
        System.out.println(postfixEvaluator.eval(expression));
    }
}
