package Arrays.fumigation;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = {2,6,23,65,8};
        int largest = array[0];
        for(int i = 1; i < array.length; i++){
            if(largest < array[i]){
                largest = array[i];
            }
        }
        System.out.println("Largest element is:"+largest);
    }

}
