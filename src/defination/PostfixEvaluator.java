package defination;

import adt.EvaluateADT;

import java.util.Deque;

public class PostfixEvaluator implements EvaluateADT {
    @Override
    public int evalOperation(char operator, Deque<Integer> operandStack) {
        return 0;
    }

    @Override
    public boolean isOperator(char ch) {
        return false;
    }

    @Override
    public String eval(String expression) {
        return null;
    }
}
