package UseOfThisKeyword;

public class Employee 
{
	int id;
	String name;
	double salary;
	
	Employee(int id,double salary,String name)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void displayEMPDetail()
	{
		
		System.out.println("Emp id:"+id);
		System.out.println("emp name:"+name);
		System.out.println("emp salary:"+salary);
		
	}
	
	public void ChangeSalary(double salary)
	{
		this.salary = salary;
		
	}
}
