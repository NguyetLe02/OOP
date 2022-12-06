package hust.soict.dsai.aims.media;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book();
		book.addAuthor("Nguyet");
		book.addAuthor("Hoang");
		book.addAuthor("Linh");
		book.addAuthor("Hung");
		book.print();
//		book.addAuthor("Nguyet");
//		book.removeAuthor("Ngan");
		book.removeAuthor("Nguyet");
		book.print();
		
	}
	
}
