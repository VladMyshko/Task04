public class CheckTriangle {

	static boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		double a;
		double b;
		double c;

		a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		return c < a + b && b < a + c && a < b + c;

	}

	static boolean isRectangular(int x1, int y1, int x2, int y2, int x3, int y3) {
		if (!isTriangle(x1, y1, x2, y2, x3, y3)) {
			return false;
		}
		double a;
		double b;
		double c;

		a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		return a == Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2)) || b == Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2))
				|| c == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

}