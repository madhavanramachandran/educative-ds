package madr.learning.educative.arrays;

import java.util.Scanner;

/**
 * Find Minimum Value in Array
 */
public class Challenge5_MinValueInArr {

   public static void main(String [] args) {
      System.out.println("Find Minimum Value in Array");
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int [] arr = new int[N];
      for (int i = 0; i < N ; i++) {
         arr[i] = scanner.nextInt();
      }
      System.out.println(findMinimum(arr));
   }

   private static int findMinimum(int[] arr) {
      int min = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] < min)
            min = arr[i];
      }
      return min;
   }
}
