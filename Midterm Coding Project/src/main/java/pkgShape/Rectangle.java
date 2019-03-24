package pkgShape;

import java.util.Comparator;

public class Rectangle extends Shape implements Comparable {

	private int iWidth;
	private int iLength;

	public Rectangle(int iWidth, int iLength) throws Exception {
		super();

		if (iWidth < 0 || iLength < 0) {
			throw new IllegalArgumentException("Width and length must be positive");
		} else {
			this.iWidth = iWidth;
			this.iLength = iLength;
		}
	}

	public int getiWidth() {
		return this.iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return this.iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	@Override
	public double area() {
		return (double) this.iLength * this.iWidth;
	}

	@Override
	public double perimeter() throws Exception {
		return (double) 2 * (this.iLength + this.iWidth);
	}

	public int compareTo(Object obj) {
		Rectangle rec = (Rectangle) obj;

		return (int) (this.area() - rec.area());
	}

}
