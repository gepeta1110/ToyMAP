package View;

import Exceptions.EmptyListException;
import Exceptions.EmptyStackException;
import Exceptions.FullListException;
import Model.*;
import Expressions.*;
import Controller.*;
import ProgramState.PrgState;

public class Main {
    public Main(){

    }
    public static void main(String[] args) throws FullListException, EmptyListException, EmptyStackException{
        //System.out.println("bla");
        IStatement ex1 =  new CompStmt(new AssignStmt("v",new ConstantExpression(2)), new PrintStmt(new
                VarExpression("v")));

        Controller controller=new Controller();
        PrgState oneState = new PrgState(ex1);
        try{
            controller.addToRepository(oneState);
        }
        catch(FullListException full) {
            System.out.println(full.getMessage());
        }

        try{
            controller.oneStep(oneState);
        }
        catch(FullListException full){
            System.out.println(full.getMessage());
        }
        catch(EmptyListException empty){
            System.out.println(empty.getMessage());
        }
        catch(EmptyStackException emptySt){
            System.out.println(emptySt.getMessage());
        }

        try {
            controller.allStep();
        }
        catch(FullListException full){
            System.out.println(full.getMessage());
        }
        catch(EmptyListException empty){
            System.out.println(empty.getMessage());
        }
        catch(EmptyStackException emptySt){
            System.out.println(emptySt.getMessage());
        }
    }


}

