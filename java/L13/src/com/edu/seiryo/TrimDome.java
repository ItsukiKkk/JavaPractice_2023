package com.edu.seiryo;

public class TrimDome {
	private int getStartIndex(String str){
		int index  = 0;
		while(index <= str.length()-1 && str.charAt(index) == ' '){
			index++;
		}
		return index;
	}
	private int getLastIndex(String str){
		int index = str.length()-1;
		while(index >= 0 && str.charAt(index) == ' '){
			index--;
		};
		return index;
	}
	public String getTrim(String str){
		int startIndex = getStartIndex(str);
		int lastIndex = getLastIndex(str);
		return str.substring(startIndex,lastIndex+1);
	}
}
