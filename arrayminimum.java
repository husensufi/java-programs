class arrayminimum{
	public static void main(String[] args){
		//int rev=num.length;
		int[] num = {12,65,8,85,7455,5487,8512,4545};
		
		for(int i=0; i<num.length;i++){
			System.out.println(num[i]);
		}
		
		for(int j=num.length;j>=0;j--){
			System.out.println(num[j]);
		}
		/*for(int j=0; i<num.length;j++){
			if(num[j]>min){
				System.out.println(num[j]);
			}
		}*/
	}
}