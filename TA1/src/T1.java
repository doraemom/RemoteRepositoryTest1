public class T1 {

	public static void main(String[] args) {
		int p1=0;
		int p2=0;
		int countwin=0;
		int sum=0;
//		int money=0;
		
		for(int k=1;k<=1000;k++){
			int right=(int) (Math.random()*2+1);
			System.out.println(right);
			if(right==1){
				countwin++;
				p1++;
			}else{
				sum+=countwin;
				System.out.println(countwin);
				countwin=0;
				p2++;
			}			
		}
		System.out.println(p1+"\t"+p2);
		System.out.println(sum);
	}
}
