package effective.code.item06;

public class Strings {

   public static void main(String[] args) {
      String hello = "hello";

      //TODO 이 방법은 권장하지 않습니다.
      String hello2 = new String("hello");

      String hello3 = "hello";

      System.out.println(hello == hello2); // false
      System.out.println(hello.equals(hello2)); // true
      System.out.println(hello == hello3); // true
      System.out.println(hello.equals(hello3)); // true
   }
}
