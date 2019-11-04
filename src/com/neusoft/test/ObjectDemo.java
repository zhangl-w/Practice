package com.neusoft.test;

public class ObjectDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		//hashCode����
		//�� Object �ඨ��� hashCode ����ȷʵ����Բ�ͬ�Ķ��󷵻ز�ͬ��������
		//hashCode�͵�ַ�йأ����ǿ������Ϊ��ֵַ�����ǲ�����ʵ��ֵַ
        Student s1 = new Student("����", 37);
        Student s2 = new Student("����", 37);  
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Student s3 = s1;
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        
        //getClass����
        //������������Ϳ��Ի��һ��ʵ����class����
        //�������ָ���Ǵ���һ�����͵Ķ�����Ϊһ�н��Ƕ�������Ҳ�����⣬��Javaʹ��class��Ķ�������ʾһ�����͡�
        //���е������඼��Class���ʵ��
        //��ȡ���class��������ַ�ʽ��
        //1.�����֪��һ��ʵ������ô�����ͨ��ʵ���ġ�getClass()��������øö����class����
		//2.�����֪��һ�����ͣ�String���ƣ�����ô�����ʹ�á�����.class���ķ�����ø����͵�class����
        Student a = new Student();

        if(a.getClass()==Student.class) {
        	System.out.println("equal "+a.getClass());
        }else {
        	System.out.println("unequal");
        }
        
        //toString����
        //���������һ���������͵�ʱ��Ĭ�ϵ������������͵�toString�������
        //���ص���һ�� ����ȫ·�� + @ + hashCode��ʮ������
        System.out.println(a);
       
        //equals����
        //�ж�������ĵ�ַ�Ƿ���ȣ�
        Student a1 = new Student();
        System.out.println(a1.equals(a));
        
        //clone����
        //���������ش˶����һ������
        //ʹ��ʱע���쳣��java.lang.CloneNotSupportedException
        //�쳣����¡��֧���쳣
        //ԭ����Ҫ��¡����û��ʵ�ֿ�¡�ӿڡ�
        //������ҵ�Ҫ��¡����ʵ��Cloneable�ӿڡ�
        TestClone t = new TestClone("����",29);
        TestClone l = new TestClone("����",33);
        Object tClone = t.clone();
        TestClone tc = (TestClone)tClone;
        System.out.format("%-4s"+"%d",tc.name,tc.age);
        
        //finalize����
        //������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷����������������գ�����ʲôʱ����ղ�ȷ����
        //һ���������������ᱻ��Ϊ��������
        //�����󱻸�null
        //Student s = new Student();
        //        s = null;
        //���������±�����
        //Student s = new Student();        
        //       s = new Student();
        /*final

        final���εı�����ʾ���������ܹ������θ�ֵ ��
        final���ε��಻�ܹ����̳� ��
        final���εķ������ܹ���������д��

        finally

        Java �е� Finally �ؼ�һ����tryһ��ʹ�ã��ڳ������try��֮�����۳�������Ϊ�쳣����ֹ��������ʽ������ֹ�ģ�finally�������һ���ᱻִ�� ��
	        �����������ִ�е�finally֮ǰjvm�˳��ˣ�����System.exit(0)����
	        ���ã������ͷ���Դ����IO�����������ݿ�����г�������*/
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
