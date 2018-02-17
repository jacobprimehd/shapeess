public class ScaleneTriangle implements Shapes{
   private double s1, s2, s3, s4, perimeter, area;
   
   public ScaleneTriangle(double side1,double side2,double side3){
      this.s1 = side1;
      this.s2 = side2;
      this.s3 = side3;
      this.s4 = (s1 + s2 + s3 )/ 2 ;
      this.area = Math.sqrt(this.s4 * (this.s4 - this.s1) * (this.s4 - this.s2) * (this.s4 - this.s3));
      this.perimeter = this.s1 + this.s2 + this.s3;
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
      String toString = "Scalene Triangle  perimeter: " + this.perimeter + "   area: " + this.area;
      return toString;
   }
}
