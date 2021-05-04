package AutoRacing;

import utils.CarAction;

public class Car {
	private String name;
	private int track;
	private int randomValue;

	public Car(String name, int track, int number) {
		this.name = name;
		this.randomValue = number;
		this.track = track;
	}

	public String getName() {
		return name;
	}

	public int getRandomValue() {
		return randomValue;
	}

	public void setRandomValue(int randomValue) {
		this.randomValue = randomValue;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	private void move() {
		track++;
	}

	public void action() {
		if (MoveCar.checkMotion(this.drawNumber()) == CarAction.RUN) {
			this.move();
		}
	}

	private int drawNumber() {
		this.setRandomValue(CarRandomValueGenerator.createRandomValue());
		return this.getRandomValue();
	}
	
}
