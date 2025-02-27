package src.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	
	
	private String shopName;
	private List<Book> booksList = new ArrayList<>();
	
	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public List<Book> getBooksList() {
		return booksList;
	}
	
	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}
	
	@Override
	public BookShop clone() throws CloneNotSupportedException {
		
		//creating deep copy
		BookShop bs = new BookShop();
		for(Book b : booksList) {
			bs.getBooksList().add(b);//creating new BookShop Object
		}
		return bs;//super.clone(); //this is shallow clone, 
	}
	
	
	//loading data into books
	public void loadData() {	
		
		for(int i=1;i<=5;i++) {
			Book book = new Book();
			book.setBid(i);
			book.setBname("Book "+i);
			getBooksList().add(book);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", booksList=" + booksList + "]";
	}
	
	

}
