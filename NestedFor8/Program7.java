class OddSqEven{

        public static void main(String[] args){

                int n = 3,num = 1;
                for(int i = 1;i<=n;i++){

                        for(int j = 1;j<=n;j++){

                                if(num%2!=0){
					System.out.print((num*num)+ " ");
					num++;
				}else{

					System.out.print(num + " ");
					num++;
				}
                        }
                        System.out.println();
                }
        }
}
