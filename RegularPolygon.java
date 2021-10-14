import java.awt.Color;
public class RegularPolygon extends Shape{
	private int numOfSides;
	private double radius;
	
	public RegularPolygon(int n, double r)
	{
		this.numOfSides = n<3? 3:n;
    this.radius = r<0? 0:r;
		this.setVertices();
	}
	public RegularPolygon(int n){this(n,1.0);}
	public RegularPolygon(){this(3);}
	
	public int getNumOfSides(){return this.numOfSides;}
	public double getRadius(){return this.radius;}
  public void setNumOfSides(int n){
		this.numOfSides = n<3? 3:n;
		this.setVertices();
	}
	public void setRadius(double r)
	{
    this.radius = r<0? 0:r;
		this.setVertices();
	}

	private void setVertices() {
    int n = this.getNumOfSides();
		double a = (n==0)? Math.PI/n:0;
		double pi2 = (2*Math.PI)/n;
		double [] xs_ = new double[n];
		double [] ys_ = new double[n];
		for(int i=0;i<n;i++)
		{
			xs_[i] = (this.getRadius())*Math.cos(a - i*pi2);
			ys_[i] = (this.getRadius())*Math.sin(a - i*pi2);
		}
		setXLocal(xs_);
    setYLocal(ys_);
	}
  //rotate x,y by degree angle
  public double rotateX(double x, double y, double angle) {return  x*Math.cos(angle) - y*Math.sin(angle);}
	
  public boolean contains(double x, double y)
	{
    int n = this.getNumOfSides();
		double [] x_ = getXLocal();
    //find the minimum X among the polygon vertices
		double minx = x_[0];
		for(int i = 1; i < n; i++)
		{	
			minx = (x_[i] <= minx)? x_[i]:minx;
		}
    //convert screen to local coordinate
    toDouble f = new toLocalX();
		double local_x = f.func(x - this.getXc(), y - this.getYc(),this.getXc(),this.getYc(),-this.getTheta());
    //check if they are on left
		double new_x = local_x;
		for(int i = 1; i <= n ; i++)	
		{
			if(new_x < minx){ return false; }
			new_x = rotateX(x, y, 2*i*Math.PI/n);
		}
		return true;
	}
}