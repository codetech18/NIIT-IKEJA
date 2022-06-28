package UserDefinedException;

import jdk.swing.interop.SwingInterOpUtils;

public class AgeValidation extends RuntimeException{

    public AgeValidation(){
        System.out.println("Invalid age Entered");
        System.out.println("Only age greater than zero can be entered");
    }
}
