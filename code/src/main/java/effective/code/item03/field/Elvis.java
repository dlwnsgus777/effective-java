package effective.code.item03.field;

public class Elvis implements IElvis {

   /**
    * 싱글톤 오브젝트
    */
   public static final Elvis INSTANCE = new Elvis();

   private static boolean created;

   private Elvis() {
      if (created) {
         throw new UnsupportedOperationException("can't be created by constructor");
      }

      created = true;
   }

   public void leaveTheBuilding() {
      System.out.println("Whoa baby, I'm outta here!");
   }

   public void sing() {
      System.out.println("I'll have a blue~ Christmas without you~");
   }

   public static void main(String[] args) {
      Elvis elvis = Elvis.INSTANCE;
      elvis.leaveTheBuilding();
   }
}
