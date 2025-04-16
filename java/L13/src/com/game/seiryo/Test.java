package com.game.seiryo;

public class Test {
	public static void main(String[] args) {
		String string = "Áõ±¸-4-ÈÊµÂ-98,¹ØÓğ-4-Áúµ¨-85,²Ü²Ù-4-¼éĞÛ,ÏÄºîª-4-¸ÕÁÒ";
		new Initial().convertToGeneral(string);
		String str = "Áõ±¸,¹ØÓğ,²Ü²Ù,ÏÄºîª";
		new Initial().splitAll(str, ",");
	}
}
