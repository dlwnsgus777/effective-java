package effective.code.chapter01.item02.hierarchicalbuilder;

import static effective.code.chapter01.item02.hierarchicalbuilder.NyPizza.*;

public class PizzaTest {
   public static void main(String[] args) {
      NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
            .addTopping(Topping.SAUSAGE)
            .build();
   }
}
