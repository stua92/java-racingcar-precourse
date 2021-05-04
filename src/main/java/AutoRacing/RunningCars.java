package AutoRacing;

import java.util.ArrayList;

import utils.AutoRacingStatus;
import utils.ValueState;

public class RunningCars {
	private ArrayList<Car> runningCars;

	public RunningCars(ArrayList<Car> runningCars) {
		this.runningCars = runningCars;
	}

	public ArrayList<Car> getCarList() {
		return runningCars;
	}

	public Car getCar(int carNumber) {
		return this.runningCars.get(carNumber);
	}

	public AutoRacingStatus play(int roundCount) {
		PrintMessage.excuteResultMessage();
		for (int i = 0; i < roundCount; i++) {
			carEachRun();
		}
		return AutoRacingStatus.SUCCESS;
	}

	public void carEachRun() {
		for (Car car : this.runningCars) {
			car.action();
		}
		PrintMessage.printRoundRunMessage(this.runningCars);
	}

	public ArrayList<String> getWinnerList() {
		ArrayList<String> winners = new ArrayList<String>();
		int maxTrackCount = getMaxTrackCount();
		winners = getMaxTrackNames(maxTrackCount);
		return winners;
	}

	public int getMaxTrackCount() {
		int maxCount = ValueState.ZERO;
		for (Car car : this.runningCars) {
			maxCount = comparingInt(car.getTrack(), maxCount);
		}
		return maxCount;
	}

	public int comparingInt(int trackNum, int maxCount) {
		if (trackNum > maxCount) {
			return trackNum;
		}
		return maxCount;
	}

	public ArrayList<String> getMaxTrackNames(int maxCount) {
		ArrayList<String> winners = new ArrayList<String>();
		for (Car car : this.runningCars) {
			addWinners(winners, car, maxCount);

		}
		return winners;
	}

	public void addWinners(ArrayList<String> winners, Car car, int maxCount) {
		if (car.getTrack() == maxCount) {
			winners.add(car.getName());
		}
	}

}
