
public class Student {
	
	private int name;
	private int roll_no;
	private double mark1;
	private double mark2;
	
	public Student (int name, int roll_no, double mark1 , double mark2)
	{
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	
	public void display()
	{
	
	}
	
	
	
}
