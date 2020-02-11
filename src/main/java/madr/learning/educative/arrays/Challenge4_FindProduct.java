package madr.learning.educative.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Array of Products of All Elements Except Itself
 */
public class Challenge4_FindProduct {

   public static void main (String [] args) {
      System.out.println("Array of Products of All Elements Except Itself");
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int [] arr = new int[N];
      for (int i = 0; i < N ; i++) {
         arr[i] = scanner.nextInt();
      }
      System.out.println(Arrays.toString(findProduct(arr)));
   }

   private static int[] findProduct(int[] arr) {
      int length = arr.length;
      int[] result = new int [length];
      Arrays.fill(result, 1);
      int temp = 1;
      //Left - right
      for (int i = 0; i < length; i++) {
         result[i] = temp;
         temp = temp * arr[i];
      }

      //Right - left
      temp = 1;
      for (int i = length - 1; i >= 0 ; i--) {
         result[i] = temp * result[i];
         temp = temp * arr[i];
      }
      return result;
   }
}
