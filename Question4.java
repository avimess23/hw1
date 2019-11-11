import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class Question4 {
	
	Question4(int n) throws IOException{
		double num = 100/n;
		FileWriter fn = new FileWriter("Question 4.html");
	
		fn.write("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"        <title>Question 4</title>\r\n" + 
				"    </head>\r\n" + 
				"    <style>\r\n" + 
				"    \r\n" + 
				"    .blue_block{ \r\n" + 
				"        position: fixed;\r\n" + 
				"        top: 0px;\r\n" + 
				"        width:" + num + "%;\r\n" + 
				"		height: 100%;\r\n" + 
				"		background-color: blue;\r\n" + 
				"    } \r\n" + 
				"    .red_block{\r\n" + 
				"        position: fixed;\r\n" + 
				"        top: 0px;\r\n" + 
				"        width:" + num + "%;\r\n" + 
				"		height: 100%;\r\n" + 
				"		background-color: red;\r\n" + 
				"    }\r\n" + 
				"    .green_block{\r\n" + 
				"        position: fixed;\r\n" + 
				"        top: 0px;\r\n" + 
				"        width:" + num + "%;\r\n" + 
				"		height: 100%;\r\n" + 
				"		background-color: green;\r\n" + 
				"    }\r\n" + 
				"    </style>\r\n");
		String blue = new String("<div class = \"blue_block\" style= ");
		String red = new String("<div class = \"red_block\" style= ");
		String green = new String("<div class = \"green_block\" style= ");
		fn.write("<body>\r\n");
		
		for(int i=0; i<n; i++) {
			if(i%3==0)
				fn.write(blue +"\"left: " + i*num + "%\"></div>\r\n");
			if(i%3==1)
				fn.write(red +"\"left: " + i*num + "%\"></div>\r\n");
			if(i%3==2)
				fn.write(green +"\"left: " + i*num + "%\"></div>\r\n");
		}
		fn.write("    </body>\r\n" + 
				"</html>");
		fn.close();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter a numer between 1-50:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try {
			new Question4(n);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("thank you");
	}

}
