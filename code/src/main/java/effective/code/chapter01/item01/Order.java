package effective.code.chapter01.item01;

public class Order {

   private boolean prime;
   private boolean urgent;

   private OrderStatus status;

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

   public static void main(String[] args) {
      Order order = new Order();

   }
}
