class XYZ26Z25Y{

        public static void main(String[] args){

                int n = 4;
		int num = 26;
		char ch = 'Z';
                for(int i = 1;i<=n;i++){

                        for(int j = 1;j<=n;j++){

                                if(j%2!=0){
					System.out.print(num+ " ");
					num--;
				}else{
					System.out.print(ch+ " ");
					ch--;
				}
                        }
                        System.out.println();
                }
        }
}
