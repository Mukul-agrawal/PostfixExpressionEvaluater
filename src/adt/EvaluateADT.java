package adt;

import defination.PostfixEvaluator;

import java.util.Deque;

public interface EvaluateADT {
    int evalOperation(char operator, Deque<Integer> operandStack);

    boolean isOperator(char ch);

    String eval(String expression) throws PostfixEvaluator.SyntaxErrorException;
}
