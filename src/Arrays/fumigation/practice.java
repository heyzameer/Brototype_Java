package Arrays.fumigation;

public class practice {
    public static void main(String[] args) {
        int[] array = {1,2,2,2,3,4,5,6,6};
        int n = array.length;

        int[] uniqElement = new int[n];
       int  uniqIndex =0;
        for (int i= 0;i<n;i++){
            boolean isDup = false;

            for (int j = 0; j < uniqIndex; j++) {
                if(array[i]==uniqElement[j]){
                    isDup = true;
                    break;
                }
            }
            if (!isDup){
                uniqElement[uniqIndex++]= array[i];
            }
        }
        for (int i = 0; i < uniqIndex; i++) {
            System.out.println(uniqElement[i]);
        }

    }
}
