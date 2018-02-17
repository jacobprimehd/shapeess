public class IsoclesesTriangle implements Shapes{
   private double side1, side2, perimeter, area;
   
   public IsoclesesTriangle(double side1,double side2){
      this.side1 = side1;
      this.side2 = side2;
      this.area = (this.side2/4)*Math.sqrt((4*this.side1*this.side1)-(this.side2*this.side2));
      this.perimeter = (this.side1 * 2) + this.side2;
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
      String toString = "Isocleses Triangle  perimeter: " + this.perimeter + "   area: " + this.area;
      return toString;
   }
}