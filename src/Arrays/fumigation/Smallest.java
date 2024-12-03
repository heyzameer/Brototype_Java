package Arrays.fumigation;

public class Smallest {
    public static void main(String[] args) {
        int[] array = {23,2,6,23,65,8};
        int smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        System.out.println("Largest element is:"+smallest);
    }

}
