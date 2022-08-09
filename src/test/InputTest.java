package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.libs.Employee;
import com.example.libs.Input;

public class InputTest {

	@Test
	public void testInput() {
		Employee [] array = new Employee[1];
		Input input = new Input(array);
		int count = input.input();
//		assertNotNull(array[0]);
//		assertEquals(1, count);
		assertEquals("A512", array[0].getEmpno());
	}

}
