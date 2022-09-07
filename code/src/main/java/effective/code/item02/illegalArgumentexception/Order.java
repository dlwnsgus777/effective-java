package effective.code.item02.illegalArgumentexception;

import java.time.LocalDate;

public class Order {

   public void updateDeliveryDate(LocalDate deliveryDate) throws IllegalArgumentException {
      if (deliveryDate.isBefore(LocalDate.now())) {
         // TODO 과거로 배송을 하는 경우
         throw new IllegalArgumentException("delivery date can't be earlier than " + LocalDate.now());
      }
   }
}
