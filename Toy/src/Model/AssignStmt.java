package Model;
import Exceptions.EmptyListException;
import Exceptions.FullListException;
import Expressions.*;
import ProgramState.*;
import TheDicts.*;
import TheStacks.*;

public class AssignStmt implements IStatement {
    String id;
    Expression exp;

    public AssignStmt(String id, Expression exp){this.id=id; this.exp=exp;}

    public String toStr(){
        return id+"="+exp.toStr();
    }


    public PrgState execute(PrgState state) throws EmptyListException, FullListException {
        TheStack<IStatement> stk = state.getExeStack();
        TheDict<String, Integer> symTable = state.getSymTable();
        int val = exp.evaluate(symTable);
        if (symTable.lookup(id)!=null)
            symTable.update(id, val);
        else {
            symTable.add(id,val);
        }
        return state;
    }

}
