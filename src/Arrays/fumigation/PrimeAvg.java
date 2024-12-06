package Arrays.fumigation;

public class PrimeAvg {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int n = array.length;

        int primeSum = 0;
        int primeCount = 0;

        for (int i = 0; i < n; i++) {
            if(isPrime(array[i])){
                primeSum += array[i];
                primeCount++;
            }
        }
        int avgPrime = primeSum/primeCount;

        System.out.println("Avg of Prime NNumber is "+avgPrime);
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
