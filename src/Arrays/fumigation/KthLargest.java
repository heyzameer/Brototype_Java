package Arrays.Easy;

public class KthLargest {
    public static void main(String[] args) {
        int[] array ={2,3,1,5,3};
        int n = array.length;
        int k =1;

        for (int i = n-1; i  >=0 ; i--) {
            for (int j = 0; j < i - 1 ; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(k+"th Largest element is: "+array[n-k]);

    }
}
