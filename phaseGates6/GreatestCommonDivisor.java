public class GreatestCommonDivisor{
   public static void main(String[] args){


int result = findGreatestDivisor (16, 24);
System.out.println(result);
}

public static int findGreatestDivisor (int firstDivisor, int secondDivisor){

         if (secondDivisor == 0){
     
           return firstDivisor;
} else {

return findGreatestDivisor (secondDivisor, firstDivisor % secondDivisor);

     }

   }
}

