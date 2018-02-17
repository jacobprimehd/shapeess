public class Square implements Shapes {
   private double side, perimeter, area;
   
   public Square(double side){
      this.side = side;
      this.perimeter = this.side * 4;
      this.area = this.side * this.side;
   }
   public double getArea(){
      return this.area;
   }
   public double getPerimeter(){
      return this.perimeter;
   }
   public boolean equals(){
      boolean t = true;
      boolean f = false;
      if(perimeter == area){
         return t;
      } else {
         return f;
      }
   }
   public String toString(){
      String toString = "Square  perimeter: " + this.perimeter + "   area: " + this.area;
      return toString;
   }
}