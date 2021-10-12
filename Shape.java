import java.awt.Color;
import java.lang.Math;

public class Shape {
    private Color color;
    private boolean filled;

    private double theta; 
    private double xc; 
    private double yc;
    private double[] xLocal; 
    private double[] yLocal;

    /*
     * public Shape( Color color, boolean filled, double theta,double xc,double
     * yc,double[] xLocal, double[] yLocal) { this.color = }
     */
    public Shape() {
        return;
    }
    public Color getColor() {return this.color;}
    public boolean getFilled() {return this.filled;}

    public void setColor(Color sth) {this.color = sth;}
    public void setFilled(boolean sth) {this.filled = sth;}

    public double getTheta() {return this.theta;}
    public double getXc(){return this.xc;} 
    public double getYc(){return this.yc;}
    public double[] getXLocal(){return this.xLocal;}
    public double[] getYLocal(){return this.yLocal;}

    public void setTheta(double sth) {this.theta = sth;} 
    public void setXc(double sth){this.xc = sth;} 
    public void setYc(double sth){this.yc = sth;}
    public void setXLocal(double[] sth){this.xLocal = sth;} 
    public void setYLocal(double[] sth){this.yLocal = sth;}
    /*
    public void setVertices(double d) {
        return;
    }*/

    public void translate(double dx, double dy) {
        xc += dx; yc += dy; return;
    }

    void rotate(double dt) {
        theta += dt;
        return;
    }
  
    double transX(double x_, double y_)
    {
      return (x_ - xc)* Math.cos(-theta) - (y_ - yc)* Math.sin(-theta); 
    }
    double transY(double x_, double y_)
    {
      return (x_ - xc)* Math.sin(-theta) + (y_ - yc)* Math.cos(-theta); 
    }
  

}