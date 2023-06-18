package exception.Learning;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Form {
	
	
	public static void takeInput(File file) throws IOException {
		FileReader f1 = new FileReader(file);
		BufferedReader br = new BufferedReader(f1);
		FileWriter fw = new FileWriter("C:\\Users\\gupvaibh\\eclipse-workspace\\Learning\\src\\exception\\Learning\\text.txt");
		Scanner s = new Scanner(System.in);
		String out= br.readLine();
		
		while(out != null) {
			System.out.println(out);
			String str = s.nextLine();
			fw.write(out+" "+str+"\n");
			out = br.readLine();
		}
		s.close();
		fw.close();
		br.close();
		
	}

	public static void output(File file2) throws IOException {
		
		FileReader f2 = new FileReader(file2);
		BufferedReader br5 = new BufferedReader(f2);
		
		String prin = br5.readLine();
		while(prin != null) {
			System.out.println(prin);
			prin = br5.readLine();
		}
		br5.close();
	}

}
