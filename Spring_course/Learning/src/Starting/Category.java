package Starting;

public class Category {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "the category:apperal and the slightly .."+
					"more in Demand category:makeup along with category:furniture ";
		
		printCategory(str);
	}
	
	public static void printCategory(String s) {
		
		int index=0;
		int len = s.length();
		int end =0 ;
		
		while(index<len) {
			index = s.indexOf(":",index);
			end = s.indexOf(" ", index);
			if(index==-1) {
				break;
			}
			System.out.println(s.substring(index+1, end));
			index=end+1;
			
		}
	}
}
