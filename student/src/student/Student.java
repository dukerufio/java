package student;
public class Student {
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void sho(){
		System.out.println("ѧ��name="+name+";ѧ��age="+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s=new Student("��˾��",20);
    s.sho();
    Undergraduate p=new Undergraduate("��˾��",20,"�������");
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
		System.out.println("ѧ��name="+name+";ѧ��age="+age+";ѧ��degree="+degree);
	}
	
}

