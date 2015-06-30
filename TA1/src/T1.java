public class T1 {

	public static void main(String[] args) {
		int p1=0;
		int p2=0;
		
		for(int k=1;k<=100;k++){
			int right=(int) (Math.random()*2+1);
			System.out.println(right);
			if(right==1){
				

				p1++;
			}else{
				
				p2++;
			}			
		}
		System.out.println(p1+"\t"+p2);
	}
}
