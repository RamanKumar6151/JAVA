package Introduction;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("input your age ");
        int age=sc.nextInt();
        System.out.println(age);
        float age2=sc.nextFloat();
        System.out.println(age2);

        System.out.println("enter your namae ");
        String name=sc.next(); // will not take scentence but only word
        System.out.println(name);

        String str=sc.nextLine();
        System.out.println(str);
        sc.close();
    }
}
