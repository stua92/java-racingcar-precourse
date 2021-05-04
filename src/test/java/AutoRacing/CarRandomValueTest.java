package AutoRacing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarRandomValueTest {
	@Test
	@DisplayName("car 객체의 random value 벙위 체크 예외 테스트")
	void validationCheckTest() {
		assertThatThrownBy(() -> CarRandomValueGenerator.randomValueValidationCheck(10))
			.isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> CarRandomValueGenerator.randomValueValidationCheck(-1))
			.isInstanceOf(IllegalArgumentException.class);
	}

}

