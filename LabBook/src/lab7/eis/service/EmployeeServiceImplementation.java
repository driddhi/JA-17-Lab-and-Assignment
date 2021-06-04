package com.capgemini.lab7.eis.service;

import com.capgemini.lab7.eis.bean.Employee;
import com.capgemini.lab7.eis.hashMap.EmployeeHash;

public class EmployeeServiceImplementation implements EmployeeService {
    EmployeeHash eh = new EmployeeHash();

    public boolean addEmployee(Employee e) {
        return eh.addEmployee(e);
    }

    public String findInsuranceScheme(double sal, String desg) {
        return eh.findInsuranceScheme(sal, desg);

    }

    public Employee showEmployee(int id) {
        return eh.showEmployee(id);
    }


}
