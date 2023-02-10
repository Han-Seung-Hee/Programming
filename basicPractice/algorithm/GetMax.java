class GetMax{
    public static void main(String[] args) {
        max_3(1,2,3);

        int[] arr = {1,2,3,4,5};
        max_arr(arr);
    }

    static int min(int a, int b){
        return a < b ? a : b;
    }

    static int max(int a, int b){
        return a > b ? a : b;
    }

    static void max_3(int i , int j , int k){
        int max = Integer.MIN_VALUE;

        if(max < i) max = i; 
        if(max < j) max = j; 
        if(max < k) max = k;
        
        System.out.println(max);
    }

    static void max_arr(int[]arr){
        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}