import java.lang.Math;

public class ComplexMath
{
   public double real, complex;
   
   public ComplexMath(double r, double c)
   {
      real = r;
      complex = c;
   }
   
   public void square()
   {
      double first = real * real;
      double middle = 2 * real * complex;
      double last = complex * complex;
      
      real = first - last;
      complex = middle;
   }
   
   public void add(ComplexMath math)
   {
      real += math.real;
      complex += math.complex;
   }

   public double length()
   {
      return Math.sqrt(real * real + complex * complex);
   }

   public String toString()
   {
      return real + " + " + complex + "i";
   }
   
   //public Complex
}