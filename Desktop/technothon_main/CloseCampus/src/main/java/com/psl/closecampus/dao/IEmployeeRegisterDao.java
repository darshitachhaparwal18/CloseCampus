package com.psl.closecampus.dao;

import com.psl.closecampus.entity.Employee;

public interface IEmployeeRegisterDao {
	Employee getEmployee(String mac_addr);
	void registerEmployee(Employee employee);
	void sendSmsOnEmployeeNo(Employee employee);
	void sendEmployeeDetailsToAdmin(Employee employee);
}
