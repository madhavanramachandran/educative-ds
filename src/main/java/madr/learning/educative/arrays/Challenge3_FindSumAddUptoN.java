package madr.learning.educative.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Find Two Numbers that Add up to "n"
 */
public class Challenge3_FindSumAddUptoN {
   public static void main (String [] args) {
      System.out.println("Find Two Numbers that Add up to 'n'");
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int [] arr = new int[N];
      for (int i = 0; i < N ; i++) {
         arr[i] = scanner.nextInt();
      }
      int sumToFind = scanner.nextInt();
      System.out.println(Arrays.toString(findSum(arr, sumToFind)));
   }

   private static int[] findSum(int[] arr, int sumToFind) {
      Set<Integer> dataSet = new HashSet<>();
      for (int i = 0 ; i < arr.length; i++) {
         int diff = sumToFind - arr[i];
         if (!dataSet.contains(arr[i])) {
            dataSet.add(diff);
         } else {
            return new int [] {arr[i], diff};
         }
      }
      return new int[]{};
   }
}
