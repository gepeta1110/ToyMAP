package Model;
import Exceptions.FullListException;
import ProgramState.*;
import TheStacks.*;

public class CompStmt implements IStatement {
    IStatement sOne,sTwo;

    public CompStmt(IStatement s1, IStatement s2){
        this.sOne = s1;
        this.sTwo = s2;

    }

    public String toStr(){
        return "(" + this.sOne.toStr() + ";" + this.sTwo.toStr() + ")";
    }

    public PrgState execute(PrgState state) throws FullListException{
        TheStack<IStatement> stk = state.getExeStack();

        stk.push(this.sOne);
        stk.push(this.sTwo);

        return state;
     }

}
