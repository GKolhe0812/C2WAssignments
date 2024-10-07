class RevEvenOdd{

	public static void main(String[] args){

		int N = 7;

		if(N%2!=0){

			for(int i = N;i>=1;i=i-2){

				System.out.println(i);
			}
		}else{

			for(int i = N;i>=1;i--){

				System.out.println(i);
			}
		}
	}
}
