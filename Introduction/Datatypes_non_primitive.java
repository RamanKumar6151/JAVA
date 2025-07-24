// https://www.geeksforgeeks.org/java/java-data-types/
package Introduction;

public class Datatypes_non_primitive {
    public static void main(String[] args) {
        // The Non-Primitive (Reference) Data Types will contain a memory address of
        // variable values because the reference types won’t store the variable value
        // directly in memory. They are strings, objects, arrays, etc.
        // strings
        String str1 = "Geeks";
        System.out.println(str1);
        StringBuilder str2 = new StringBuilder("raman");
        // Note: String cannot be modified after creation. Use StringBuilder for heavy
        // string manipulation
        System.out.println(str2);

        // class
        Car myCar = new Car("kia", 2020);
        myCar.display();

        // interface

        // array
        int[] num = { 1, 2, 3, 4, 5 };
        String[] arr = { "str1", "str2", "str3" };
        System.out.println(num[0]);
        System.out.println(arr[0]);

    }

}

// class
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(model + " " + year);
    }
}
