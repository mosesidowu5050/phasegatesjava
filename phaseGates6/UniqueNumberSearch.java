public class UniqueNumberSearch { 
   public static void main(String [] args){

int[] array = {1, 2, 3, 2};

System.out.println(findUniqueNumberInAnArray(array));

}

public static int findUniqueNumberInAnArray (int[] array){

int[] numbers = new int[arrays.length];
for(int count = 0; count < arrays.length; count++){	

int sumOfUnique = 0;
for(int counter = 0; counter < arrays.length; counter++){
if(arrays[count] == arrays[counter]){

sumOfUnique++;
   }
}

numbers[count] = sumOfUnique;

}

int result = 0;
for(int number =0; number < arrays.length; number++){
if(numbers[number] == 1){
result = result + arrays[number];
  }
}

return result;	
   }
}