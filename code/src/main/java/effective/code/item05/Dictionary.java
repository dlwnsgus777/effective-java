package effective.code.item05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Dictionary {
   boolean contains(String word);
   List<String> closeWordsTo(String typo);
}
