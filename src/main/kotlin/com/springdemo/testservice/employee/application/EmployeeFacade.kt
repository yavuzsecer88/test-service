package com.springdemo.testservice.employee.application

import com.springdemo.testservice.employee.api.requests.EmployeeRequest
import com.springdemo.testservice.employee.domain.Employee
import org.springframework.stereotype.Service

@Service
class EmployeeFacade(
    private val employeeRepository: IEmployeeRepository
): IEmployeeFacade {

    override fun addEmployer(employee: EmployeeRequest): Employee {
        return employeeRepository.createEmployee(employee)
    }
}