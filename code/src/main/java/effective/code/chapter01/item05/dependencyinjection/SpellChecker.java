package effective.code.chapter01.item05.dependencyinjection;


import effective.code.chapter01.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

   private final Dictionary dictionary;

//   public SpellChecker(Dictionary dictionary) {
//
//      this.dictionary = dictionary;
//   }

   public SpellChecker(DictionaryFactory dictionaryFactory) {

      this.dictionary = dictionaryFactory.get();
   }

   public SpellChecker(Supplier<Dictionary> dictionaryFactory) {

      this.dictionary = dictionaryFactory.get();
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
