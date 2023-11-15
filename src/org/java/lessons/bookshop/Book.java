package org.java.lessons.bookshop;


public class Book {
	
	private String titolo;
	private int pagine;
	private String autore;
	private String editore;
	
	public Book(String titolo, int pagine, String autore, String editore) throws Exception{
		
		setTitolo(titolo);
		setPagine(pagine);
		setAutore(autore);
		setEditore(editore);
		
		
	}

	public String getTitolo() {
		return titolo;
	}

	private void setTitolo(String titolo) throws Exception {
		
		if (titolo.isBlank()||titolo.length()<2)throw new Exception("Error: the field must be longer than 2 characters and contain at least 1 letter, symbol or number");
		else this.titolo = titolo;
	}

	public int getPagine() {
		return pagine;
	}

	private void setPagine(int pagine) throws Exception {
		
		if (pagine <= 0)throw new Exception("Error: the field must contain numeric characters");
		else this.pagine = pagine;
	}

	public String getAutore() {
		return autore;
	}

	private void setAutore(String autore) throws Exception {
		
		if (autore.isBlank()||titolo.length()<2)throw new Exception("Error: the field must be longer than 2 characters and contain at least 1 letter, symbol or number");
		else this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	private void setEditore(String editore) throws Exception {
		
		if (editore.isBlank()||titolo.length()<2)throw new Exception("Error: the field must be longer than 2 characters and contain at least 1 letter, symbol or number");
		else this.editore = editore;
	}
	
	@Override
	public String toString() {
		
		return	"Titolo: " + getTitolo() + "\n" +
				"Pagine: " + getPagine() + "\n" +
				"Autore: " + getAutore() + "\n" +
				"Editore: " + getEditore() + "\n**----------**";
	}
	
}
