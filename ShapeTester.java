import java.awt.Color;
public class ShapeTester {
  public static void main(String[] args) {
    Shape sth = new Shape();
		System.out.println(sth.getXc());
		System.out.println(sth.getYc());
		System.out.println(sth.getTheta());
		System.out.println(sth.getFilled());
    System.out.println(sth.getColor());
		int[] x = new int[sth.getXLocal().length];
		x = sth.getX();
		for (int i=0;i<x.length;i++)
		{
			System.out.print(x[i] + " ");
		} 
		System.out.println();
		int[] y = new int[sth.getYLocal().length];
		y = sth.getY();
		for (int i=0;i<y.length;i++)
		{
			System.out.print(y[i] + " ");
		}

    Color color = new Color(255,0,0);
		sth.setColor(color);
		sth.setFilled(true);
    sth.setTheta(Math.PI/2);
    sth.setXc(1.0);
    sth.setYc(2.5);
		double[] xLocal = new double[] {1.0, 3.5, 4.3};
		sth.setXLocal(xLocal);
		double[] yLocal = new double[] {3.0, 6.5, 8.3};
		sth.setYLocal(yLocal);
		sth.translate(1, 50);
		sth.rotate(90);
		System.out.println(sth.getXc());
		System.out.println(sth.getYc());
		System.out.println(sth.getTheta());
		System.out.println(sth.getFilled());
    System.out.println(sth.getColor());
		x = sth.getX();
		for (int i=0;i<x.length;i++)
		{
			System.out.print(x[i] + " ");
		} 
		System.out.println();
		y = sth.getY();
		for (int i=0;i<y.length;i++)
		{
			System.out.print(y[i] + " ");
		}//for loop ended
  }
}