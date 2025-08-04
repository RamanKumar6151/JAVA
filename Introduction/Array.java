package Introduction;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        
        int[] marks=new int[3]; // we use new keyword when we dont know what values we are going to store in the array 
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;

        System.out.println(marks[0]);
        // varibles are initialised null by default if no value is initialized

        System.out.println(marks.length);
        // here length is property

        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);  // needs import java.util.Arrays;
        System.out.println(marks[0]);

        int[] marks2={97, 98, 95}; // nonnew keyword since we know what values we are going to store

        // 2d array
        int[][] finalMarks={{97, 98, 95}, {95, 95, 98}};
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[1][1]);
    }
}
