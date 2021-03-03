package EmployeePayroll;

import java.io.*;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {

		File file= new File("abc.txt");
		file.createNewFile();
		System.out.println("File Created");
		
		if ( file.exists() ) {
			System.out.println("File exists");
			file.delete();
			System.out.println("And File is deleted");
		}
		else {
			System.out.println("File not exists");
		}
		
		file.mkdir();
		if ( file.exists()) {
			System.out.println("Directory created");
		}
		else {
			System.out.println("Direcotry not found");
		}
		
		File file1= new File("E:\\Naman","xyx.txt");
		file1.createNewFile();
		System.out.println("File created");
		System.out.println(file1.list());
		
	}

}
