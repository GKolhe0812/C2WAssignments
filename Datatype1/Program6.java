class DMY{

	public static void main(String[] args){

		byte day = 8;
		byte month = 12;
		int year = 1997;

		System.out.println("The Birth day is: "+day+ "-" +month+ "-" + year);
		System.out.println("The total seconds in a day is : " + 24*60*60 + "secs/day");
		System.out.println("The total seconds in a Month is : " + 30*24*60*60 + "secs/month");
		System.out.println("The total seconds in a Year is : " + 365*24*60*60 + "secs/year");
	}
}
