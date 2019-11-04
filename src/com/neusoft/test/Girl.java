package com.neusoft.test;
/*Comparable������Ϊ��һ���ڱȽ�����ʵ����Comparable�ӿڵ�����һ���ص㣬������
 *Щ���ǿ��Ժ��Լ��Ƚϵģ����ھ������һ��ʵ����Comparable�ӿڵ�����αȽϣ�������
 *compareTo������ʵ�֣�compareTo����Ҳ����Ϊ��Ȼ�ȽϷ��������������add����һ��
 *Collection�Ķ�����ҪCollections��sort���������Զ���������Ļ�����ô�������
 *����ʵ��Comparable�ӿڡ�compareTo�����ķ���ֵ��int�������������

1���Ƚ��ߴ��ڱ��Ƚ��ߣ�Ҳ����compareTo��������Ķ��󣩣���ô����������
2���Ƚ��ߵ��ڱ��Ƚ��ߣ���ô����0
3���Ƚ���С�ڱ��Ƚ��ߣ���ô���ظ�����*/

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
