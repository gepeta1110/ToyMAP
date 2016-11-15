package TheDicts;

public class DEntry<FirstT, SecondT> {
    FirstT key;
    SecondT value;

    public DEntry(FirstT key, SecondT value){
        this.key=key;
        this.value=value;
    }

    public FirstT getKey(){
        return this.key;
    }

    public void setKey(FirstT key){ this.key=key;}

    public SecondT getValue(){
        return this.value;
    }

    public void setValue(SecondT value) { this.value=value;}

    public String toStr(){
        return "(" + this.key + ", " + this.value + ")";
    }
}
