import java.util.Arrays;

class ArrayRotation{
    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,5,6,7,8};
        
        rotate_right(arr,2, 6);
        rotate_left(arr,2,6);

    }

    static void rotate_right(int[] arr, int s, int t){
        int i , last;

        last = arr[t];

        for(i = t ; i > s ; i--){
            arr[i] = arr[i-1];
        }

        arr[s] = last;

        System.out.println(Arrays.toString(arr));
    }

    static void rotate_left(int[] arr, int s, int t){
        int i, start;

        /* 0 1 2 3 4 5 
         *===============
         * 1 2 3 4 5 6 7 8  s= 2,t=6
         * 1 2 4 5 6 7 3 8
         * 
         * start = arr[s];
         * 
         * arr[t] = start;
         */
        start =arr[2];

        for(i = s ; i < t ; i++){
            arr[i] = arr [i+1];
        }

        arr[t] = start;

        System.out.println(Arrays.toString(arr));
    }
}