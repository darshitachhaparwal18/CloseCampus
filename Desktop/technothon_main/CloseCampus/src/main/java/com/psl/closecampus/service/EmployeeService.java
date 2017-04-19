package com.psl.closecampus.service;

import com.psl.closecampus.dao.IEmployeeRegisterDao;
import com.psl.closecampus.entity.Employee;

public class EmployeeService {

	private IEmployeeRegisterDao employeeRegisterDao;

	public IEmployeeRegisterDao getEmployeeRegisterDao() {
		return employeeRegisterDao;
	}

	public void setEmployeeRegisterDao(IEmployeeRegisterDao employeeRegisterDao) {
		this.employeeRegisterDao = employeeRegisterDao;
	}

	public Employee getEmployee(String mac_addr){
		return employeeRegisterDao.getEmployee(mac_addr);
	}
	
	public void registerEmployee(Employee employee) {
		employeeRegisterDao.registerEmployee(employee);
	}

	public void sendSmsOnEmployeeNo(Employee employee) {
		employeeRegisterDao.sendEmployeeDetailsToAdmin(employee);
	}

	public void sendEmployeeDetailsToAdmin(Employee employee) {
		employeeRegisterDao.sendEmployeeDetailsToAdmin(employee);
	}

}
