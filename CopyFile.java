package com.hisham.sample;

import java.io.*;
public class CopyFile {

	public static void main(String args[]) {  
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			//in = new FileInputStream(".\\input.txt");

			in = new FileInputStream("C:\\STUDENT\\MyPrograms\\input.txt");

			out = new FileOutputStream("C:\\STUDENT\\MyPrograms\\output.txt");

			int c;
			System.out.println("Input file loaded");
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Output file completed. ");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				} 
			} catch(Exception ex) {

			}

		}
	}
}