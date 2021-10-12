import java.lang.Math;


public class RegularPolygon extends Shape {
  
  private int numOfSides;
  private double radius;
  
  public RegularPolygon(int n, double r){
    super();
    this.numOfSides = n;
    this.radius = r;

  }
  public RegularPolygon(int n){
    this(n, 1.0d);
  }
  public RegularPolygon(){
    this(3);
  }

  public int getNumOfSides(){return this.numOfSides;}
  public double getRadius(){return this.radius;}

  public void setNumOfSides(int n){this.numOfSides = n;}
  public void setRadius(double r){this.radius = r;}

  public void setVertices()
  {
      double[] xLocal_ = new double[this.numOfSides];
      double[] yLocal_ = new double[this.numOfSides];

      double b = Math.PI/this.numOfSides;
      double a = 0;
      if(this.numOfSides %2 == 0) { a = b;}

      for(int i = 0; i < this.numOfSides; i++)
      {
        xLocal_[i] = this.radius * Math.sin(a - 2*i*b);
        yLocal_[i] = this.radius * Math.sin(a - 2*i*b);
      }

      this.setXLocal(xLocal_);
      this.setYLocal(yLocal_);
      
  }
  public boolean contains(double x, double y)
  {
      double leftx = 0;
      for(int i = 0; i < this.numOfSides; i++)
      {
        leftx = this.getXLocal()[i] < leftx ? this.getXLocal()[i] : leftx;
      }

      double b = Math.PI/this.numOfSides;
      double cosb = Math.cos(b);
      double sinb = Math.sin(b);

      for(int i = 0; i < this.numOfSides; i++)
      {
        if(x < leftx){ return true; }
        x = x*cosb - y*sinb;
        y = x*sinb + y*cosb;
      }
      return false;
  }

}