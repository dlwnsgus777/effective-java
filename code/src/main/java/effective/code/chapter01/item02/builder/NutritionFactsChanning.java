package effective.code.chapter01.item02.builder;

public class NutritionFactsChanning {
   private final int servingSize;   // 필수
   private final int servings;      // 필수
   private final int calories;      // 선택
   private final int fat;           // 선택
   private final int sodium;        // 선택
   private final int carbohydrate;  // 선택

   public static void main(String[] args) {
      NutritionFactsChanning nutritionFacts01 = new NutritionFactsChanning(1, 0);
      NutritionFactsChanning nutritionFacts02 = new NutritionFactsChanning(1, 0, 10);
   }

   public NutritionFactsChanning(int servingSize, int servings) {
      this(servingSize, servings, 0);
   }

   public NutritionFactsChanning(int servingSize, int servings,
                                 int calories) {
      this(servingSize, servings, calories, 0);
   }
   public NutritionFactsChanning(int servingSize, int servings,
                                 int calories, int fat) {
      this(servingSize, servings, calories, fat, 0);
   }

   public NutritionFactsChanning(int servingSize, int servings,
                                 int calories, int fat,
                                 int sodium) {
      this(servingSize, servings, calories, fat, sodium, 0);
   }

   public NutritionFactsChanning(int servingSize, int servings,
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
