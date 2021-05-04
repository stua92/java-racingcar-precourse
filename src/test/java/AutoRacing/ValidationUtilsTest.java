package AutoRacing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {
	@Test
	@DisplayName("야구_숫자_1_9검증")
	void validationCheckTest() {
		assertThat(ValidationUtils.validNo(9)).isTrue();
		assertThat(ValidationUtils.validNo(9)).isTrue();
	}
}
