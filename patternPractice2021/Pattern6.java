class Pattern6{
	public static void main(String[] args){
		int space=4,star=0;
		for(int i=1;i<=7;i++){
			if(i==3){
				star=star+5;
				space--;
			}
			else if(i<=4){
				star++;
				space--;
			}
			else if(i==6){
				star=star-5;
				space++;
			}
			else if(i>=5){
				space++;
				star--;
			}		
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}