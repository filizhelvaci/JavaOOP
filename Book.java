package oopTemel;

public class Book {
	
	public String bookName,author,publisher;
	private int numberOfPage;
	
	Book(String bookName,String author,String publisher,int numberOfPage){
		this.bookName=bookName;
		this.author=author;
		this.publisher=publisher;
		if(numberOfPage<1)
		{
			this.numberOfPage=10;
		}else {
			this.numberOfPage=numberOfPage;
		}
	}
    public int getNumberOfPage() {
        return numberOfPage;
    }
    public void setNumberOfPage(int size) {
    	if(size<1)
    	{
    		System.out.println("girdiğiniz değer sayfa sayısı için uygun değil");
    		this.numberOfPage=10;
    	}else
    	{
    		this.numberOfPage=size;
    	}
    	
    }
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
    

}
