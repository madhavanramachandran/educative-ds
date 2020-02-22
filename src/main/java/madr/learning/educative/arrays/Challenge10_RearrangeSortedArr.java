package madr.learning.educative.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Rearrange Sorted Array in Max/Min Form
 */
public class Challenge10_RearrangeSortedArr {

   public static void main(String [] args) {
      System.out.println("Rearrange Sorted Array in Max/Min Form");
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int [] arr = new int[N];
      for (int i = 0; i < N ; i++) {
         arr[i] = scanner.nextInt();
      }
      maxMin(arr);
   }

   private static void maxMin(int[] arr) {
      int [] result = new int[arr.length];
      for (int idx = 1, i = 0 ; i < arr.length/2 && idx < arr.length-1;) {
         result[idx] = arr[i++];
         idx = idx+2;
      }

      for (int idx = 0, i = arr.length - 1; i >= arr.length/2;) {
         result[idx] = arr[i--];
         idx = idx+2;
      }
      for (int i = 0; i < arr.length ; i++) {
         arr[i] = result[i];
      }
   }
}
