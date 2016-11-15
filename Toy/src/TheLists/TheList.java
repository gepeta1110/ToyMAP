package TheLists;
import Exceptions.EmptyListException;
import Exceptions.FullListException;

import java.util.ArrayList;

public class TheList<Type> implements Lists<Type> {
    ArrayList<Type> list = new ArrayList<Type>(50);

    public void add(Type entry) throws FullListException{
        if(this.list.size()==50)
            throw new FullListException("The Output list is full");
        this.list.add(this.list.size(), entry);
    }

    public Type getEntry(int position)throws EmptyListException{
        if(this.list.size()==0)
            throw new EmptyListException("The Output list is empty");
        for(int i=0;i<this.list.size();i++)
            if(i==position)
                return this.list.get(i);

        return null;
    }


}
