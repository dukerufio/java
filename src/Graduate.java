//����һ��ѧ������ӿ�
interface StudentManageInterface{
	void setFee(int fee);
	int getFee();
}

//����һ����ʦ����ӿ�

interface TeacherManageInterface
{
	void setPay(int pay);
	int getPay();
}
/*
* ����һ���о�����Graduate,��ʵ��StudentManageInterface��TeacherManageInterface �ӿ�
* ����ĳ�Ա������name(����)��sex(�Ա�)��age(����)��fee(ÿѧ��ѧ��)��pay(�¹���)��
*/
public class Graduate implements StudentManageInterface, TeacherManageInterface{
	private String name;
	private String sex;
	private int age;
	private int fee;
	private int pay;
	public Graduate(String name,int fee, int pay){
		super();
		this.name = name;
		this.fee = fee;
		this.pay = pay;
		if (this.pay - this.fee < 20000)
			System.out.println("��Ҫ����!");
		}
	public int getFee(){
		return this.fee;
		}
	public int getPay(){
		return this.pay;
		}
	public void setFee(int fee){
		this.fee = fee;
		}
	public void setPay(int pay){
		this.pay = pay;
		}
	public String getName(){
		return name;
		}
	public void setName(String name){
		this.name = name;
		}
	public String getSex(){
		return sex;
		}
	public void setSex(String sex){
		this.sex = sex;
		}
	public int getAge(){
		return age;
		}
	public void setAge(int age){
		this.age = age;
		}
	public static void main(String[] args){
		// �����о�����Graduateѧ��zhangsan����
		new Graduate("zhangsan",31000, 50000);
		}
	}