class F5D3B1{

        public static void main(String[] args){

                int n = 6;
                for(int i = 1;i<=n;i++){
			int num = 5;char ch = 'F';

                        for(int j = 1;j<=n;j++){

                                if(j%2!=0){

					System.out.print(ch+ "  ");
					ch-=2;
				}else{
					System.out.print(num+ "  ");
					num-=2;
				}
                        }
                        System.out.println();
                }
        }
}
