package ProgramState;
import Exceptions.FullListException;
import TheDicts.*;
import TheLists.*;
import TheStacks.*;
import Model.*;

public class PrgState {
    TheStack<IStatement> exeStack = new TheStack<IStatement>();
    TheDict<String, Integer> symTable = new TheDict<String, Integer>();
    TheList<Integer> out = new TheList<Integer>();
    IStatement originalProgram ;

    public PrgState(IStatement original) throws FullListException{
        this.originalProgram=original;
        this.exeStack.push(original);
    }

    public TheStack<IStatement> getExeStack(){
        return this.exeStack;
    }

    public TheDict<String, Integer> getSymTable(){
        return this.symTable;
    }

    public TheList<Integer> getOut(){
        return this.out;
    }

    public IStatement getOriginalProgram(){
        return this.originalProgram;
    }

}
