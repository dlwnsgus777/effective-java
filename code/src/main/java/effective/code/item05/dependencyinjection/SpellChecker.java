package effective.code.item05.dependencyinjection;


import effective.code.item05.Dictionary;

import java.util.List;

public class SpellChecker {

   private final Dictionary dictionary;

   public SpellChecker(Dictionary dictionary) {
      this.dictionary = dictionary;
   }

   public boolean isValid(String word) {
      // TODO 여기 SpellChecker 코드
      return dictionary.contains(word);
   }

   public List<String> suggestions(String typo) {
      // TODO 여기 SpellChecker 코드
      return dictionary.closeWordsTo(typo);
   }
}
