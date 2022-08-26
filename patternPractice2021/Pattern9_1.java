class Pattern9_1{
	public static void main(String[] args){
		int num=0;			
		for(int i=1;i<=4;i++){
			num++;
			int count=1;
			for(int j=1;j<=num;j++){
				System.out.print(count++ );
			}
			System.out.println();
		}
	}
}