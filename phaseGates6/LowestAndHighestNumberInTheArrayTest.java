import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LowestAndHighestNumberInTheArrayTest {

		LowestAndHighestNumberInTheArray lowestAndHighest = new LowestAndHighestNumberInTheArray();

	@Test
	public void testToFindLowestAndHghestNumberInAnArray (){
	int[] numbers = {1, 4, 6, 2, 5};
	int[] actual = lowestAndHighest.findLowestAndHighestNumber(numbers);
	int[] result = {6, 1};
	assertArrayEquals(actual, result);

   }

	@Test
	public void testToFindNegativeLowestAndHghestNumberInAnArray (){
	int[] numbers = {-10, -4, -26, -62, -5};
	int[] actual = lowestAndHighest.findLowestAndHighestNumber(numbers);
	int[] result = {-4, -62};
	assertArrayEquals(actual, result);
   }
}