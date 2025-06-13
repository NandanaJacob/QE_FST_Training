package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

//Activity 14:
//* In this activity we use FileUtils to perform file I/O operations.
//* Create a new text file using the default File Class.
//* Use the createNewFile() method to create a file.
//* Write some text into the text file.
//* Example:
//    File file = new File("filepath");
//    boolean fStatus = file.createNewFile();
//* To read the file the method is readFileToString().
//    System.out.println("Data in file: " + FileUtils.readFileToString(fileObject, "UTF8"));
//* Next, we create a new directory named "destDir".
//* Copy the text file into this directory using the copyFileToDirectory() method.
//    //Create directory
//    File destDir = new File("path/to/destDir");
//    //Copy file to directory
//    FileUtils.copyFileToDirectory(file, destDir);
//* To read data from this new file using FileUtils class use the getFile() method to get the file. Then use readFileToString() to read file.
//    //Get file from new directory
//    File newFile = FileUtils.getFile(destDir, "newfile.txt");
//    //Read data from file
//    String newFileData = FileUtils.readFileToString(newFile, "UTF8");
    
public class Activity14 {
	public static void main(String[] args) {
		 File file = new File("Sample.txt");
	    try {
			boolean fStatus = file.createNewFile();
			
			String data = "This is the content to write into the file.";
			FileUtils.writeStringToFile(file, data, "UTF8");
            System.out.println("Data written to file successfully.");
            
			System.out.println("Trying to read the file...");
			System.out.println("Data in file: " + FileUtils.readFileToString(file, "UTF8"));
			
			File destDir = new File("C:\\Users\\NandanaJacob\\Desktop\\git\\QE_FST_Training\\java");
			FileUtils.copyFileToDirectory(file, destDir);
			
			File newFile = FileUtils.getFile(destDir, "Sample.txt");
			String newFileData = FileUtils.readFileToString(newFile, "UTF8");
			System.out.println("Data from new directory = " + newFileData);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	}

}
