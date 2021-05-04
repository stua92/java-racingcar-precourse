package AutoRacing;

import java.util.Random;

public class CarRandomValueGenerator {
	public static final int MIN_NO = 0;
	public static final int MAX_NO = 9;
	private int no;

	public static void randomValueValidationCheck(int randomNumber) {
		if (randomNumber < MIN_NO || randomNumber > MAX_NO) {
			throw new IllegalArgumentException("숫자는 1부터 9의 값이어야 합니다.");
		}
	}

	public static int createRandomValue() {
		Random random = new Random();
		int randomNumber = random.nextInt(MAX_NO + 1);
		randomValueValidationCheck(randomNumber);
		return randomNumber;
	}
}
