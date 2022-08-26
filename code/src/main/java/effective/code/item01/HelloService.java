package effective.code.item01;

public interface HelloService {
   String hello();

   default String hi() {
      return "Hi";
   }

   private static HelloService of(String lang) {
      if (lang.equals("ko")) {
         return new KoreanHelloService();
      } else {
         return new EnglishHelloService();
      }
   }
}
