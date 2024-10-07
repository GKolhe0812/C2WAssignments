class Pallindrome{

        public static void main(String[] args){

                int N = 9449,rev = 0;
		int temp = N;

                for(;N!=0;N=N/10){

                        int rem = N % 10;
                        rev = rev * 10 + rem;
                }
                if(temp == rev){

			System.out.println(rev + " is a pallindrome");
		}else{

			System.out.println(rev + " is Not a pallindrome");
		}

        }
}
