package item01;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class Item01Main {
   public static void main(String[] args) {
      Map<OrderStatus, String> enumMap = new EnumMap<>(OrderStatus.class);

      EnumSet<OrderStatus> enumSet = EnumSet.allOf(OrderStatus.class);
   }
}
