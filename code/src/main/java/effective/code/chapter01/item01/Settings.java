package effective.code.chapter01.item01;

public class Settings {

   private boolean useAutoSteering;
   private boolean userABS;

   private Settings() {}

   private static final Settings SETTINGS = new Settings();

   public static Settings getInstance() {
      return SETTINGS;
   }
}
