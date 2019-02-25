package test.org.jvalidation.matcher;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.jvalidation.Assertive.require;
import static org.jvalidation.Matchers.emptyList;
import static org.jvalidation.Matchers.not;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.jvalidation.matcher.Not;
import org.jvalidation.matcher.list.EmptyList;

public class NotTest {

	@Test
	public void shouldReturnTrueWithValidTarget() {
		
		assertTrue(new Not<List<?>>(new EmptyList()).execute(Arrays.asList(2)));
	}
	
	@Test
	public void shouldThrowsAnExceptionWhenTheTargetIsInvalid() {
		
		assertThrows(Exception.class, () -> {
			require(Arrays.asList(), not(emptyList()));
		});
	}
}
