package Exception.Assignment;

public class NegativeArraySize {
    public static void main(String[] args) {
       try{
           int num [] = new int[-7];
       }
       catch(NegativeArraySizeException e){
           e.getStackTrace();
           System.out.println(e);
           System.out.println("NegativeArraySize input.....");
       }
    }
}
