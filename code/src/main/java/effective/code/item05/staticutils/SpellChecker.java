package effective.code.item05.staticutils;


import effective.code.item05.DefaultDictionary;
import effective.code.item05.Dictionary;

import java.util.List;

public class SpellChecker {

   private static final Dictionary dictionary = new DefaultDictionary();

   private SpellChecker() {}

   public static boolean isValid(String word) {
      // TODO 여기 SpellChecker 코드
      return dictionary.contains(word);
   }

   public static List<String> suggestions(String typo) {
      // TODO 여기 SpellChecker 코드
      return dictionary.closeWordsTo(typo);
   }
}
