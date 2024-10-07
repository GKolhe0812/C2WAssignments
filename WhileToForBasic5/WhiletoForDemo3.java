class DigitCount{

	public static void main(String[] args){

		int N = 940663958,count = 0;

		for( ;N!=0;N = N/10){

			int rem = N%10;
			count++;
		}
		System.out.println(count);


	}

}
