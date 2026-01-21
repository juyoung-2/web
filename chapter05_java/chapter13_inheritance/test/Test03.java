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
	public SalesWorker() {}
	public SalesWorker(String name, String dept, 
			int salary, double salesIncentive) {
		super(name, dept, salary);
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
public class Test03 {
	public static void main(String[] args) {
		SalaryWorker sal = 
				new SalaryWorker("김씨", "개발부", 1000);
		sal.output();
		
		System.out.println("-------------------------");
		
		SalesWorker sales =
				new SalesWorker("이씨", "영업부", 800, 0.2);
		sales.output();
		
		System.out.println("-------------------------");
		
		PartTimeWorker part =
				new PartTimeWorker("박씨", "생산부", 9, 100);
		part.output();
	}
}








