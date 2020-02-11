package madr.learning.educative.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Right Rotate the Array by One Index
 */
public class Challenge8_RightRotateArray {
   public static void main(String [] args) {
      System.out.println("Right Rotate the Array by One Index");
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int [] arr = new int[N];
      for (int i = 0; i < N ; i++) {
         arr[i] = scanner.nextInt();
      }
      System.out.println(Arrays.toString(rotateArray(arr)));
   }

   private static int[] rotateArray(int[] arr) {
      int lastElem = arr[arr.length - 1];
      for (int i = arr.length - 1; i > 0 ; i--) {
         arr[i] = arr[i-1];
      }
      arr[0] = lastElem;
      return  arr;
   }

   private static int[] rotateArray01(int[] arr) {
      int [] result = new int[arr.length];
      for (int i = 0; i < arr.length ; i++) {
         result[(i + 1) % arr.length] = arr[i];
      }
      return  result;
   }
}
