//定义一个学生管理接口
interface StudentManageInterface{
	void setFee(int fee);
	int getFee();
}

//定义一个老师管理接口

interface TeacherManageInterface
{
	void setPay(int pay);
	int getPay();
}
/*
* 定义一个研究生类Graduate,并实现StudentManageInterface和TeacherManageInterface 接口
* 定义的成员变量有name(姓名)、sex(性别)、age(年龄)、fee(每学期学费)、pay(月工资)；
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
			System.out.println("需要贷款!");
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
		// 创建研究生类Graduate学生zhangsan对象
		new Graduate("zhangsan",31000, 50000);
		}
	}