package Exception.Assignment;

public class NoSuchMethod {
    public int run(){
        System.out.println("Dong ding tang");
        return 12;
    }
    public void run(int Num, String Name){
        System.out.println("Enter your age before Name");
    }

    public static void main(String[] args) {
        NoSuchMethod Json = new NoSuchMethod();
        Json.run();
        Json.run();
    }
}
