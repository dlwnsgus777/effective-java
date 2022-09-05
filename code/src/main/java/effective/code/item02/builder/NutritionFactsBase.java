package effective.code.item02.builder;

public class NutritionFactsBase {
   private final int servingSize;   // 필수
   private final int servings;      // 필수
   private final int calories;      // 선택
   private final int fat;           // 선택
   private final int sodium;        // 선택
   private final int carbohydrate;  // 선택

   public static void main(String[] args) {
      NutritionFacts nutritionFacts01 = new NutritionFacts(1, 0);
      NutritionFacts nutritionFacts02 = new NutritionFacts(1, 0, 10);
   }

   public NutritionFactsBase(int servingSize, int servings) {
      this.servingSize  = servingSize;
      this.servings     = servings;
      this.calories     = 0;
      this.fat          = 0;
      this.sodium       = 0;
      this.carbohydrate = 0;
   }

   public NutritionFactsBase(int servingSize, int servings,
                         int calories) {
      this.servingSize  = servingSize;
      this.servings     = servings;
      this.calories     = calories;
      this.fat          = 0;
      this.sodium       = 0;
      this.carbohydrate = 0;
   }
   public NutritionFactsBase(int servingSize, int servings,
                         int calories, int fat) {
      this.servingSize  = servingSize;
      this.servings     = servings;
      this.calories     = calories;
      this.fat          = fat;
      this.sodium       = 0;
      this.carbohydrate = 0;
   }

   public NutritionFactsBase(int servingSize, int servings,
                         int calories, int fat,
                         int sodium) {
      this.servingSize  = servingSize;
      this.servings     = servings;
      this.calories     = calories;
      this.fat          = fat;
      this.sodium       = sodium;
      this.carbohydrate = 0;
   }

   public NutritionFactsBase(int servingSize, int servings,
                         int calories, int fat,
                         int sodium, int carbohydrate) {
      this.servingSize  = servingSize;
      this.servings     = servings;
      this.calories     = calories;
      this.fat          = fat;
      this.sodium       = sodium;
      this.carbohydrate = carbohydrate;
   }
}
