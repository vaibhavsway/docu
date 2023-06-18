
public class SDN {
	
	public static void main(String[] args) {
		int N =6;
		
		
		smallestN(3);
	}

	private static void smallestN(int n) {
		// TODO Auto-generated method stub
		
		int a =1;
		for(int i=2;i<=n;i++) {
			a= (a*i)/gcd(a,i);
		}
		
		System.out.print(a);
		
	}

	public static int gcd(int a, int b){

		if(b==0){
			return a;
		}
		return gcd(b,a%b);
	}

}
