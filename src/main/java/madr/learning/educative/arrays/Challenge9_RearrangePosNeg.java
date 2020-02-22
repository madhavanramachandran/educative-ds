package madr.learning.educative.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Re-arrange Positive & Negative Values
 */
public class Challenge9_RearrangePosNeg {

   public static void main(String [] args) {
      System.out.println("Re-arrange Positive & Negative Values");
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int [] arr = new int[N];
      for (int i = 0; i < N ; i++) {
         arr[i] = scanner.nextInt();
      }
      reArrange(arr);
   }

   private static void reArrange(int[] arr) {
      int negNumCount = 0;
      for (int i = 0; i < arr.length ; i++) {
         int elem = arr[i];
         if (elem < 0) {
            negNumCount ++;
         }
      }
      int negElemIndex = 0;
      int posElemIndex = negNumCount;
      int [] result = new int[arr.length];
      for (int i = arr.length -1; i >=0;  i--) {
         int elem = arr[i];
         if (elem < 0)
            result[negElemIndex++] = elem;
         else
            result[posElemIndex++] = elem;
      }
      for (int i = 0; i < arr.length; i++) {
         arr[i] = result[i];
      }
   }
}
