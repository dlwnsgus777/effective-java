package effective.code.chapter01.item02.builder;

public class NutritionFactsBeans {
   private int servingSize    = 1;   // 필수
   private int servings       = 13;  // 필수
   private int calories       = 0;  // 선택
   private int fat            = 0;  // 선택
   private int sodium         = 0;  // 선택
   private int carbohydrate   = 0;  // 선택

   public static void main(String[] args) {
      NutritionFactsBeans cocaCola = new NutritionFactsBeans(1, 10);

      cocaCola.setServings(240);
      cocaCola.setCalories(100);
   }

   public NutritionFactsBeans(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
   }

   public void setServingSize(int servingSize) {
      this.servingSize = servingSize;
   }

   public void setServings(int servings) {
      this.servings = servings;
   }

   public void setCalories(int calories) {
      this.calories = calories;
   }

   public void setFat(int fat) {
      this.fat = fat;
   }

   public void setSodium(int sodium) {
      this.sodium = sodium;
   }

   public void setCarbohydrate(int carbohydrate) {
      this.carbohydrate = carbohydrate;
   }
}
