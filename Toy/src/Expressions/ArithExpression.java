package Expressions;
import Exceptions.EmptyListException;
import TheDicts.*;


public class ArithExpression implements Expression {
    Expression exp1, exp2;
    int operation;

    ArithExpression(Expression e1, Expression e2, int operation){
        this.exp1=e1;
        this.exp2=e2;
        this.operation=operation;
    }

    public int evaluate(TheDict<String,Integer> table) throws EmptyListException {
        if (operation == 1)
            return (exp1.evaluate(table) + exp2.evaluate(table));
        else if (operation == 2)
            return (exp1.evaluate(table) - exp2.evaluate(table));
        else if (operation == 3)
            return (exp1.evaluate(table) * exp2.evaluate(table));
        else if (operation == 4)
            return (exp1.evaluate(table) / exp2.evaluate(table));
        else
            return -1;
    }


    public String toStr(){
        if(operation==1)
            return exp1.toStr() + "+" + exp2.toStr();
        else if(operation==2)
            return exp1.toStr() + "-" + exp2.toStr();
        else if(operation==3)
            return exp1.toStr() + "*" + exp2.toStr();
        else if(operation==4)
            return exp1.toStr() + "/" + exp2.toStr();
        return "";
    }
}
