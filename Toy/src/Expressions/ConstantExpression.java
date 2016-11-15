package Expressions;
import TheDicts.*;

public class ConstantExpression implements Expression {
    int number;

    public ConstantExpression(int number){this.number=number;}

    public int evaluate(TheDict<String,Integer> table){
        return this.number;
    }

    public String toStr(){
        return "" + number;
    }
}
