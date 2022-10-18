package effective.code.chapter01.item05.dependencyinjection;

import effective.code.chapter01.item05.DefaultDictionary;
import effective.code.chapter01.item05.dependencyinjection.SpellChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

   @Test
   void isValid() {
      SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);

      assertTrue(spellChecker.isValid("test"));
   }
}