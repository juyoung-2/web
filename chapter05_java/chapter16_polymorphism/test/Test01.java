package org.joonzis.test;
class Employee{
	String name, dept;
	public Employee() {}
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	int pay() {
		return 0;
	}
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
	}
}
class SalaryWorker extends Employee{
	int salary;
	public SalaryWorker() {}
	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}
	@Override
	int pay() {
		return salary;
	}
	@Override
	void output() {
		super.output();
		System.out.println("급여 : " + this.pay());
	}
}
class SalesWorker extends SalaryWorker{
	double salesIncentive;
	int salesVolume;
	public SalesWorker() {}
	public SalesWorker(String name, String dept, int salary) {
		super(name, dept, salary);
	}
	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		if(salesVolume >= 1000) {
			setSalesIncentive(0.1);
		}else if(salesVolume >= 500) {
			setSalesIncentive(0.05);
		}else {
			setSalesIncentive(0.01);
		}
	}
	private void setSalesIncentive(double salesIncentive) {
		this.salesIncentive = salesIncentive;
	}
	int salesPay() {
		return (int)(salary * salesIncentive);
	}
	@Override
	int pay() {
		return salary;
	}
	@Override
	void output() {
		super.output();
		System.out.println("수당 : " + this.salesPay());
	}
}
class PartTimeWorker extends Employee{
	int workTime, payPerHour;
	public PartTimeWorker() {}
	public PartTimeWorker(String name, String dept,
			int workTime, int payPerHour) {
		super(name, dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	@Override
	int pay() {
		return workTime * payPerHour;
	}
	@Override
	void output() {
		super.output();
		System.out.println("급여 : " + this.pay());
	}
}
public class Test01 {
	public static void main(String[] args) {
		Employee[] members = new Employee[3];
		members[0] = new SalaryWorker("김씨", "개발부", 200);
		members[1] = new SalesWorker("이씨", "영업부", 180);
		members[2] = new PartTimeWorker("박씨", "생산부", 10, 20);
		
		members[0].output();
		if(members[1] instanceof SalesWorker) {
			((SalesWorker)members[1]).setSalesVolume(1000);
		}
		members[1].output();
		members[2].output();
		
		
	}
}







