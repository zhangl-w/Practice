package com.neusoft.test;

public class CatAndDog extends AnimalAbstract {
	

	private static CatAndDog c;

	@Override
	String animalAbstract() {// ��д�˳������еĳ��󷽷�
		// TODO Auto-generated method stub
		return "è�͹����Ƕ���";
	}
	@Override
	String animal() {
		// TODO Auto-generated method stub						
		System.out.println("��д����һ��������");
		return super.animal();
		// ������ķǹ��캯���е��ø���ĵķǹ��캯����super.������(�����б�)
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
