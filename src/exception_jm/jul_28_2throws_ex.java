package exception_jm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Hello2
{
	void display() throws FileNotFoundException,IOException,Exception
	{
		FileReader fr=new FileReader("../class_project/src/exception_jm/pc.txt");
		BufferedReader br=new BufferedReader(fr);
//		 System.out.println(br.readLine()); 
		
		String content;
		while((content=br.readLine())!=null)
		{
			System.out.println(content);
		}
		File f1=new File("../class_project/src/exception_jm/abc.txt");
		FileWriter fw =new FileWriter(f1,true);
		String data="Hello Students";
		fw.append('p');
		fw.close();
		
	}
}



public class jul_28_2throws_ex {

	public static void main(String[] args) {
		Hello2 ob=new Hello2();
		try {
			ob.display();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
		}
		catch (IOException e1) 
		{
			System.out.println(e1);
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}



	}

}
