package first;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("I like pizza\n");//输出完字符串换行
		System.out.print("you like me");
		
		System.out.println("I like pizza\n");//输出完字符串本身就换行，又加了个换行转义字符
		System.out.print("you like me");
		
		//转义字符
		System.out.println("\n\t你好"+"\n"+"有人说：\"他是个大傻子。\"\t"+"\'word\'的格式是一个字符类型的常量的格式");
		
		
		
		int x;//declaration
		x=10;//assignment
		int y=100;//initialize
		long z=1000;
		float c=100.6879f;
		double t=679.9876;
		char r='c';
		boolean n=true;
		String str="你好啊";
		System.out.println("\nint:"+x);
		System.out.println("int:"+y);
		System.out.println("long:"+z);
		System.out.println("float:"+c);
		System.out.println("double:"+t);
		System.out.println("char:"+r);
		System.out.println("int:"+y);
		System.out.println("boolean:"+n);
		System.out.println("String:"+str+"小美女");
		
		
	}

}
