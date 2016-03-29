package abstraction;

public abstract class EnglishBook implements Book {

	public void pageNumber(){
		System.out.println("page  number");
	}
	public void name(){
		System.out.println("Name of the book");
	}
public abstract void Picture();
}
