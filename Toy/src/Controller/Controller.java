package Controller;
import Repository.*;
import ProgramState.*;
import TheStacks.*;
import Model.*;
import Exceptions.*;

public class Controller implements ControllerI{
    RepositoryI repository = new Repository();

    public PrgState oneStep(PrgState state) throws FullListException, EmptyStackException, EmptyListException{
        TheStack<IStatement> stk=state.getExeStack();
        if(stk.isEmpty()) throw new EmptyStackException("Exe Stack is empty");
        IStatement currentStmt = stk.pop();
        return currentStmt.execute(state);
    }

    public void allStep() throws EmptyListException, FullListException, EmptyStackException {
        PrgState prg = repository.getCurrentProg();
        while (!prg.getExeStack().isEmpty()) {
            oneStep(prg);
            //display the program state
            this.displayState();
        }
    }

    public void displayState() throws EmptyListException{
        System.out.println("Exe Stack: " + repository.getCurrentProg().getExeStack());
        System.out.println("Symbol Table: " + repository.getCurrentProg().getSymTable());
        System.out.println("Output: " + repository.getCurrentProg().getOut());
    }

    public void addToRepository(PrgState state) throws FullListException{
        this.repository.addToList(state);
    }

}
