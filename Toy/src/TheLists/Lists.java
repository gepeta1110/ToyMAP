package TheLists;

import Exceptions.EmptyListException;
import Exceptions.FullListException;

public interface Lists<Type> {
    public void add(Type entry)throws FullListException;
    public Type getEntry(int position) throws EmptyListException;
}
