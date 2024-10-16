class AbCd{

        public static void main(String[] args){

                int n = 4;
		char ch = 'A',ch1 = 'b';
                for(int i = 1;i<=n;i++){

                        for(int j = 1;j<=n;j++){

				if(j%2!=0){

                                	System.out.print(ch+ " ");
					ch+=2;
				}else{
					System.out.print(ch1+ " ");
					ch1+=2;
				}
				
                        }
                        System.out.println();
                }
        }
}
