package effective.code.chapter01.item03.enumtype;

import effective.code.chapter01.item03.field.IElvis;

public enum Elvis implements IElvis {
   INSTANCE;

   public void leaveTheBuilding() {
      System.out.println("기다려 자기야, 지금 나갈께!");
   }

   @Override
   public void sing() {

   }

   public static void main(String[] args) {
      Elvis elvis = Elvis.INSTANCE;
      elvis.leaveTheBuilding();
   }
}
