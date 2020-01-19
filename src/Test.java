
public class Test {

	public static int pre(int n) {
		if (n >= 1) {
			return --n;
		} else {
			return 0;
		}
	}

	public static int add(int n, int m) {
		return n + m;
	}

	public static int diff(int m, int n) {
		if (m == 0) {
			return 0;
		} else if (n == 0) {
			return m;
		} else {
			return diff(pre(m), pre(n)); 	// In der Primitiven Rekursion wird für das Minus die im Skript definierte
											// "pre()" funktion verwendet.
		} 									// diff(m, n) = diff(pre(m), pre(n))
	}

	public static int absdiff(int m, int n) {
		return (add(diff(m, n), diff(n, m)));
	}

	public static int odd(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return (diff(2, add(odd(diff(n, 1)), 1)));
		}
	}
	
	public static int max(int m, int n) {
		return (add(diff(m, n), n));
	}
	
	public static int min(int m, int n) {
		return (diff(add(m, n), max(m, n)));
	}

	public static void main(String[] args) {
		System.out.println(diff(11, 1));
		System.out.println(absdiff(3, 8));
		System.out.println(odd(92));
		System.out.println(min(25, 7));
		System.out.println(max(5, 0));
	}

}
