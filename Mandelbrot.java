import java.awt.*;
import java.applet.Applet;
import java.lang.Math;

public class Mandelbrot extends Applet
{
   public void init()
   {
      setSize(1920,1080);
   }
   
   public void paint(Graphics g)
   {
      for(int x = 0; x <= 1920; x++)
      {
         for(int y = 0; y <= 1080; y++)
         {
            if(isDrawable(x, y))
            {
               g.setColor(Color.BLACK);
               g.fillRect((int)x,(int)y,1,1);
               
            }
         }
      }
      
   }
   
   public boolean isDrawable(double x, double y)
   {
      double xx = (x-960)/425;
      double yy = (y-540)/425;
      ComplexMath math = new ComplexMath(xx, yy);
      
      ComplexMath MATH = new ComplexMath(0,0);
            
      for(int i = 0; i < 200; i++)
      {
         MATH.square();
         MATH.add(math);
         if((Math.abs(MATH.real - math.real) >= 2.5) || (Math.abs(MATH.complex-math.complex) >= 2.5))
            return false;
      }
      return true;
   }
}