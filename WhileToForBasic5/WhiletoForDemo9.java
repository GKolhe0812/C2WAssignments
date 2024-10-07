class RevNum{

	public static void main(String[] args){

		int N = 942111423,rev = 0;

		for(;N!=0;N=N/10){

			int rem = N % 10;
			rev = rev * 10 + rem;
		}
		System.out.println(rev);

	}
}
