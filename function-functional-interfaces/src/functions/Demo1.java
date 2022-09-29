package functions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

class Faculty {
	String name;
	String designation;
	String subject;
	String dept;

	public Faculty(String name, String designation, String subject, String dept) {
		super();
		this.name = name;
		this.designation = designation;
		this.subject = subject;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}

class HOD {
	String name;
	String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public HOD(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "name=" + name + ", dept=" + dept;
	}
}

// Example 1:
// We have a list of Faculties, from the list, i want the list of HODs in HOD Class object.

public class Demo1 {
	public static void main(String[] args) {
		List<Faculty> lists = Arrays.asList(new Faculty("Wasim", "HOD", "Computer Science", "IT"),
				new Faculty("Mack", "Staff", "Maths", "Math"), new Faculty("Alex", "Staff", "Accounts", "Account"),
				new Faculty("Naz", "Admin", "Admin", "Admin"), new Faculty("Zaro", "HOD", "Computer Networks", "MCA"));
		
		List<HOD> li = null;
	
		
		Function<Faculty, HOD> hod = l -> {
			if(l.getDesignation().equals("HOD")) {
				return new HOD(l.getName(), l.getDept());
			}
			return null;
		};
		
		for (Faculty faculty : lists) {
			HOD h = hod.apply(faculty);
			if(h != null) System.out.println(h.toString());
		}
		// Output is
		// name=Wasim, dept=IT
		// name=Zaro, dept=MCA
	}
}
