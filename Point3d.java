public class Point3d extends Point2d {
	
	protected double z;

	// Конструкторы
	public Point3d () {
		this (0, 0, 0);
	}

	public Point3d (double x, double y, double z) {
		super(x,y);
		this.z = z;
	}

	public Point3d (int x, int y, int z) {
		super(x,y);
		this.z = z;
	}

	// Работа с полями
	public double getZ() {
		return this.z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	// Сравнение на равенство координат
	public boolean equals(Object obj) {
		Point3d p;
		if (obj instanceof Point3d) p = (Point3d) obj;
		else return false;
		double x, y, z;
		x = p.getX();
		y = p.getY();
		z = p.getZ();
		return (this.x == x & this.y == y & this.z == z);
	}
	
	// Рассчёт расстояния между точками
	public double distanceTo(Point3d p) {
		double x, y, z;
		x = p.getX();
		y = p.getY();
		z = p.getZ();
		double diffX = Math.pow(x - this.x, 2);
		double diffY = Math.pow(y - this.y, 2);
		double diffZ = Math.pow(z - this.z, 2);
		return Math.pow(diffX + diffY + diffZ, 0.5);
	}
}