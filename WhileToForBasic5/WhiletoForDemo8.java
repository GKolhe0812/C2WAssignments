class CountDown{

	public static void main(String[] args){

		int days = 7;

		for(int i = days;i>=0;i--){

			if(i!=0){

				System.out.println(i + " days remaining");
			}else{

				System.out.println(i + " days Assignment is overdue");
			}

		}

	}
}
