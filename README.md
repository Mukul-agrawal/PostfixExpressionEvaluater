# Postfix Expression Evaluater
In a postfix expression, the operands precede the operators. A stack is the perfect place
to save the operands until the operator is scanned. When the operator is scanned, its
operands can be popped off the stack (the last operand scanned, i.e., the right operand,
will be popped first). Therefore, our program will push each integer operand onto
the stack. When an operator is read, the top two operands are popped, the operation
is performed on its operands, and the result is pushed back onto the stack. The final
result should be the only value remaining on the stack when the end of the expression
is reached.

Methods          | Bhavior
--------           |  ---------------
public static int eval(String expression)  | Returns the value of expression
private static int evalOp(char op,Deque<Integer> operandStack) | Pops two operands and applies operator op to its operands, returning the                                                                            result
private static boolean isOperator(char ch) | Returns true if ch is an operator symbol
