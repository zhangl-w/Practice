package com.neusoft.test;

public class ObjectDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		//hashCode方法
		//由 Object 类定义的 hashCode 方法确实会针对不同的对象返回不同的整数。
		//hashCode和地址有关，我们可以理解为地址值，但是不是真实地址值
        Student s1 = new Student("老王", 37);
        Student s2 = new Student("老王", 37);  
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Student s3 = s1;
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        
        //getClass方法
        //利用这个方法就可以获得一个实例的class对象。
        //这个对象指的是代表一个类型的对象，因为一切皆是对象，类型也不例外，在Java使用class类的对象来表示一个类型。
        //所有的类型类都是Class类的实例
        //获取类的class对象的两种方式：
        //1.如果你知道一个实例，那么你可以通过实例的“getClass()”方法获得该对象的class对象
		//2.如果你知道一个类型（String名称），那么你可以使用“类名.class”的方法获得该类型的class对象
        Student a = new Student();

        if(a.getClass()==Student.class) {
        	System.out.println("equal "+a.getClass());
        }else {
        	System.out.println("unequal");
        }
        
        //toString方法
        //输出语句输出一个引用类型的时候，默认调用了引用类型的toString方法输出
        //返回的是一个 类名全路径 + @ + hashCode的十六进制
        System.out.println(a);
       
        //equals方法
        //判断两个类的地址是否相等；
        Student a1 = new Student();
        System.out.println(a1.equals(a));
        
        //clone方法
        //创建并返回此对象的一个副本
        //使用时注意异常：java.lang.CloneNotSupportedException
        //异常：克隆不支持异常
        //原因：需要克隆的类没有实现克隆接口。
        //解决：找到要克隆的类实现Cloneable接口。
        TestClone t = new TestClone("张三",29);
        TestClone l = new TestClone("李四",33);
        Object tClone = t.clone();
        TestClone tc = (TestClone)tClone;
        System.out.format("%-4s"+"%d",tc.name,tc.age);
        
        //finalize方法
        //当垃圾回收器确定不存在对该对象的更多引用时。由对象的垃圾回收器调用此方法。用于垃圾回收，但是什么时候回收不确定。
        //一般有两中情况对象会被作为垃圾对象：
        //当对象被赋null
        //Student s = new Student();
        //        s = null;
        //当对象重新被创建
        //Student s = new Student();        
        //       s = new Student();
        /*final

        final修饰的变量表示常量，不能够被二次赋值 。
        final修饰的类不能够被继承 。
        final修饰的方法不能够被子类重写。

        finally

        Java 中的 Finally 关键一般与try一起使用，在程序进入try块之后，无论程序是因为异常而中止或其它方式返回终止的，finally块的内容一定会被执行 。
	        特殊情况：在执行到finally之前jvm退出了（比如System.exit(0)）。
	        作用：用于释放资源，在IO流操作和数据库操作中常见到。*/
	}
	

}
class TestClone extends Object implements Cloneable{
    String name;
    int age;
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public TestClone(){}
    public TestClone(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
}
