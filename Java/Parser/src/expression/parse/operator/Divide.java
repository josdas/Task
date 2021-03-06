package expression.parse.operator;

import expression.exception.ParsingException;
import expression.parse.AbstractBinaryOperator;
import expression.parse.operators.Operation;
import expression.parse.TripleExpression;

/**
 * Created by Stas on 28.03.2017.
 */
public class Divide<T> extends AbstractBinaryOperator<T> {
    public Divide(TripleExpression<T> a, TripleExpression<T> b, Operation<T> op) {
        super(a, b, op);
    }

    protected T operator(T a, T b) throws ParsingException {
        return operation.div(a, b);
    }
}
