package writeNreadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Read_Word_txt {

	public static void main(String[] args) {
		doesFileExist();
	}
		public static void doesFileExist() {			
		
		String path = "src//datafile//WriteAndRead.txt";
		try {
		//	String path = "src//datafile//WriteAndRead.txt";
			File f1 = new File (path);
			FileReader fr1 = new FileReader (f1);
			BufferedReader bfr1 = new BufferedReader (fr1);
			BufferedReader bfr2 = new BufferedReader (fr1);
			 /*String line =null;
			  while (bfr1.readLine() != null) { System.out.println(bfr1.readLine()); }// This will skip first line on each looping.. it has already 
			 // read and passed as it looks for the first line*/
	List<String> list1 = new ArrayList<String>();
	 String line1 =null;
	 while((line1=bfr2.readLine())!= null) {
		
	System.out.println(line1);
	System.out.println();
	System.out.println(line1.length());
	list1.add(line1);
	 }
	 System.out.println(list1.size());
	 System.out.println(list1);
	 
	 String firstWord=list1.get(0);
	 String secondWord=list1.get(1);
	 
	 /*String[ ] split0=  firstWord.split(",", 2);
	 String[ ] split1=  secondWord.split(",", 2);
	 System.out.println(split0[0] +"\n"+ split0[1]);
	 */
	 String[ ] split0=  firstWord.split("[-,]");
	 //String[ ] split1=  secondWord.split(",", 2);
	 System.out.println(split0[0] +"\n"+ "\t" +split0[1] +  "\n"+ "\t"+ split0[2]);
	 
	 String[ ] split1=  secondWord.split("[-,]");
	 System.out.println(split1[0] +"\n"+ "\t" +split1[1] +  "\n"+ "\t"+ split1[2]);
	 
	 System.out.println(split1.length);
	 for (int i=0; i<=split0.length-1; i++) {
		System.out.println( split0[i] +"\n" +"\t");
	 }

	 for (int i=0; i<split1.length; i++) {
		System.out.println(split1[i] +"\n" +"\t");
	 }	 
	  			
		} 
		catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to find file path '" + 
                    path + "'");                
            }
		catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
