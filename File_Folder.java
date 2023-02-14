package loops;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Create 9 files of multiplication tables and put them in a folder name "javafile"

public class File_Folder {
	public static void main (String[]args) {
		File folder =  new File("C:\\Users\\Har Har MahaDev\\Desktop\\javafile");
	    folder.mkdir();  // this method .mkdir will Create a folder
	    for(int i = 2; i<=10;i++) {  // loop for making 9 files
	    	File f1 = new File("C:\\Users\\Har Har MahaDev\\Desktop\\javafile\\"+"Table"+i+".txt");
	    	try {
				f1.createNewFile();
				FileWriter f = new FileWriter(f1);
				for(int j=1;j<=10;j++) {  // this is for Multiplication Tables
					String str = i+" x "+j+" = "+i*j+"\n";
					f.append(str);
				}
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }
	}
}
