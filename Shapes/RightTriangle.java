public class RightTriangle implements Shapes {
   private double side1, side2, perimeter, area;
   
   public RightTriangle(double side1,double side2){
      this.side1 = side1;
      this.side2 = side2;
      double hypotenuse = Math.pow(Math.pow(this.side1, 2) + Math.pow(this.side2, 2),0.5);
      this.perimeter = this.side1 + this.side2 + hypotenuse;
      this.area = 0.5 * this.side1 * this.side2;
   }
   
   public double getArea(){
      return this.area;
   }
   
   public double getPerimeter(){
      return this.perimeter;
   }
   
   public boolean equals(){
      if(perimeter == area){
         return true;
      } else {
         return false;
      }
   }
   public String toString(){
      String toString = "Right Triangle  perimeter: " + this.perimeter + "   area: " + this.area;
      return toString;
   }
}