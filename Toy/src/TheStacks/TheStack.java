package TheStacks;
import Exceptions.EmptyListException;
import Exceptions.FullListException;

import java.util.ArrayList;

public class TheStack<Type> implements Stacks<Type> {
    ArrayList<Type> theStack = new ArrayList<Type>(50);
    public Type pop() throws EmptyListException{
        if(this.theStack.size()==0)
            throw new EmptyListException("The Exe Stack is empty");
        Type el = this.theStack.get((this.theStack.size())-1);
        this.theStack.remove((this.theStack.size())-1);
        return el;
    }

    public void push(Type element)throws FullListException{
        if(this.theStack.size()==50)
            throw new FullListException("The Exe Stack is full");
        this.theStack.add(this.theStack.size(), element);
    }

    public int getSize(){return this.theStack.size();}

    public boolean isEmpty(){ return this.getSize()==0;}
}
