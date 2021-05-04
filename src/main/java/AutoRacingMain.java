import AutoRacing.InputScanner;
import AutoRacing.PrintMessage;
import AutoRacing.RunningCars;
import utils.AutoRacingStatus;

public class AutoRacingMain {
	static int roundCount;
	
	public static void main(String[] args) {
		PrintMessage.printRequestNameMessage();
		RunningCars cars = InputScanner.createCars();
		PrintMessage.printRequestRoundNumberMessage();
		roundCount = InputScanner.setRoundCount();
		if (cars.play(roundCount) == AutoRacingStatus.SUCCESS) {
			PrintMessage.printResultMessage(cars.getWinnerList());
		}
	}

}
