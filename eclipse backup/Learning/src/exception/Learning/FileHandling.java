package exception.Learning;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		File file = new File("myfile.txt");
		
//		Scanner s = new Scanner(file);
//		
//		while(s.hasNextLine()) {
//			String line = s.nextLine();
//			System.out.println(line);
//		}
//		s.close();
		
		Form.takeInput(file);
		
		System.out.println("PLease Verify Your Input");
		File file2 = new File("C:\\Users\\gupvaibh\\eclipse-workspace\\Learning\\src\\exception\\Learning\\text.txt");
		Form.output(file2);

	}

}
