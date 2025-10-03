import java.util.Arrays;
import java.util.Scanner;

public class Newtwoarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][4];
        System.out.println("Enter the value for array");
        for(int row=0; row< arr.length; row++)
        {

            for(int col=0; col< arr[row].length;col++){
                arr[row][col]=sc.nextInt();

            }
        }
        // First way to print with for loop
//        for(int row=0; row< arr.length; row++)
//        {
//            System.out.println();
//            for(int col=0; col< arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//
//            }
//        }
   //Second way to print by Array.toString
        for (int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
