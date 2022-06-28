package CheckedException;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileExample {
    public static void main(String[] args) {
    try {
        FileReader file = new FileReader("c:\\data.txt");

        BufferedReader Input = new BufferedReader(file);

        for (int c = 0; c < 3; c++) ;

        System.out.println(Input.readLine());
    }
    catch(Exception e) {
        System.out.println("FileNotFoundException occured");
      }
    }
}
