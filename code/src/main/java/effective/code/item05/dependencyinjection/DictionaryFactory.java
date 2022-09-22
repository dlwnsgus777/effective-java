package effective.code.item05.dependencyinjection;

import effective.code.item05.DefaultDictionary;
import effective.code.item05.Dictionary;

public class DictionaryFactory {
   public Dictionary get() {
      return new DefaultDictionary();
   }
}
