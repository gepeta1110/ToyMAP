package Model;
import Expressions.*;
import ProgramState.*;

public class PrintStmt implements IStatement {

    Expression exp;

    public PrintStmt(Expression exp){
        this.exp = exp;
    }


    public String toStr(){
        return "print(" + exp.toStr() + ")";
    }


    public PrgState execute(PrgState state){
        return state;
    }

}
