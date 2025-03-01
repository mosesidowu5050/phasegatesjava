import java.util.Arrays;
public class TwoLowestNumbersInTheArray {

public static void main(String[] args){

int[] numbers = {2, 2, 1};

int[] result = findTwoLowestNumbers(numbers);

System.out.println(Arrays.toString(result));

}


  public static int[] findTwoLowestNumbers (int[] numbers){
  int firstLowest = numbers[0];
  int secondLowest = numbers[1];


  for(int count = 0; count < numbers.length; count++){
  if(numbers[count] < firstLowest){
  secondLowest = firstLowest;

  firstLowest = numbers[count];
}


if (numbers[count] > secondLowest && numbers[count] < firstLowest){
secondLowest = numbers[count];
  }
}
return new int[]{firstLowest, secondLowest};

  }
}