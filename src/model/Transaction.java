package model;

import java.util.ArrayList;

public class Transaction {
	
	private String name;
	private ArrayList<Query> queryList;

	
	
	public Transaction(String name) {
		super();
		this.name = name;
	}
	
	

	public Transaction(String name, ArrayList<Query> queryList) {
		super();
		this.name = name;
		this.queryList = queryList;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Query> getQueryList() {
		return queryList;
	}

	public void setQueryList(ArrayList<Query> queryList) {
		this.queryList = queryList;
	}
	
	
	
	
	
	
	
	
}
