package com.desktop.app.sample;

public class Password {
	
	static void password() {
		String str = "Chandru@28&";
		
		boolean is= str.length()>8 &&
				str.chars().anyMatch(Character::isLowerCase)&&
				str.chars().anyMatch(Character::isUpperCase)&&
				str.chars().anyMatch(ch->!Character.isLetterOrDigit(ch));
		System.out.println(is);
		
	}
	
	public static void main(String[] args) {
		password();
	}

}
