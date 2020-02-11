package madr.learning.educative.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Merge Two Sorted Arrays
 */
public class Challenge2_MergeSortedArrays {

   public static void main (String [] args) {
      final Scanner scanner = new Scanner(System.in);
      System.out.println("Enter size of 1st array");
      int arr1Length = scanner.nextInt();
      int [] arr1 = new int[arr1Length];
      System.out.println("Enter array 1 values");
      for (int i = 0; i < arr1Length; i++) {
         arr1[i] = scanner.nextInt();
      }

      System.out.println("Enter size of 2nd array");
      int arr2Length = scanner.nextInt();
      int [] arr2 = new int[arr1Length];
      System.out.println("Enter array 2 values");
      for (int i = 0; i < arr2Length; i++) {
         arr2[i] = scanner.nextInt();
      }

      int[] result = mergeArrays(arr1, arr2);
      System.out.println(Arrays.toString(result));
   }

   private static int[] mergeArrays(int[] arr1, int[] arr2) {
      final int resultArrLength = arr1.length + arr2.length;
      final int [] result = new int[resultArrLength];

      int arr1CurrentIndex = 0;
      int arr2CurrentIndex = 0;
      int resultIndex = 0;
      for (int i = 0; i < arr1.length && i < arr2.length; i++) {
         int arr1Elem = arr1[arr1CurrentIndex];
         int arr2Elem = arr2[arr2CurrentIndex];
         if (arr1Elem <= arr2Elem) {
            result[resultIndex++] = arr1Elem;
            arr1CurrentIndex++;
         } else {
            result[resultIndex++] = arr2Elem;
            arr2CurrentIndex++;
         }
      }

         for (; arr1CurrentIndex < arr1.length; arr1CurrentIndex++) {
            result[resultIndex++] = arr1[arr1CurrentIndex];
         }

         for (; arr2CurrentIndex < arr2.length; arr2CurrentIndex++) {
            result[resultIndex++] = arr2[arr2CurrentIndex];
         }
      return result;
   }
}
