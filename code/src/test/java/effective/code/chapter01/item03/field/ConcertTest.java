package effective.code.chapter01.item03.field;

import effective.code.chapter01.item03.field.Concert;
import effective.code.chapter01.item03.field.Elvis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConcertTest {

   @Test
   void perform() {
      Concert concert = new Concert(Elvis.INSTANCE);
      concert.perform();

      Assertions.assertTrue(concert.isLightsOn());
      Assertions.assertTrue(concert.isMainStateOpen());
   }
}