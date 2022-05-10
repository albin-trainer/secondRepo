package com.cg.collections;

public class Employee {
private int empId;
private String name;
private String address;


public Employee(int empId, String name, String address) {
	super();
	this.empId = empId;
	this.name = name;
	this.address = address;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public int hashCode() {
	System.out.println("****hashCode called....");
	return empId;
}
public boolean equals(Object obj) {
	System.out.println("****equals called....");
	Employee e=(Employee) obj;
	if(e.empId==this.empId && e.name.equals(this.name) 
			&& e.address.equals(this.address))
		return true;
	else
		return false;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]\n";
}

}
