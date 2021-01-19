
public class Point2d {
	
	protected double x;
	protected double y;

	// Конструкторы
	public Point2d () {
		this (0, 0);
	}

	public Point2d (double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point2d (int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Работа с полями
	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	// Сравнение на равенство координат
	public boolean equals(Object obj) {
		Point2d p;
		if (obj instanceof Point2d) p = (Point2d) obj;
		else return false;
		double x, y;
		x = p.getX();
		y = p.getY();
		return (this.x == x & this.y == y);
	}

	// Рассчёт расстояния между точками
	public double distanceTo(Point2d p) {
		double x, y;
		x = p.getX();
		y = p.getY();
		double diffX = Math.pow(x - this.x, 2);
		double diffY = Math.pow(y - this.y, 2);
		return Math.pow(diffX + diffY, 0.5);
	}
	
}