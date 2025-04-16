class e15{
	public static void main(String[] args){
		int i=257;
		byte b;
		double d=323.142;
		System.out.println("\n 将整形转换为字节型：");
		b=(byte)i;
		System.out.println("i→b:"+i+"→"+b);
		System.out.println("\n double形转换为int：");
		i=(int)d;
		System.out.println("d→i:"+d+"→"+i);
		System.out.println("\n 将double转换为byte：");
		b=(byte)d;
		System.out.println("d→ b:"+d+"→"+b);
	}
}