// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Q; store a roll number
        int a = 20;

        //Q; store a person's name
        String name = "Jiya";

        //Q; store 5 roll numbers
        int rnum1 = 14;
        int rnum2 = 15;
        int rnum3 = 16;

        // syntax
        // datatype[] variable name = new datatype[size];
        // store 5 roll nmbrs:
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {1,2,3,4,5,};
        // all the type of data in an array should be same, you can't mix data-types

        int[] ros; //declaration of array, ros is getting defined in the stack
        ros = new int[5]; // initialisation; actually the object is being created here in the memory (heap)

        System.out.println(ros[1]);

        String[] arr = new String[5];
        System.out.println(arr[0]); // null - literal, assign it to non-primitives only (none in python)





    }
}