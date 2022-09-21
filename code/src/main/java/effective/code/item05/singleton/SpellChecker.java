package effective.code.item05.singleton;


import effective.code.item05.DefaultDictionary;
import effective.code.item05.Dictionary;

import java.util.List;

public class SpellChecker {

   private final Dictionary dictionary = new DefaultDictionary();

   public static final SpellChecker INSTANCE = new SpellChecker();

   private SpellChecker() {}

   public boolean isValid(String word) {
      // TODO 여기 SpellChecker 코드
      return dictionary.contains(word);
   }

   public List<String> suggestions(String typo) {
      // TODO 여기 SpellChecker 코드
      return dictionary.closeWordsTo(typo);
   }
}
