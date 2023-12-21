package oopTemel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Book b1=new Book("Dedemin Bakkali","Sermin Yasar","Dogan",225);
       Book b2=new Book("Bit Palas","Elif Safak","Timas",285);
       
       System.out.println(b1.getNumberOfPage());
       b1.setNumberOfPage(200);
       System.out.println(b1.getNumberOfPage());
	}

}
