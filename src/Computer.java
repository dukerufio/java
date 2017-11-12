class Car {
	ComputeWeight[] huowu;
	double totalWeight=0;
	Car (ComputeWeight[] goods)
	{
	this.huowu=huowu;
	}
	public static void main(String[] args) {
		ComputeWeight[] huowu=new ComputeWeight[3];
		huowu[0]=new TV(100);
		huowu[1]=new Computer(150);
		huowu[2]=new Xiyiji(200);
		Car car=new Car(huowu);
		double totalweight;
		totalweight=huowu[0].computeWeight()+huowu[1].computeWeight()+huowu[2].computeWeight();
		System.out.println("货物的总重量为:"+totalweight);

	}

}
interface ComputeWeight {
	public double computeWeight(); 

}
public class Computer implements ComputeWeight {
	double cptweight;
	Computer(double c){
		this.cptweight=c;
	}
	public double computeWeight(){
		return cptweight;

	}
}
class TV implements ComputeWeight { //通过实现接口ComputerWeight给出自重
	double tvweight;
	TV(double t){
		this.tvweight=t;
	}
	public double computeWeight(){
		return tvweight;

}
}
class Xiyiji implements ComputeWeight{
	double xyjweight;
	Xiyiji(double w){
		this.xyjweight=w;
	}
	public double computeWeight(){
		return xyjweight;

	}

}