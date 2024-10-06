class SumMult{

	public static void main(String[] args){

		int N = 10;
		int i = 1;
		int sum = 0;
		int mult = 1;

		while(i <= N){

			if(i % 2 == 0){
				
				sum = sum + i;
					
			}else{

				mult = mult * i;

			}
			i++;

		}
		System.out.println("The sum of even numbers between 1 to 10 is " + sum);
		System.out.println("The Multiplication of odd numbers between 1 to 10 is " + mult);


	}

}

