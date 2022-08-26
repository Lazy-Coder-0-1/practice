class Pattern7_2{
	public static void main(String[] args){
		int space=4,star=0,rightStar=0;
		for(int i=1;i<=7;i++){
			if(i<=4){
				space--;
				star++;
			}
			else{
				space++;
				star--;
			}
			if(i<=4){
				rightStar++;
			}
			else{
				rightStar--;
			}
			
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			if(i>=3 && i<=5){
				//for(int j=1;j<=4;j++){
					System.out.print("****");
				//}
			}
			else{
				//for(int j=1;j<=4;j++){
					System.out.print("    ");
				//}
			}
			for(int j=1;j<=rightStar;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}