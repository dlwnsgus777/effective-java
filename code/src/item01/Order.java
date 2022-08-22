package item01;

import java.util.List;

public class Order {

   private boolean prime;
   private boolean urgent;

   public static Order primeOrder() {
      Order order = new Order();
      order.prime = true;

      return order;
   }

   public static Order urgentOrder() {
      Order order = new Order();
      order.urgent = true;
      return order;
   }
}
