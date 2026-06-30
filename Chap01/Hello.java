// 在画面上进行输出的程序

class Hello {
// Hello 类的声明，原则上类名首字母要大写;此大括号所包含的部分是整个程序的“骨架”，专业术语：名称为 Hello 的类（class）的类声明（class declaration）
	
	public static void main (String [] args) {
	//上面这部分是“固定语句”
		System.out.println("第一个 Java 程序。");
		//使用双引号括起来的字符序列，称为：字符串常量 string literal，所谓常量就是“按字符原样”的意思
		System.out.println("输出到画面上。！@#。，¥%&*（）——+=-～· ");
		//双引号是表示字符串常量开始和结束的符号，不会被显示，甚至其他符号也不被显示
	}
	// 从 public 这行往下，是 main 方法的声明
}
