package com.psl.closecampus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.psl.closecampus.entity.Employee;
import com.psl.closecampus.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService ;

	@RequestMapping(value="/emp_register",method = RequestMethod.GET)
	public String showHomePage(Model model){
		System.out.println("I am inside showHomePage:");
		model.addAttribute("employee", new Employee());
		return "emp_register";
	}
	
	@RequestMapping(value="/employee/{mac_addr}",method=RequestMethod.GET)
	public ModelAndView getEmployee(@PathVariable("mac_addr") String mac_addr){
		ModelAndView model = new ModelAndView();
		Employee employee = employeeService.getEmployee(mac_addr);
		model.addObject("employee",employee);
		model.setViewName("employee");
		return model;
	}
	


	@RequestMapping(value="/emp_register",method = RequestMethod.POST)
	public String registerEmployee(Model model,Employee employee,BindingResult result){
		System.out.println("In am Inside Registration page: ");
		model.addAttribute("employee", new Employee());
		model.addAttribute("mac_addr", employee.getMac_addr());
		model.addAttribute("owner_name", employee.getOwner_name());
		model.addAttribute("vehicle_no", employee.getVehicle_no());
		model.addAttribute("mob_no", employee.getMob_no());
		
		employeeService.registerEmployee(employee);
		System.out.println("employee Registered");
		
		if(result.hasErrors()){
			return "failure";
		}
		return "success";
	}
	

	@RequestMapping(value="/employee",method = RequestMethod.POST)
	public ModelAndView registerEmployee(@RequestBody Employee e){
		ModelAndView model = new ModelAndView();
		System.out.println("employee........");
		System.out.println(e);
		employeeService.registerEmployee(e);
		model.addObject("employee",e);
		model.setViewName("employee");
		return model;
	}
	
}
