public class EquilateralTriangle implements Shapes {
   private double side, perimeter, area;
   
   public EquilateralTriangle(double side){
      this.side = side;
      this.area = (Math.sqrt(3)/4)*(this.side * this.side);
      this.perimeter = this.side * 3;
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
      String toString = "Equilateral Triangle  perimeter: " + this.perimeter + "   area: " + this.area;
      return toString;
   }
}
