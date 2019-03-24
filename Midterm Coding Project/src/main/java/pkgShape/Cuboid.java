package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {// implements Comparable<Cuboid> {

	private int iDepth;

	public Cuboid(int iWidth, int iLength, int iDepth) throws Exception {
		super(iWidth, iLength);

		if (iDepth < 0) {
			throw new IllegalArgumentException("Depth must be positive");
		} else {
			this.setiDepth(iDepth);
		}
	}

	public int getiDepth() {
		return this.iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public double volume() {
		return (double) getiLength() * getiWidth() * this.iDepth;
	}

	@Override
	public double area() {
		return 2 * (this.getiLength() * this.getiWidth() + this.getiLength() * this.getiDepth()
				+ this.iDepth * getiWidth());
	}

	@Override
	public double perimeter() throws Exception {
		throw new UnsupportedOperationException("Cuboids do not have peremiters");
	}

	@Override
	public int compareTo(Object obj) {
		Cuboid cub = (Cuboid) obj;

		return (int) (this.area() - cub.area());
	}
}

class SortByArea implements Comparator<Cuboid> {

	SortByArea() {
		super();
	}

	public int compare(Cuboid cub1, Cuboid cub2) {
		return (int) (cub1.area() - cub2.area());
	}
}

class SortByVolume implements Comparator<Cuboid> {

	SortByVolume() {
		super();
	}

	public int compare(Cuboid cub1, Cuboid cub2) {
		return (int) (cub1.volume() - cub2.volume());
	}
}