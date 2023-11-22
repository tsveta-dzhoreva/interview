public class Pattern2UsageDemo {

   public static void main(String[] args) {
      Pattern2 pattern2 = new Pattern2();

      //get an object of Circle and call its draw method.
      Shape shape1 = pattern2.getShape("CIRCLE");

      //call draw method of Circle
      shape1.draw();

      //get an object of Rectangle and call its draw method.
      Shape shape2 = pattern2.getShape("RECTANGLE");

      //call draw method of Rectangle
      shape2.draw();

      //get an object of Square and call its draw method.
      Shape shape3 = pattern2.getShape("SQUARE");

      //call draw method of square
      shape3.draw();
   }
}
