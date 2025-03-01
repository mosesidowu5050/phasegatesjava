import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TwoHighestNumbersInTheArrayTest {

	TwoHighestNumbersInTheArray twoHighest = new TwoHighestNumbersInTheArray();

	@Test
	public void testToFindTwoHighestNumber (){
	int[] numbers = {1, 4, 5, 6, 9, 7, 10, 9};
	int[] actual = twoHighest.findTwoHighestNumbers(numbers);
	int[] result = {10, 9};
	assertArrayEquals(actual, result);
   }

	@Test
	public void testToFindTwoHighestInAnArray (){
	int[] numbers = {1, 6, 7, 8, 1000};
	int[] actual = twoHighest.findTwoHighestNumbers(numbers);
	int[] result = {1000, 8};
	assertArrayEquals(actual, result);
   }

	@Test
	public void testToFindAnotherTwoHighestNumber (){
	int[] numbers = {-10, -7, -9, -1, 0};
	int[] actual = twoHighest.findTwoHighestNumbers(numbers);
	int[] result = {0, -1};
	assertArrayEquals(actual, result);
   }

	@Test
	public void testToFindNewTwoHighestNumber (){
	int[] numbers = {1, 1, 1, 1, 1};
	int[] actual = twoHighest.findTwoHighestNumbers(numbers);
	int[] result = {1, 1};
	assertArrayEquals(actual, result);
   }
}