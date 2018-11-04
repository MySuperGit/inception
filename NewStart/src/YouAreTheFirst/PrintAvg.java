package YouAreTheFirst;

import java.util.Scanner;

public class PrintAvg {

	/**
	 * 15. 首先要求用户输入学生的数目放入到变量 n 中， 如果这个数大于 0，那么就循环 n 次接收 n 个学生的成绩， 计算总分及平均分。
	 * 否则输出“学生的人数不能为负数。
	 * 
	 * @author Administrator
	 *
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("请输入学生数量：");
		int num = input.nextInt();
		// 成绩, 总成绩,平均分
		double grade = 0, sun = 0, avg;
		if (num != 0 && num > 0) {
			int i = num;
			do {

				System.out.print("请输入成绩：");
				grade = input.nextDouble();
				sun = sun + grade;
				i--;
			} while (i>0);

			System.out.println("grade==>>" + grade);
			System.out.println("sun==>>" + sun);

			avg = sun / num;// 求平均分
			System.out.println("总分：" + sun);
			System.out.println("平均分：" + avg);

		} else {
			System.out.println("学生数量不能为0或者负数");
		}

	}
}
