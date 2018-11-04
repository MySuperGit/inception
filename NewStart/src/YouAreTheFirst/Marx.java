package YouAreTheFirst;

public class Marx {

	public static void main(String[] args) {

		int num = 0;

		for (int men = 0; men <= 10; men++) {

			for (int women = 0; women <= 20; women++) {

				if (true) {

					int sun = 3 * men + 2 * women + 1 * (30 - men - women);

					if (sun == 50) {

						System.out.println("男人：" + men + "，女人：" + women + "，小孩：" + (30 - men - women));

						num++;

					}

				}

			}

		}

		System.out.println("总计情况有" + num + "种！");

	}

}
