public class RegularPolygonTester {
  public static void main(String[] args) {
    RegularPolygon sth = new RegularPolygon();
		System.out.println(sth.getNumOfSides());
		System.out.println(sth.getRadius());
    System.out.println(sth.contains(0.0, 0.0));
    
    sth.setNumOfSides(4);
    sth.setRadius(1.0);
		System.out.println();
    
    System.out.println(sth.getNumOfSides());
		System.out.println(sth.getRadius());
    System.out.println(sth.contains(0.0, 0.0));
  }
}