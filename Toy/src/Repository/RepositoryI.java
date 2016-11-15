package Repository;
import ProgramState.*;
import Exceptions.*;

public interface RepositoryI {
    public PrgState getCurrentProg() throws EmptyListException;
    public void addToList(PrgState state);
    public void logPrgStateExec();
}
