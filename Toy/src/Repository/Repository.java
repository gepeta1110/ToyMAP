package Repository;

import ProgramState.PrgState;
import java.util.ArrayList;
import Exceptions.*;

public class Repository implements RepositoryI{
    ArrayList<PrgState> allStates = new ArrayList<>(50);

    public PrgState getCurrentProg() throws EmptyListException{
        if(this.allStates.size()==0)
            throw new EmptyListException("The Program State List is empty");
        return this.allStates.get(this.allStates.size()-1);
    }

    public void addToList(PrgState state){
        this.allStates.add(this.allStates.size(), state);
    }

    public void logPrgStateExec(){

    }
}
