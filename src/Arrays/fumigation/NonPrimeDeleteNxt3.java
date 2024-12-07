package Arrays.fumigation;

public class NonPrimeDeleteNxt3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (!isPrime(array[i])){
                int index = i+1;
                int k =0;

                while(index<n&&k<3){
                    for (int j = index; j < n-1; j++) {
                        array[j] = array[j+1];
                    }
                    k++;
                    n--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }

    }

    public static boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        if (num ==2){
            return true;
        }
        if(num%2==0){
            return false;
        }
        for (int i = 3; i <=Math.sqrt(num) ; i+=2) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
