package Arrays.fumigation;

public class FindIdex {
    public static void main(String[] args) {
        int[] array = new int[]{1,45,76,34,54};
        int target = 34;

        for (int i = 0; i < array.length; i++) {
            if(array[i]== target){
                System.out.println("Index of "+target+" is "+ i);
                target = 1;
            }
        }
        if(target!= 1){
            System.out.println("index not found");
        }
    }
}
