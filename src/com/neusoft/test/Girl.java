package com.neusoft.test;
/*Comparable可以认为是一个内比较器，实现了Comparable接口的类有一个特点，就是这
 *些类是可以和自己比较的，至于具体和另一个实现了Comparable接口的类如何比较，则依赖
 *compareTo方法的实现，compareTo方法也被称为自然比较方法。如果开发者add进入一个
 *Collection的对象想要Collections的sort方法帮你自动进行排序的话，那么这个对象
 *必须实现Comparable接口。compareTo方法的返回值是int，有三种情况：

1、比较者大于被比较者（也就是compareTo方法里面的对象），那么返回正整数
2、比较者等于被比较者，那么返回0
3、比较者小于被比较者，那么返回负整数*/

public class Girl implements Comparable<Object>{
	private String name;
	private int age;
	
	public Girl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Girl g = (Girl)o;
        return this.age - g.getAge();
	}
	
	
		
	
}
