class e15{
	public static void main(String[] args){
		int i=257;
		byte b;
		double d=323.142;
		System.out.println("\n ������ת��Ϊ�ֽ��ͣ�");
		b=(byte)i;
		System.out.println("i��b:"+i+"��"+b);
		System.out.println("\n double��ת��Ϊint��");
		i=(int)d;
		System.out.println("d��i:"+d+"��"+i);
		System.out.println("\n ��doubleת��Ϊbyte��");
		b=(byte)d;
		System.out.println("d�� b:"+d+"��"+b);
	}
}