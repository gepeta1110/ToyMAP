package Controller;
import Exceptions.EmptyListException;
import Exceptions.EmptyStackException;
import Exceptions.FullListException;
import ProgramState.*;

public interface ControllerI {
    public PrgState oneStep(PrgState state) throws EmptyStackException, FullListException, EmptyListException;
    public void allStep() throws EmptyListException, EmptyStackException, FullListException;
    public void displayState() throws EmptyListException, FullListException;
    public void addToRepository(PrgState state) throws FullListException;
}
