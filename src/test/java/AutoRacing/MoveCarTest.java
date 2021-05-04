package AutoRacing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import utils.CarAction;

public class MoveCarTest {

	@Test
	@DisplayName("자동차 움직임 테스트")
	void validationCheckTest() {
		assertThat(MoveCar.checkMotion(3) == CarAction.STOP).isTrue();
		assertThat(MoveCar.checkMotion(4) == CarAction.RUN).isTrue();
	}
	
}
