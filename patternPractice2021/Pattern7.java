class Pattern7{
	public static void main(String[] args){
		int space1=4,star1=0,space2=4,star2=0,space3=4;
		for(int i=1;i<=7;i++){		
			if(i==3){
				star1=star1+5;
				space1--;
			}
			else if(i<=4){
				star1++;
				space1--;				
			}
			else if(i==6){
				star1=star1-5;
				space1++;
			}
			else if(i>=5){
				space1++;
				star1--;
			}			
			if(i==1 || i==2){
				space2=space2;
				star2++;
			}
			else if(i==3 || i==4){
				space2=space2-4;
				star2++;
			}			
			else if(i==5){
				space2=space2-4;
				star2--;
			}
			else if(i==6 || i==7){
				star2--;
				space2=space3;	
			}			
			for(int j=1;j<=space1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++){
				System.out.print("*");
			}
			for(int j=1;j<=space2;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star2;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}