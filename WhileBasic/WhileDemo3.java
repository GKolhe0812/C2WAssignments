class CountDigits{

	public static void main(String[] args){

		int N = 940663859;
		int count = 0;

		while(N != 0){

			count++;
			N = N/10;

		}
		System.out.println(count);
	}

}
