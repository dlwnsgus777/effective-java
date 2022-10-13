package effective.code.item08.finalizer_attack;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

   @Test
   void 일반_계정() {
      Account account = new Account("junhyun");
      account.transfer(BigDecimal.valueOf(10.4),"hello");
   }

   @Test
   void 푸틴_계정() {
      Account account = null;
      account.transfer(BigDecimal.valueOf(10.4),"hello");
   }
}