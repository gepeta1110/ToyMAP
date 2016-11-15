package Model;
import Exceptions.EmptyListException;
import Exceptions.FullListException;
import ProgramState.*;

public interface IStatement {

    public String toStr();
    public PrgState execute(PrgState state) throws EmptyListException, FullListException;
}

