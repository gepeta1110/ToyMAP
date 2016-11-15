package Model;
import Expressions.*;
import ProgramState.*;

public class IfStmt implements IStatement{
    Expression exp;
    IStatement thenS;
    IStatement elseS;


    IfStmt(Expression ex, IStatement t, IStatement el){
        this.exp=ex;
        this.thenS=t;
        this.elseS=el;
    }



    public String toStr(){
        return "IF(" + exp.toStr() + ")THEN(" + thenS.toStr() + ")ELSE(" + elseS.toStr() +")";
    }


    public PrgState execute(PrgState state){
        return state;
    }



}
