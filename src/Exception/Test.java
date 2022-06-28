package Exception;

public class Test {
    public static void main(String[] args) {
        try{
        int num = 0;
        int num2 = 10;
        int result = num2/num;
        System.out.println(result);
        }
        catch(Exception re){
            System.out.println("ArithmeticException occurred");
        }

    }
}
