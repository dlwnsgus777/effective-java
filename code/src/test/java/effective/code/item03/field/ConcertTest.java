package effective.code.item03.field;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

   @Test
   void perform() {
      Concert concert = new Concert(Elvis.INSTANCE);
      concert.perform();

      Assertions.assertTrue(concert.isLightsOn());
      Assertions.assertTrue(concert.isMainStateOpen());
   }
}