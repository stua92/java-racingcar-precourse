package AutoRacing;

import utils.CarAction;

public class MoveCar {
	public static CarAction checkMotion(int randomValue) {
		if (randomValue >= 4) {
			return CarAction.RUN;
		}
		return CarAction.STOP;
	}
}
