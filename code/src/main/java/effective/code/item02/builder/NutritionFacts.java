package effective.code.item02.builder;

public class NutritionFacts {
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

   public NutritionFacts(int servingSize, int servings) {
      this(servingSize, servings, 0);
   }

   public NutritionFacts(int servingSize, int servings,
                         int calories) {
      this(servingSize, servings, calories, 0);
   }
   public NutritionFacts(int servingSize, int servings,
                         int calories, int fat) {
      this(servingSize, servings, calories, fat, 0);
   }

   public NutritionFacts(int servingSize, int servings,
                         int calories, int fat,
                         int sodium) {
      this(servingSize, servings, calories, fat, sodium, 0);
   }

   public NutritionFacts(int servingSize, int servings,
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
