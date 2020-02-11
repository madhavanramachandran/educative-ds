package madr.learning.educative.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Remove Even Integers from Array
 */
public class Challenge1 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int arrayLength = scanner.nextInt();
      int [] arr = new int[arrayLength];
      for (int i = 0; i < arrayLength; i++) {
         arr[i] = scanner.nextInt();
      }
      System.out.println(Arrays.toString(removeEvenIntegers(arr)));
   }

   private static int[] removeEvenIntegers(int[] arr) {
      int evenIntCount = 0;
      for (int i = 0; i < arr.length ; i++) {
         if (arr[i] % 2 != 0)
            evenIntCount++;
      }
      int [] result = new int[evenIntCount];

      if (evenIntCount > 0) {
         int currentResultElem = 0;
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
               result[currentResultElem++] = arr[i];
         }
      }
      return result;
   }
}
