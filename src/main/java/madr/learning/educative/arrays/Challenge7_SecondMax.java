package madr.learning.educative.arrays;

import java.util.Scanner;

/**
 * Find Second Maximum Value in an Array
 */
public class Challenge7_SecondMax {

   public static void main(String [] args) {
      System.out.println("Find Second Maximum Value in an Array");
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int [] arr = new int[N];
      for (int i = 0; i < N ; i++) {
         arr[i] = scanner.nextInt();
      }
      System.out.println(findSecondMaximum(arr));
   }

   private static int findSecondMaximum(int[] arr) {
      int max = Math.max(arr[0], arr[1]);
      int secondMax = Math.min(arr[0], arr[1]);
      for (int i = 2; i < arr.length; i++) {
         int elem = arr[i];
         if (elem > max) {
            secondMax = max;
            max = elem;
         }
         else if (elem > secondMax)
            secondMax = elem;
      }
      return secondMax;
   }
}
