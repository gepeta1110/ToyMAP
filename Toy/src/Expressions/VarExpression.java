package Expressions;
import Exceptions.EmptyListException;
import TheDicts.*;


public class VarExpression implements Expression {
    String id;

    public VarExpression(String id){this.id=id;}

    public int evaluate(TheDict<String,Integer> table)throws EmptyListException{
        return table.lookup(id);
    }

    public String toStr(){
        return this.id;
    }
}
