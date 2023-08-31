package practice;

import java.util.Random;

public class PracticeSwitch {

	public static void PracticeSwhich() {
		int[] array = new int[10];

		Random rand = new Random();
		for (int i = 0; i < arraay.length; i++) {
			array[i] = 1 + rand.nextInt(5);
		}

		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 1:
				System.out.println("勇者");
				break;

			case 2:
				System.out.println("バトルマスター");

			case 3:
				System.out.println("パラディン");

			case 4:
				System.out.println("海賊");

			case 5:
				System.out.println("魔法剣士");
			}
		}
	}

}
