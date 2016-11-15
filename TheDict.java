package TheDicts;
import Exceptions.EmptyListException;
import Exceptions.FullListException;

import java.util.HashMap;
import java.util.Map;


public class TheDict<FirstT, SecondT> implements Dicts<FirstT, SecondT>{
    Map<FirstT,SecondT> dictionary = new HashMap<>(50);

    public void add(FirstT key, SecondT value)throws FullListException{
        if(this.dictionary.size()==50)
            throw new FullListException("The Symbol Table is full");
        this.dictionary.put(key, value);
    }


    public SecondT lookup(FirstT key) throws EmptyListException{
        if(this.dictionary.size()==0)
            throw new EmptyListException("The Symbol Table is empty");
        return this.dictionary.get(key);
    }

    public void update(FirstT key, SecondT entry) throws EmptyListException{
        if(this.dictionary.size()==0)
            throw new EmptyListException("The Symbol Table is empty");
        this.dictionary.put(key,entry);
    }
}
