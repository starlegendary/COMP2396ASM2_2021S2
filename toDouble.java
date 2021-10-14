interface toDouble {
    public double func(double x, double y, double xc, double yc, double theta);
    public double func(Shape sth, int param);
}
//toLocalX:: double x,y -> double LocalX
class toLocal implements toDouble{
    public double func(double x, double y, double xc, double yc, double theta){return 1.0;};
    public double func(Shape sth, int param) {
        return func(sth.getXLocal()[param], sth.getYLocal()[param],sth.getXc(), sth.getYc(), sth.getTheta());
    };
}
class toLocalX extends toLocal {
    public double func(double x, double y, double xc, double yc, double theta) {return x*Math.cos(theta) - y*Math.sin(theta) + xc;}
}
//toLocalY:: double x,y -> double Localy
class toLocalY extends toLocal {
    public double func(double x, double y,  double xc, double yc, double theta){ return x*Math.sin(theta) + y*Math.cos(theta) + yc;}
}