package effective.code.item05.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

   public static void main(String[] args) {
      ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
      SpellChecker spellChecker = applicationContext.getBean(SpellChecker.class);
      spellChecker.isValid("test");

      SpellChecker spellChecker1 = new SpellChecker(new SpringDictionary()); // 스프링이 관리하지 않는 객체
   }
}
