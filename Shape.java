import java.awt.Color;
public class Shape{
	private Color color;
	private boolean filled;
	private double theta, xc,yc;
	private double[] xLocal,yLocal;

	public Color getColor() {		return color;}
	public boolean getFilled() {return filled;	}
	public double getTheta() {return theta;}
	public double getXc() {return xc;}
	public double getYc() {return yc;}

	public double[] getXLocal() {	return xLocal;}
	public double[] getYLocal() {	return yLocal;}
	
	public void setColor(Color color) {this.color = color;}
	public void setFilled(boolean filled)	{this.filled = filled;}
	public void setTheta(double theta) {this.theta = theta;}
	public void setXc(double xc) {this.xc = xc;}
	public void setYc(double yc) {this.yc = yc;}
	
  public void setXLocal(double[] xLocal) {this.xLocal = xLocal;}
	public void setYLocal(double[] yLocal) {this.yLocal = yLocal;}
	
	public void translate(double dx, double dy){ this.xc += dx; this.yc += dy;}
	public void rotate(double dt) {	this.theta =this.theta + dt;}

  public int[] get(toDouble callable){
    int n = this.getXLocal().length;
		int[] xs_ = new int[n]; 
		for(int i=0;i<n;i++) {xs_[i] = (int)(Math.round(callable.func(this , i)));}
		return xs_;
	}
	public int[] getX() {  toDouble sth = new toLocalX();  return get(sth);}
	public int[] getY() {  toDouble sth = new toLocalY();  return get(sth);}
}