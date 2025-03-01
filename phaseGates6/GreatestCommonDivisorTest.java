import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GreatestCommonDivisorTest {

	GreatestCommonDivisor greatestDivisor = new GreatestCommonDivisor();

	@Test
	public void testToFindGreatestDivisorBetweenTwoAndFour (){
	int actual = greatestDivisor.findGreatestDivisor(2, 4);
	int expected = 2;
	assertEquals(expected, actual);
    }

	@Test
	public void testToFindGreatestDivisorBetweenSixteenAndTwentyFour(){
	int actual = greatestDivisor.findGreatestDivisor(16, 24);
	int expected = 8;
	assertEquals(expected, actual);
    }

	@Test
	public void testToFindGreatestDivisorBetweenTwoNumbers(){
	int actual = greatestDivisor.findGreatestDivisor(-1, 1);
	int expected = 0;
	assertEquals(expected, actual);
   }
}