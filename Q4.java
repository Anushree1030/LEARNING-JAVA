// Make a program that takes the radius of a circle as input.
// Calculate it's radius and area and prints it as output to the user.

import java.util.*;

public class Q4 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        int area = 22*radius*radius/7;

        System.out.println(area);

    }
}
