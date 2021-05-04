package AutoRacing;

import java.util.ArrayList;

public class PrintMessage {

	public static void printRequestNameMessage() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
	}

	public static void printRequestRoundNumberMessage() {
		System.out.println("시도할 횟수는 몇회인가요?");
	}

	public static void printRoundRunMessage(ArrayList<Car> cars) {
		for (Car car : cars) {
			System.out.print(car.getName() + " : ");
			printTrack(car.getTrack());
		}
		System.out.println();
	}

	public static void printResultMessage(ArrayList<String> winers) {
		for (String Name : winers) {
			System.out.print(Name + " ");
		}
		System.out.print("가 최종 우승했습니다.");
	}

	public static void excuteResultMessage() {
		System.out.println("실행 결과");
	}

	public static void printTrack(int trackCount) {
		for (int i = 0; i < trackCount; i++) {
			System.out.print("-");
		}
		System.out.println("");
	}

}
