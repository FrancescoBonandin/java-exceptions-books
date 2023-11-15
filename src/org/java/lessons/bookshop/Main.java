package org.java.lessons.bookshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final File bookshop = new File("Bookshop.txt");

		Scanner in = new Scanner(System.in);
		
		System.out.println("quanti libri vuoi inserire?");
		final String STR_ARR_LENGTH = in.nextLine();
		final int ARR_LENGTH = Integer.valueOf(STR_ARR_LENGTH);
		
		Book[] booksArr= new Book[ARR_LENGTH];
		
		int x=0;
		while( x < ARR_LENGTH) {
			
			System.out.println("questo è il libro " + (x + 1));
			System.out.println("dimmi il titolo:");
			String titolo=in.nextLine();
			
			System.out.println("dimmi il numero di pagine:");
			String strPagine=in.nextLine();
			int pagine=Integer.valueOf(strPagine);
			
			System.out.println("dimmi l' autore:");
			String autore=in.nextLine();

			System.out.println("dimmi l' editore:");
			String editore=in.nextLine();
			
			try {
				booksArr[x]=new Book(titolo, pagine, autore, editore);
				
				x++;

			}
			catch(Exception e) {
				
				System.out.println(e.getMessage());
				
			}
		
		}
		
		System.out.println();
		
		FileWriter writer = null;
		
		try {
			
			writer = new FileWriter(bookshop);

			for(int y = 0; y < ARR_LENGTH; y++) {
			
				if(booksArr[y] != null) {
				
					System.out.println("----WRITING book-" + (y+1) +"----");
					System.out.println(booksArr[y]);
					
					Book book = booksArr[y];
					writer.write(book.toString() +"\n");
					
			
				}
			}
			
		}
		
		catch(IOException e) {
			
			System.out.println("Error writing file: " + e.getMessage());
		
		}
		
		finally {
			
			if (writer != null) {
				try {
					writer.close();
					System.out.println("---file writing completed---");
				} 
				catch (IOException e) { }
			}	
		
		}
		
		Scanner reader = null;
		
		try {
			
			reader = new Scanner(bookshop);
			
			while (reader.hasNextLine()) {
				
			   String data = reader.nextLine();
			   System.out.println("Reading:--> "+data);
			}
		}
		
		catch (FileNotFoundException e) {
			
			System.out.println("Error reading file: " + e.getMessage());
		} 
		
		finally {
			
			if (reader != null)
				reader.close();
		}
		
		
	}
}


