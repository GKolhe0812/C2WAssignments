class EvenDigSq{

	public static void main(String[] args){

		int N = 942111423;

		for(;N!=0;N = N/10){

			int rem = N%10;
			if(rem % 2 == 0){

				System.out.println(rem * rem);
			}

		}

	}
}
