class p4673 {
	private static final int SIZE = 10000;
	private static boolean[] flags = new boolean[SIZE+1];
	private static int d(int n){
		int res = n;
		char[] digits = String.valueOf(n).toCharArray();
		for(int i = 0; i < digits.length ; i++){
			res += digits[i]-'0';
		}
		return res;
	}
	
	public static void main(String[] args) {
		int temp;
		for(int i = 1 ; i <= SIZE ; i++){
			if(!flags[i]) System.out.println(i);
			temp = d(i);
			if(temp <= SIZE) flags[i]= true;
		}
		
	}
}