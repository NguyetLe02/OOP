package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		super();
	}
	
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.authors = authors;
	}

	public static void main(String[] args) {
		
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("The author "+authorName+" is present in the list.");
		}else authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)== false) {
			System.out.println("The author "+authorName+" is not already in the list.");
		}else authors.remove(authorName);
	}
	
	public void print() {
		System.out.println("Id:" + id + " Title:" + title + " Category:" + category + " Cost:" + cost + "\n" +"List authors: ");
		for(String x : authors) {
			System.out.println(x);
		}
	}
	
	
}
