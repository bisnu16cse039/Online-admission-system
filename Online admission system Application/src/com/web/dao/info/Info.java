package com.web.dao.info;

public class Info {
  String rollno,academicyear,sname;

public String getRollno() {
	return rollno;
}

public void setRollno(String rollno) {
	this.rollno = rollno;
}

public String getAcademicyear() {
	return academicyear;
}

public void setAcademicyear(String academicyear) {
	this.academicyear = academicyear;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

@Override
public String toString() {
	return "Info [rollno=" + rollno + ", academicyear=" + academicyear
			+ ", sname=" + sname + "]";
}
  
}
