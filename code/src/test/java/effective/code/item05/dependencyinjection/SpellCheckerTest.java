package effective.code.item05.dependencyinjection;

import effective.code.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

   @Test
   void isValid() {
      SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());

      assertTrue(spellChecker.isValid("test"));
   }
}