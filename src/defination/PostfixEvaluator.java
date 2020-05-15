package defination;

import adt.EvaluateADT;

import java.util.Deque;

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
    public String eval(String expression) {
        return null;
    }
}
