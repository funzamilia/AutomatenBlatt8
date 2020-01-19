
public class Test {
	
	public static int diff(int m, int n) {
		if(m == 0) {
			return 0;
		} else if(n == 0) {
			return m;
		} else {
			return diff(m - 1, n - 1); 	// In der Primitiven Rekursion wird für das Minus(- 1) die im Skript definierte "pre()" funktion verwendet. 
		}								// diff(m, n) = diff(pre(m), pre(n))
	}

	public static void main(String[] args) {
		System.out.println(diff(11,1));
	}

}
