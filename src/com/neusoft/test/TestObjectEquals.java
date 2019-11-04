package com.neusoft.test;

public class TestObjectEquals {
	  	public String name;
	    public int age;
	    public TestObjectEquals(String name,int age){
	        this.name=name;
	        this.age=age;
	    }
	   
	    
	    @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TestObjectEquals other = (TestObjectEquals) obj;
			if (age != other.age)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}


		public static void main(String[] args)
	    {
	        TestObjectEquals t=new TestObjectEquals("zhangsan", 18);
	        TestObjectEquals t1=new TestObjectEquals("zhangsan", 18);
	        System.out.println(t.equals(t1));
	        System.out.println(t==t1);
	    }
}
