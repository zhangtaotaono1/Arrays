package ztt.com;

public class Person {
	private String name;
	private int age;
	public Person() {
		
	}
	public Person(String name,int age){
		this.name =name;
		this.age=age;
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
	public int hashCode(){
		return name.hashCode()+age*39;
		
	}
	public boolean equals(Object obj){
		if(this==obj)//同一个对象放两次，直接返回true
		return true;
		if(!(obj instanceof Person))
			throw new ClassCastException("类型错误");
		 Person p= (Person)obj;
		 
		
		return this.name.equals(p.name)&&this.age==p.age;
		
	}
	

}
