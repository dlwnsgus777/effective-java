package effective.code.item06;

public class Deprecation {

   // TODO 애노테이션 프로세서

   /**
    * @deprecated in favor of
    * {@link #Deprecation(String)}
    */
   @Deprecated(forRemoval = true)
   public Deprecation() {

   }

   private String name;

   public Deprecation(String name) {
      this.name = name;
   }
}
