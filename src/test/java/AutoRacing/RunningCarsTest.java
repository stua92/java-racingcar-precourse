package AutoRacing;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import utils.AutoRacingStatus;

public class RunningCarsTest {
	ArrayList<Car> carList;

	@BeforeEach
	void setUp() {
		carList = new ArrayList<Car>();
		carList.add(new Car("car1", 0, 4));
		carList.add(new Car("car2", 1, 9));
		carList.add(new Car("car3", 2, 0));
	}

	@Test
	@DisplayName("play 테스트")
	void playTest() {
		RunningCars runningCars = new RunningCars(carList);
		assertThat(runningCars.play(2)).isEqualTo(AutoRacingStatus.SUCCESS);
	}
	
}
