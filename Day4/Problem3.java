//PS3: COPY THE ARRAY.

import java.util.Arrays;

class Problem3 {
    public static void main(String[] args) {
        int arr1[] = {2,3,7,8,5};
        int size = arr1.length;

        System.out.println(Arrays.toString(arr1));

        int arr2[] = new int[size];

        for(int i=0; i<size; i++){
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));

    }
}
