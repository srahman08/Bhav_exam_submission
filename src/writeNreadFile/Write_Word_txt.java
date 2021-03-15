package writeNreadFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Write_Word_txt {

	public static void main(String[] args) {
		String  path=("src//datafile//WriteAndRead" + ".txt");
		try {
			 //path=("src//datafile//WriteAndRead" + ".txt");
			File file= new File(path);
			FileWriter fwtxt= new FileWriter(file);
			BufferedWriter bfwtxt= new BufferedWriter(fwtxt);
			
		String firstLine="Apple- fruit, tech firm";
		String secondLine="Table- an object, contains rows and columns when used in context of computers";
		String thirdLine="Orange- fruit";
List<String> list1= new ArrayList<String>();
bfwtxt.write(firstLine); bfwtxt.newLine(); 
bfwtxt.write(secondLine); bfwtxt.newLine();
bfwtxt.write(thirdLine);bfwtxt.newLine();
bfwtxt.close();
		
	//	list1.add(firstLine);
		System.out.println(firstLine);
		
		}catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to find file path '" + 
                    path + "'");                
            }
		catch(IOException e ) {
			e.printStackTrace();
				}

		
		}

}
