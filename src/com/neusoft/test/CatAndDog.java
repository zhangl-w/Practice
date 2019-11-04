package com.neusoft.test;

public class CatAndDog extends AnimalAbstract {
	

	private static CatAndDog c;

	@Override
	String animalAbstract() {// 重写了抽象类中的抽象方法
		// TODO Auto-generated method stub
		return "猫和狗都是动物";
	}
	@Override
	String animal() {
		// TODO Auto-generated method stub						
		System.out.println("重写这是一个动物类");
		return super.animal();
		// 在子类的非构造函数中调用父类的的非构造函数用super.方法名(参数列表)
	}
	public CatAndDog(String s, CatAndDog c) {
		super(s);
		this.c = c;
	}
	public CatAndDog(String s) {
		super(s);
		System.out.println(animal);
	}
	public CatAndDog() {
		super();
	}	
	public static void main(String[] args) {
		CatAndDog c1 = new CatAndDog("1");
		String s=c1.animal();
		String c=c1.animalAbstract();
		System.out.println(s);
		System.out.println(c);
	}
}
