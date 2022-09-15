package effective.code.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {

   public static void main(String[] args) {
      try {
         Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
         defaultConstructor.setAccessible(true);

         Elvis elvis1 = defaultConstructor.newInstance();
         Elvis elvis2 = defaultConstructor.newInstance();

         System.out.println(elvis1 == elvis2); // false
      } catch (NoSuchMethodException e) {
         e.printStackTrace();
      } catch (InvocationTargetException e) {
         e.printStackTrace();
      } catch (InstantiationException e) {
         e.printStackTrace();
      } catch (IllegalAccessException e) {
         e.printStackTrace();
      }
   }
}
