class EvensumOddMult{

	public static void main(String[] args){

		int N = 10,sum = 0,mult = 1;
		for(int i = 1;i<=N;i++){

			if(i%2==0){

				sum = sum + i;
			}else{

				mult = mult * i;
			}

		}
		System.out.println(sum);
		System.out.println(mult);

	}
}
