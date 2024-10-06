class Pallindrome{

        public static void main(String[] args){

                int N = 2332;
		int temp = N;
                int rev = 0;

                while(N!=0){

                        int rem = N % 10;
                        rev = rev*10 + rem;
                        N = N/10;

                }
                if(rev == temp){

			System.out.println(rev + " is Pallindrome");
		}else{

			System.out.println(rev + " is Not a Pallindrome");
		}

        }

}

