class maxAndmin{

  public int max(int x, int y){
    if(x>y) return x;
    return y;
  }

  public int min(int x, int y){
    if(x>y) return y;
    return x;
  }

  public int max_three(int x, int y, int z){
    int temp = Integer.MIN_VALUE;
    if(x>y){
      temp = x;
    }else{
      temp = y;
    }
    if(temp > z){
      return temp;
    }else{
      return z;
    }
    
  }
  public static void main(String[] args) {
    
  }
}