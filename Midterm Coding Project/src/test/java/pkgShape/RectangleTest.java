package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	public void Rectangle_Test1() throws Exception {
		new Rectangle(2, 4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Rectangle_Test2() throws Exception {
		new Rectangle(-2, 4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Rectangle_Test3() throws Exception {
		new Rectangle(2, -4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Rectangle_Test4() throws Exception {
		new Rectangle(-2, -4);
	}

	@Test
	public void getter_Test1() throws Exception {
		Rectangle rec = new Rectangle(2, 4);

		assertEquals(rec.getiWidth(), 2);
		assertEquals(rec.getiLength(), 4);
	}

	@Test
	public void setter_Test1() throws Exception {
		Rectangle rec = new Rectangle(2, 4);

		rec.setiWidth(3);
		rec.setiLength(5);

		assertEquals(rec.getiWidth(), 3);
		assertEquals(rec.getiLength(), 5);
	}

	@Test
	public void area_Test1() throws Exception {
		Rectangle rec = new Rectangle(2, 4);

		assertEquals(rec.area(), 8, 0.0001);
	}

	@Test
	public void perimeter_Test1() throws Exception {
		Rectangle rec = new Rectangle(2, 4);

		assertEquals(rec.perimeter(), 12, 0.0001);
	}

	@Test
	public void compareTo_Test1() throws Exception {
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();

		for (int i = 0; i < 10; i++) {
			int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);

			recs.add(new Rectangle(iWidth, iLength));
		}

		Collections.sort(recs);

		for (int i = 0; i < 9; i++) {
			assertTrue(recs.get(i).area() <= recs.get(i + 1).area());
		}

	}

}
