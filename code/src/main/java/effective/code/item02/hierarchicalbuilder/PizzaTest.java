package effective.code.item02.hierarchicalbuilder;

import static effective.code.item02.hierarchicalbuilder.NyPizza.*;
import static effective.code.item02.hierarchicalbuilder.Pizza.*;

public class PizzaTest {
   public static void main(String[] args) {
      NyPizza nyPizza = new NyPizza.Builder(Size.SMALL)
            .addTopping(Topping.SAUSAGE)
            .build();
   }
}
