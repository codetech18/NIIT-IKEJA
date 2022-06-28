package UncheckedException;

public class ArrayExample {
    public static void main(String[] args) {
        try{
        int numbers [] = new int[5];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;
        numbers[3] = 1;
        numbers[4] = 1;
        System.out.println(numbers[6]);
        }
        catch(Exception e){
            System.out.println("Index out of bounds....");
        }
    }
}
