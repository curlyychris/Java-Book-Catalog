//Christy Karam 18249 Assignment 1
package assignment1;

public class Book {
	//declaring variables of the Book class
	private String bookTitle;
	private String authorFirstName;
	private String authorsLastName;
	private int editionNumber;
	//use getters and setters because the variables are private the way 
	//to access them from any class is using the public getter/setter method
	
	//gets book title (accessor)
	public String getBookTitle() 
	{
		return bookTitle;
	}
	//sets book title (modifier)
	public void setBookTitle(String bookTitle) 
	{
		this.bookTitle = bookTitle;
	}
	//gets authors first name (accessor)
	public String getAuthorFirstName() 
	{
		return authorFirstName;
	}

	//sets authors first name (modifier)
	public void setAuthorFirstName(String authorFirstName) 
	{
		this.authorFirstName = authorFirstName;
	}
	//gets authors last name (accessor)
	public String getAuthorsLastName() 
	{
		return authorsLastName;
	}
	//sets authors last name (modifier)
	public void setAuthorsLastName(String authorsLastName) {
		this.authorsLastName = authorsLastName;
	}
	//gets edition number (accessor)
	public int getEditionNumber() 
	{
		return editionNumber;
	}
	//gets edition number (modifier)
	public void setEditionNumber(int editionNumber)
	{
		this.editionNumber = editionNumber;
	}
	//constructor of the class Book
	public Book()
	{
		
	}
	//creating our own toString method for meaningful String representation
	//the predefined toString method displays hexadecimal values
	//overriding the toString predefined method
	public String toString(int currentBook)
	{
		String bookInformation="Book catalog number: "+currentBook
				+"\n"+"------------------------"+"\n"
				+"Book Title: "+bookTitle+" "
				+"\n"+"Author: "+authorFirstName+" "
				+authorsLastName+"\n"+"Edition: "
				+editionNumber+"\n\n";
		return bookInformation;			
	}
	//when the user wants to put something into a file it will call this function
	public String toStringFile(int currentBook)
	{
		String bookInformation= bookTitle+"-"+authorFirstName+" "
				+authorsLastName+" "+editionNumber+"\n";
		return bookInformation;
	}
}
