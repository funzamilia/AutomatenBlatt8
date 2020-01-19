
public class Test {
	
	public static int pre(int n) {
		if(n >= 1) {
			return --n;
		} else {
			return 0;
		}
	}
	
	/*public static int add(int n, int m) {
		if(n == 0) {
			return m;
		} else {
			return (add(n, m) + 1);
		}
	}*/
	
	public static int diff(int m, int n) {
		if(m == 0) {
			return 0;
		} else if(n == 0) {
			return m;
		} else {
			return diff(pre(m), pre(n)); 	// In der Primitiven Rekursion wird für das Minus die im Skript definierte "pre()" funktion verwendet. 
		}									// diff(m, n) = diff(pre(m), pre(n))
	}
	
	public static int absdiff(int m, int n) {
		return (diff(m, n) + diff(n, m));
	}

	public static void main(String[] args) {
		System.out.println(diff(11,1));
		System.out.println(absdiff(3, 8));
	}

}
