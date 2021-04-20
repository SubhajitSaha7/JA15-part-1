package encapsulation;

public class Emp {
	private byte age;
	private String name;
	private double sal;
	private double da;
	private double pf;
	private double netSal;
	
	public byte getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if (age < 20 || age > 50)
			throw new Exception("Age must be between 20 and 50");
		this.age = (byte) age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if (!name.matches("[a-zA-Z]{3,15}")
				throw new Exception("Name must contain min 3 and max 15 alphabets"); 
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) throws Exception {
		if (sal < 5000)
			throw new Exception ("Salary must be min Rs. 5000");
		this.sal = sal;
		this.pf=this.sal * 0.12;
		this.da = this.sal * 0.4;
		this.netSal= this.sal+this.da-this.pf;
	}
	public double getNetSal() {
		return netSal;
	}
	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
	public double getDa() {
		return da;
	}
	public double getPf() {
		return pf;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public double getNetSal()
	{
		return netSal;
	}
	
	
}
