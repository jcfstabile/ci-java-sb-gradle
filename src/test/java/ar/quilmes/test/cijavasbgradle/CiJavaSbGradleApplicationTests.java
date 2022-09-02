package ar.quilmes.test.cijavasbgradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiJavaSbGradleApplicationTests {

	@Test
	void passingTest() {
        assertEquals(42, Integer.sum(23, 19));
	}

}
