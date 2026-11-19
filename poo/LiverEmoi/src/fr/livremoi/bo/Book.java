package fr.livremoi.bo;

public class Book {
	private String title;
	private int anneeDePublication;
	private Author authorlist;

	
	public Book(String title, int anneeDePublication) {
		
		this.title = title;
		this.anneeDePublication = anneeDePublication;		
		this.authorlist=null;
		
	}
	public Book() {
		this.title="Abc";
		this.anneeDePublication=1963;
		this.authorlist=null;
	}
	public String getTitle() {
		return title;
	}
	public void addAuthor(Author author)
	{
		this.authorlist=author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAnneeDePublication() {
		return anneeDePublication;
	}
	public void setAnneeDePublication(int anneeDePublication) {
		this.anneeDePublication = anneeDePublication;
	}

	
	public String tracer()
	{
			String msg="The book: "+this.title+"was published in "+this.anneeDePublication;
			msg=msg+"\n"+this.authorlist.tracer();
			
			return msg;
	}
	
}
