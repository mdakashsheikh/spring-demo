package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String empName;
	private List<String> phoneList;
	private Set<String> addressSet;
	private Map<String, String> courseMap;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhoneList() {
		return phoneList;
	}
	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}
	public Set<String> getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	public Map<String, String> getCourseMap() {
		return courseMap;
	}
	public void setCourseMap(Map<String, String> courseMap) {
		this.courseMap = courseMap;
	}
	
	public Emp(String empName, List<String> phoneList, Set<String> addressSet, Map<String, String> courseMap) {
		super();
		this.empName = empName;
		this.phoneList = phoneList;
		this.addressSet = addressSet;
		this.courseMap = courseMap;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
