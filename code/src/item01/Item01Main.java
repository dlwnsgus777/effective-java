package item01;

import java.util.*;

public class Item01Main {
   public static void main(String[] args) {
      List<Integer> numbers = new ArrayList<>();
      numbers.add(100);
      numbers.add(20);
      numbers.add(33);
      numbers.add(3);

      System.out.println(numbers);

      Comparator<Integer> desc = new Comparator<>() {
         @Override
         public int compare(Integer t1, Integer t2) {
            return t2 - t1;
         }
      };

      Collections.sort(numbers, desc.reversed());

      System.out.println(numbers);
   }
}
