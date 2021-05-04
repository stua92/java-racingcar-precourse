package AutoRacing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	Car car1;
	Car car2;
	Car car3;

	@BeforeEach
	void setUp() {

		car1 = new Car("car1", 0, 4);
		car2 = new Car("car2", 1, 9);
		car3 = new Car("car3", 2, 0);
	}

	@Test
	@DisplayName("Car track 위치값 검증")
	void carTrackTest() {
		assertThat(car1.getTrack() == 1).isTrue();
		assertThat(car2.getTrack() == 2).isTrue();
		assertThat(car3.getTrack() == 1).isFalse();
	}

	@Test
	@DisplayName("Car 랜덤 숫자값 검증")
	void carNumberTest() {
		assertThat(car1.getRandomValue() == 1).isTrue();
		assertThat(car2.getRandomValue() == 2).isTrue();
		assertThat(car3.getRandomValue() == 1).isFalse();
	}

	@Test
	@DisplayName("car Action 테스트 (track 이동)")
	void carActionTest() {
		car1.action();
		car3.action();
		assertThat(car1.getTrack() == 1).isTrue();
		assertThat(car3.getTrack() == 2).isTrue();
	}

}
