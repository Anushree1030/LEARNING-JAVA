// public class Class2 {
//     public static void main(String args[]){
//         System.out.println("anu\nsid");
//     }
// }
// Boiler plate code:- A code which we get by default.

// Output in JAVA 
// 1. print
// System.out.print("Hello World");
// System.out.print("Hello World"); 

// output; Hello World Hello World

// 2. println
// System.out.println("Hello World");
// System.out.print("Hello World");

// output; Hello World
//         Hello World

// 3."\n"
// System.out.print("Hello World\n");
// System.out.print("Hello World");

// output; Hello World
//         Hello World





// Shotcut for print statement:-
// Write sout then press tab key






// Variable:-
// A variable is a name given to a memory location that is used to store a value.
// ex- int age = 20;
// here, int is a data type
//       age is a variable
//       20 is a value stored in the variable 


// Data Type:-
// A data type tells the computer what kind of data a variable will store.

//           Types of Data type
//      |                                                      |
// Primitive                                              Non-Primitive
//      |                                                      |
// byte-1byte (used for small whole numbers)                  String
// short-2byte (used for whole numbers)                       Array
// int-4byte (used for whole numbers)                         Class
// long-8byte (used for large whole numbers)                  Object
// float-4byte (used for decimal numbers)                     Interface
// double-8byte (used for decimal numbers)
// char-2byte (used for single character)
// boolean-not fixed or 1byte (used for true or false) 

// public class Class2{
// public static void main(String args[]){
//     //variables
//     int a = 10;
//     int b = 20;
//     int sum = a+b;
//     int diff = a-b;
//     int mul = a*b;
//     System.out.println(sum);
//     System.out.println(diff);
//     System.out.println(mul);
// }
// }



 


// Input in JAVA:-

// Input:-input means giving data to a program while the program is running 
// so that the program can use the data to perform some operations.
// In Java we commonly use Scanner class to take input.

// Package - A package is a group of related classes.
// It is used to organize programs.




// import java.util.*;

// public class Class2 {
//     public static void main(String[] args){
//         //input
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         //whenever we use next function,it takes only one token which means it gives a single word or a number output.
//         System.out.println(name);
//     }
// }




import java.util.*;

public class Class2 {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //whenever we use nextLine function,it gives whole name or a sentence in an output.
        System.out.println(name);
    }
}


//nextInt is used to take integer type input.
//nextFloat is used to take decimal number input.

