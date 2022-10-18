package effective.code.chapter01.item05.dependencyinjection;

import effective.code.chapter01.item05.DefaultDictionary;
import effective.code.chapter01.item05.Dictionary;

public class DictionaryFactory {
   public Dictionary get() {
      return new DefaultDictionary();
   }
}
