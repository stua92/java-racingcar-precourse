package AutoRacing;

import java.util.ArrayList;
import java.util.Scanner;

public class InputScanner {
	final static int ZERO = 0;
	static Scanner scanner = new Scanner(System.in);

	public static RunningCars createCars() {
		String input = scanner.nextLine();
		RunningCars cars;
		cars = new RunningCars(splitToCarArrayList(input));
		return cars;
	}

	public static ArrayList<Car> splitToCarArrayList(String input) {
		String[] carNameAry = input.split(",");
		ArrayList<Car> cars = new ArrayList<Car>();
		for (String carName : carNameAry) {
			cars.add(new Car(carName, ZERO, ZERO));
		}
		return cars;
	}

	public static int setRoundCount() {
		return scanner.nextInt();
	}
	
}
