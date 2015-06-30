public class T1 {

	public static void main(String[] args) {
		int p1=0;
		int p2=0;
		int countwin=0;
		
		for(int k=1;k<=100;k++){
			int right=(int) (Math.random()*2+1);
			System.out.println(right);
			if(right==1){
				countwin++;
				p1++;
			}else{
				System.out.println(countwin);
				countwin=0;
				p2++;
			}			
		}
		System.out.println(p1+"\t"+p2);
	}
}
