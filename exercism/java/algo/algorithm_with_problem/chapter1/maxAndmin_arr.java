class maxAndmin_arr{
  public static void main(String[] args) {

  }

  public int getMax(int[] arr){
    int size = arr.length;
    int max = Integer.MIN_VALUE;
    for(int i = 0 ; i < size ; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }

    return max;
  }
}