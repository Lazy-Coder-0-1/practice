class Pattern10{
	public static void main(String[] args){
		int num=-1,space=4;	
		
		for(int i=1;i<=4;i++){
			num+=2;
			space--;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
	