package madr.learning.educative.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * First Non-Repeating Integer in an Array
 */
public class Challenge6_FirstNonRepeating {

   public static void main(String [] args) {
      System.out.println("First Non-Repeating Integer in an Array");
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int [] arr = new int[N];
      for (int i = 0; i < N ; i++) {
         arr[i] = scanner.nextInt();
      }
      System.out.println(findFirstUnique(arr));
   }

   private static int findFirstUnique(int[] arr) {
      //Use linked hash map to retain the insertion order
      Map<Integer, Boolean> arrWithCount = new LinkedHashMap<>();
      for (int i = 0; i < arr.length; i++) {
         if (arrWithCount.containsKey(arr[i]))
            arrWithCount.put(arr[i], false);
         else
            arrWithCount.put(arr[i], true);
      }
      for (Map.Entry<Integer, Boolean> entry : arrWithCount.entrySet()) {
         if (entry.getValue())
            return entry.getKey();
      }
      return 0;
   }
}
