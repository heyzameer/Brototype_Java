package Arrays.fumigation;

public class AvgNonPrime {
        public static void main(String[] args) {
            int[] array = {1,2,3,4,5,6};
            int n = array.length;

            int nonPrimeSum = 0;
            int nonPrimeCount = 0;

            for (int i = 0; i < n; i++) {
                if(isPrime(array[i])){
                    nonPrimeSum += array[i];
                    nonPrimeCount++;
                }
            }
            float avgNonPrime = (float) nonPrimeSum /nonPrimeCount;

            System.out.println("Avg of Non Prime NNumber is "+avgNonPrime);
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
