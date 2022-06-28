package Exception.Assertion;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ValidateAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = input.nextInt();

        assert(age>0)&&(age < 130);
        System.out.println("Your age is " + age);
    }
}
