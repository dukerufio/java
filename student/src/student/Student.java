package student;
public class Student {
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void sho(){
		System.out.println("学生name="+name+";学生age="+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s=new Student("唐司南",20);
    s.sho();
    Undergraduate p=new Undergraduate("唐司南",20,"软件工程");
    p.show();
	}
}
class Undergraduate extends Student{
	
	String degree;
	public Undergraduate(String name, int age,String degree) {
		super(name, age);
		this.degree = degree;
	}
	public void show (){
		System.out.println("学生name="+name+";学生age="+age+";学生degree="+degree);
	}
	
}

