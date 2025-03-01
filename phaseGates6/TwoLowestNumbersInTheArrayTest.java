import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TwoLowestNumbersInTheArrayTest {

	TwoLowestNumbersInTheArray twoLowest = new TwoLowestNumbersInTheArray();

	@Test
	public void testToFindTwoLowestNumbers (){
	int[] numbers = {2, 2, 1};
	int[] actual = twoLowest.findTwoLowestNumbers(numbers);
	int[] result = {1, 2};
	assertArrayEquals(actual, result);
   }

}