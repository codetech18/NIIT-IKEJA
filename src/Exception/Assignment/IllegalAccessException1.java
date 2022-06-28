package Exception.Assignment;

public class IllegalAccessException1 {
    private int Sam;

    public static void main(String[] args) {
        IllegalAccessException1 jn = new IllegalAccessException1();
        jn.Sam = 23;
        System.out.println(jn.Sam);
    }
}
