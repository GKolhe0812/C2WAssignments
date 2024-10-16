class Demo1C3{

        public static void main(String[] args){

                int n = 3;
		int num1 = 1;
                for(int i = 1;i<=n;i++){
			char ch = 'C';
			int num = 3;

                        for(int j = 1;j<=n;j++){

                                System.out.print((num1*num1)+""+""+ch+""+ num+ " ");
				ch--;num--;
				num1++;
                        }
                        System.out.println();
                }
        }
}
