package item01;

public enum OrderStatus {
   ORDERED(0), SHIPPED(1), DELIVERED(2);

   private int statusIntValue;

   OrderStatus(int statusIntValue) {
      this.statusIntValue = statusIntValue;
   }
}
