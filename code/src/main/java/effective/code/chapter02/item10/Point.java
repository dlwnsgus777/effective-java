package effective.code.chapter02.item10;

import java.util.ArrayList;
import java.util.List;

public class Point {
   private final int x;
   private final int y;

   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }

   @Override public boolean equals(Object o) {
      if (this == o) {
         return true;
      }

      if (!(o instanceof Point)) {
         return false;
      }

      Point p = (Point) o;
      return p.x == x && p.y == y;
   }

   public static void main(String[] args) {
      Point point = new Point(1, 2);
      List<Point> points = new ArrayList<>();
      points.add(point);
      System.out.println(points.contains(new Point(1, 2)));
   }

   // 아이템 11 참조
   @Override public int hashCode()  {
      return 31 * x + y;
   }
}
