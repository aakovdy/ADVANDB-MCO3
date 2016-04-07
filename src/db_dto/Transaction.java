package db_dto;

public class Transaction {
	String title;
	String query;
	
	public Transaction(String title, String query){
		this.title = title;
		this.query = query;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getQuery(){
		return query;
	}
	
	public void setQuery(){
		this.query = query;
	}
}
