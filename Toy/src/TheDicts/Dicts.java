package TheDicts;

import Exceptions.EmptyListException;
import Exceptions.FullListException;

public interface Dicts<FirstT, SecondT> {
    public void add(FirstT key, SecondT value) throws FullListException;
    public SecondT lookup(FirstT key) throws EmptyListException;
    public void update(FirstT key, SecondT entry) throws EmptyListException;

}
