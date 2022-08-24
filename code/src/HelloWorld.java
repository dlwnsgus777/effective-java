import item01.Character;
import item01.FontFactory;

public class HelloWorld {
   public static void main(String[] args) {
      FontFactory fontFactory = new FontFactory();

      Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
      Character c2 = new Character('h', "white", fontFactory.getFont("nanum:12"));
      Character c3 = new Character('h', "white", fontFactory.getFont("nanum:12"));
   }
}
