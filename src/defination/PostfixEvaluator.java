package defination;

import adt.EvaluateADT;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class PostfixEvaluator implements EvaluateADT {
    @Override
    public int evalOperation(char operator, Deque<Integer> operandStack) {
        int rhs = operandStack.pop();
        int lhs = operandStack.pop();
        int result = 0;
        switch (operator) {
            case '+':
                result = lhs + rhs;
                break;
            case '‐':
                result = lhs - rhs;
                break;
            case '/':
                result = lhs / rhs;
                break;
            case '*':
                result = lhs * rhs;
                break;
        }
        return result;
    }

    @Override
    public boolean isOperator(char ch) {
        String OPERATORS = "+-*/";
        return OPERATORS.indexOf(ch) != -1;
    }

    @Override
    public String eval(String expression) throws SyntaxErrorException {
        Deque<Integer> operandStack = new ArrayDeque<>();
        String[] tokens = expression.split("\\s+");
        try {
            for (String nextToken : tokens) {
                char firstChar = nextToken.charAt(0);
                if (Character.isDigit(firstChar)) {
                    int value = Integer.parseInt(nextToken);
                    operandStack.push(value);
                } else if (isOperator(firstChar)) {
                    int result = evalOperation(firstChar, operandStack);
                    operandStack.push(result);
                } else {
                    throw new SyntaxErrorException("Invalid character encountered: " + firstChar);
                }
            }
            operandStack.pop();
            if (operandStack.isEmpty()) {
                return "Postfix expression is correct.";
            } else {
                return "Postfix expression is not correct.";
            }
        } catch (NoSuchElementException ex) {
            throw new SyntaxErrorException("Syntax Error: Stack is empty");
        }
    }

    public static class SyntaxErrorException extends Exception {
        SyntaxErrorException(String message) {
            super(message);
        }
    }
}


