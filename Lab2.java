import java.util.Scanner;

public final class Lab2 {
	
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		double x, y, z;
		Point3d p1, p2;

		// Point3d p1
		System.out.print("¬ведите координату x точки 1: ");
		x = in.nextDouble();
		System.out.print("¬ведите координату y точки 1: ");
		y = in.nextDouble();
		System.out.print("¬ведите координату z точки 1: ");
		z = in.nextDouble();
		p1 = new Point3d(x, y, z);
		System.out.println();

		// Point3d p2
		System.out.print("¬ведите координату x точки 2: ");
		x = in.nextDouble();
		System.out.print("¬ведите координату y точки 2: ");
		y = in.nextDouble();
		System.out.print("¬ведите координату z точки 2: ");
		z = in.nextDouble();
		p2 = new Point3d(x, y, z);
		System.out.println();
		
		// Point3d p3
		Point3d p3 = new Point3d();

		in.close();
		

		if (p1.equals(p2) || p1.equals(p3) || p2.equals(p3)) {
			System.out.println("“очки наход€тс€ в одном и том же месте !");
		}
		else {
			System.out.println(" = " + computeArea(p1, p2, p3));
		}
	}

	public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
		double s;
		double p;
		double a, b, c;
		
		a = Math.abs(p1.distanceTo(p2));
		b = Math.abs(p2.distanceTo(p3));
		c = Math.abs(p1.distanceTo(p3));
		p = (a + b + c) / 2;
		s = Math.pow((p*(p - a)*(p - b)*(p - c)), 0.5);
		
		return s;
	}
}