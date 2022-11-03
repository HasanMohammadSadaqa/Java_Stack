package com.oopadvanced.AbstractArt;
import java.util.ArrayList;
public class Musem {
	public static ArrayList<Object> musem = new ArrayList<>();
	public static void storePaiting(Painting p) {
		musem.add(p);
	}
	public static void storeSculpture(Sculpture s) {
		musem.add(s);
	}
	public static void viewAll() {
	
//			for (Object item : musem) {
//				Painting somePaint = (Painting) item;
//				System.out.println("Paint is: "+ somePaint.getPaintType());
//			}
//			for (Object item : musem) {
////				Sculpture someSculpture = (Sculpture) item;
////				System.out.println("Sculpture is: "+ someSculpture.getMaterial());
//				System.out.println("Sculpture is: "+item);
//			}
	}

	public static void main(String[] args) {
		
		Painting p1 = new Painting("title1", "author1", "description1", "type1");
		Painting p2 = new Painting("title2", "author2", "description2", "type2");
		Painting p3 = new Painting("title3", "author3", "description3", "type3");
		Sculpture p4 = new Sculpture("title4", "author4", "description4", "material1");
		Sculpture p5 = new Sculpture("title5", "author5", "description5", "material2");
		storePaiting(p1);
		storePaiting(p2);
		storePaiting(p3);
		storeSculpture(p4);
		storeSculpture(p5);
		viewAll();

	}
}
