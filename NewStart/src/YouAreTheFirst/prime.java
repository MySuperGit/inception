package YouAreTheFirst;

public class prime {

	public static void main(String[] args) {

		/*
		 * for (int i = 2; i <= 200; i++) { int c = 0; for (int b = 2; b < i; b++) { if
		 * (i % b != 0) { c++; } } if (c == i - 2) { System.out.println(i + "是质数"); }
		 * else { System.out.println(i + "不是质数"); } }
		 */

		int num = 101;
		// 循环2-200
		while (num <= 200) {
			int c = 0;
			int sun = 2;

			while (sun < num) {
				if (num % sun != 0) {
					c++;
				}
				sun++;
			}
			if (c == num - 2) {
				System.out.print(num + "\t");
			}
			num++;

		}
	}
}