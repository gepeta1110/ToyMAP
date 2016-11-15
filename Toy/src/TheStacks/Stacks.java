package TheStacks;

import Exceptions.EmptyListException;
import Exceptions.FullListException;

public interface Stacks<Type> {
    public Type pop() throws EmptyListException;
    public void push(Type element) throws FullListException;
    public int getSize();
    public boolean isEmpty();
}
