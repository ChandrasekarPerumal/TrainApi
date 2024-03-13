package com.desktop.app.practice;

enum color {
	RED,BLUE(22,"s"),BLACK("a",1);
	
	public void display() {
		System.out.println(color.RED);
	}
	
	color(){
		System.out.println("Creating constructor: "+this.toString());
	}
	
	color(String a,int b){
		System.out.println("SSSS");
	}
	
	color(int a,String b){
		System.out.println("EEE");
	}
}


public class SampleEnum {

	public static void display() {
		System.out.println("Something");
	}

	
	public static void main(String[] args) {

		color c= color.RED;
		System.out.println(color.RED);
		c.display();
	}

}
