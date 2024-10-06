class CountDownAssignments{

	public static void main(String[] args){

		int day = 7;
		int i = day;

		while(i>=0){

			if(i != 0){
		 		
				System.out.println(i + " days remaining");
			}else{

				System.out.println(i + " days Assignment is overdue");
			}
			i--;
			
		}
	}
}
