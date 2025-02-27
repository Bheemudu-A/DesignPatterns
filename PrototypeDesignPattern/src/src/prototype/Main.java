package src.prototype;

/*
 * Advantage of Prototype Design Pattern, 1st only we are creating object from database(or from client inputs), next similar objects will be cloned from 1st objects without creating from scratch
 * which makes time efficient & consumes less memory
 */
public class Main {
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop shop1 = new BookShop();
		shop1.loadData();
		shop1.setShopName("DNagaraju Book Store");
		
		BookShop shop2 = shop1.clone();//cloning object of shop1(base object) after that we can perform operations in shop1 or shop1 based on our need
		shop2.getBooksList().remove(1);//removing book 1 of shop1
		shop2.setShopName("Ratgiri Book Store");
		
		System.out.println(shop1);
		System.out.println(shop2);
	}
	

}
