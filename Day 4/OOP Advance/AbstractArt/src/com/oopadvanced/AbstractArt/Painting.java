package com.oopadvanced.AbstractArt;

public class Painting extends Art{
	protected String paintType;
	public static int paintCount = 0;
	public Painting(String title, String author, String description, String paintType){
		super(title, author, description);
		this.paintType = paintType;
		paintCount++;
	}
	@Override
	public void viewArt() {
		
	}
	public String getPaintType() {
		return paintType;
	}
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	public Integer getPaintCount() {
		return paintCount;
	}
}