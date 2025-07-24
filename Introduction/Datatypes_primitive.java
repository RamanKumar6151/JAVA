// https://www.geeksforgeeks.org/java/java-data-types/
package Introduction;

public class Datatypes_primitive {
    public static void main(String[] args) {
        // 2 tpyes of data types
        // 1. primtive
        // a. numerical
        // INTEGER
        // i. byte
        // ii. short
        // iii. int
        // iv. long
        // FLOATING POINT
        // i. float
        // ii. double
        // b. non numerical
        // i. char
        // ii. boolean
        // 2. Non primitive
        // a. string
        // b. array etc
        // boolean datatype
        boolean var1 = true;
        boolean var2 = false;
        System.out.println(var1 + " " + var2);

        // byte
        byte var3 = 127;
        byte var3_2 = -128;
        // byte var3_1 = 128; // will throw error
        System.out.println(var3);
        // System.out.println(var3_1);
        System.out.println(var3_2);

        // short
        short var4 = 32767;
        short var4_2 = -32768;
        System.out.println(var4);
        // short var4_1 = 32768; // will thorw error
        // System.out.println(var4_1);
        System.out.println(var4_2);

        // int
        int var5 = 2147483647;
        int var5_2 = -2147483648;
        // int var5_1 = 2147483648; //will throw error
        System.out.println(var5);
        System.out.println(var5_2);
        // System.out.println(var5_1);

        // long
        long var6 = 2147483648L;
        System.out.println(var6);

        // float
        float var7 = 8.8F;
        System.out.println(var7);

        // double
        double var8 = 5.23456789D;
        System.out.println(var8);

        // char
        char var9 = 'A';
        // char var9 = "a"; // will throw string to char error
        System.out.println(var9);
    }

}
