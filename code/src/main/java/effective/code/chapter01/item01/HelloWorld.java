package effective.code.chapter01.item01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloWorld {
   public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//      ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//      HelloService helloService = applicationContext.getBean(HelloService.class);
//      System.out.println(helloService);

      Class<?> aClass = Class.forName("effective.code.chapter01.item01.KoreanHelloService");
      Constructor<?> constructor = aClass.getConstructor();
      HelloService helloService = (HelloService) constructor.newInstance();
      System.out.println(helloService.hello());

      Method[] methods = aClass.getDeclaredMethods();

   }
}
