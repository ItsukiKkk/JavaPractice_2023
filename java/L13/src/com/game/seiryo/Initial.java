package com.game.seiryo;

import javax.swing.JPopupMenu.Separator;

public class Initial {
	public void convertToGeneral(String str){
		String[] strs = str.split(",");
		for (int i = 0; i < strs.length; i++) {
			String element = strs[i];
			String[] cell = element.split("-");
			String info = null;
			if(cell.length == 4){
				info =  "武将"+cell[0]+"的血量是"+cell[1]
						+"技能是"+cell[2]+"，情义值是"+cell[3];
			}
			if(cell.length == 3){
				info =  "武将"+cell[0]+"的血量是"+cell[1]
						+"技能是"+cell[2];
			}
			System.out.println(info);
		}
	}
	public void splitAll(String str,String separator){
		String[] element = new String[100];
		int i = 0;
		int begin = 0,end = -1;
		end = str.indexOf(separator);
		while(end != -1){
			element[i] = str.substring(begin,end);
			str = str.substring(end+1);//用end不加1会报错
			end = str.indexOf(separator);
			i++;
		}
		element[i] = str;
		for (int j = 0; j < i; j++) {
			String string = element[j];
			System.out.print(string+"\t");
		}
		System.out.println(str);
		System.out.println();
	}
}
