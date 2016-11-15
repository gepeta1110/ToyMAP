package Expressions;
import Exceptions.EmptyListException;
import TheDicts.*;

public interface Expression {
    public int evaluate(TheDict<String, Integer> table)throws EmptyListException;
    public String toStr();
}
