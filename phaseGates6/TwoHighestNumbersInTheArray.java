import java.util.Arrays;
public class TwoHighestNumbersInTheArray {

public static void main(String[] args){

int[] numbers = {1, 4, 5, 6, 9, 7, 10, 9};

int[] result = findTwoHighestNumbers(numbers);

System.out.println(Arrays.toString(result));

}


  public static int[] findTwoHighestNumbers (int[] numbers){
  int firstHighest = numbers[0];
  int secondHighest = numbers[1];


  for(int count = 0; count < numbers.length; count++){
  if(numbers[count] > firstHighest){
  secondHighest = firstHighest;

  firstHighest = numbers[count];
}


if (numbers[count] > secondHighest && numbers[count] < firstHighest){
secondHighest = numbers[count];
  }
}
return new int[]{firstHighest, secondHighest};

  }
}