package bank;

import java.util.Scanner;

public class DepositeAccount {
private static  double lilv =0.023;
private static double money=5000;
private static int usersname;
private static String name;
private void lixi(double lilv){
	this.lilv = lilv;
	this.money = money;
	this.usersname = usersname;
}
public DepositeAccount(int usersname,String name){
	this.usersname = usersname;
	this.name = name;
}
public double suanlixi(double money,double lixi,boolean fangshi){//������Ϣ
	if(fangshi)//fangshi=trueʱ��������Ϣ
		return money*lixi/12;
	else
		return money*lixi;
}

public void open(){
	DepositeAccount saver = new DepositeAccount(1234567890,"zhangsan");
}
public void load(int username,String name){
	System.out.println("�������˻�����");
Scanner scanner = new Scanner(System.in);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���:"+DepositeAccount.money );
		DepositeAccount sa = new DepositeAccount(usersname, name);
        System.out.println("����Ϣ:"+sa.suanlixi(DepositeAccount.money,DepositeAccount.lilv,false));
        System.out.println("����Ϣ:"+sa.suanlixi(DepositeAccount.money,DepositeAccount.lilv,true));
	}

}
