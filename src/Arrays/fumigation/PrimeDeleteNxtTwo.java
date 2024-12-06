package Arrays.fumigation;

public class PrimeDeleteNxtTwo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            if (isPrime(array[i])){
                i++;
                if(i+1< array.length){
                   i++;
                }
            }
        }
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num%2==0){
            return false;
        }
        for (int i = 3; i< Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
