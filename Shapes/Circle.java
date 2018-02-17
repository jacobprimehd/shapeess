public class Circle implements Shapes {
   private double radius, perimeter, area;
   private double pi = Math.PI;
   
   public Circle(double radius){
      this.radius = radius;
      this.perimeter = 2 * this.pi * radius;
      this.area = (this.radius * this.radius) * this.pi;
   }
   
   public double getPerimeter(){
      return this.perimeter;
   }
   
   public double getArea(){
      return this.area;
   }
   public boolean equals(){
      if(this.perimeter == this.area){
         return true;
      } else {
         return false;
      }
   }
   public String toString(){
      String toString = "Circle  perimeter: " + this.perimeter + "   area: " + this.area;
      return toString;
   }

}