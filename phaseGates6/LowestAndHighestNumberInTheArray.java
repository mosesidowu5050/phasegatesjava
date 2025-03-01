import java.util.Arrays;
public class LowestAndHighestNumberInTheArray {

public static void main(String[] args){

int[] numbers = {1, 4, 6, 2, 5};

int[] result = findLowestAndHighestNumber (numbers);

System.out.println(Arrays.toString(result));

}


  public static int[] findLowestAndHighestNumber (int[] numbers){
  int lowestNumber = numbers[0];
  int highestNumber = numbers[0];


  for(int count = 0; count < numbers.length; count++){
  if(numbers[count] > lowestNumber){
  lowestNumber = numbers[count];
}

if (numbers[count] < highestNumber){
highestNumber = numbers[count];
  }
}
return new int[]{lowestNumber, highestNumber};

  }
}