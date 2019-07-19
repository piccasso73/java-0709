package com.hisham.sample;

import java.io.*;
public class CopyFile_Character{

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("C:\\STUDENT\\MyPrograms\\input.txt");
         out = new FileWriter("C:\\STUDENT\\MyPrograms\\input.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}