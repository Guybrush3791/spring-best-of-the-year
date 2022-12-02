package org.generation.italy.demo.pojo;

public class MyObj {

	private int id;
	private String text;
	
	public MyObj(int id, String text) {
		
		setId(id);
		setText(text);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String myMethod() {
		
		return "text method";
	}
	
	@Override
	public String toString() {
		
		return "MyObj: " + getText();
	}
}
