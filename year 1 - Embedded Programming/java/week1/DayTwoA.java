package austinjackson.week1;
import java.util.Scanner;


public class DayTwoA 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String args[])
	{
		String in = "";
		String phrase = "";
		for(;;)
		{
			System.out.println("Enter a String:");
			in = console.nextLine();
			if(in.equals("stop"))
			{
				System.out.println("Stopping...\n\n");
				break;
			}
			System.out.println("First char: "+in.charAt(0));
			System.out.println("Last char: "+in.charAt(in.length()-1));
		}
		
		
		System.out.println("Enter a String to search:");
		in = console.nextLine();
		if(in.equals("stop"))
		{
			System.exit(0);
		}
		System.out.println("Enter a phrase to search from it:");
		phrase = console.next();
		System.out.println("Searching for \'"+phrase+"\' in \'"+in+"\'.");
		search(in,phrase);
	}
	public static void search(String in, String phrase)
	{
		int i = 0;
		while(true)
		{
			if(in.indexOf(phrase, i) != -1)
			{
				i = in.indexOf(phrase, i);
				System.out.println("phrase found at "+i);
				i++;
			}
			else
			{
				System.out.println("phrase could not be found anywhere else.");
				break;
			}
		}
	}
}
