package com.springdemo.testservice.employee.application

import com.springdemo.testservice.employee.api.requests.EmployeeRequest
import com.springdemo.testservice.employee.domain.Employee
import org.springframework.stereotype.Component

@Component
class EmployeeRepository(
    private val employeeMapper: EmployeeMapper
): IEmployeeRepository {

    override fun createEmployee(employeeRequest: EmployeeRequest): Employee {
        return employeeMapper.map(employeeRequest)
    }
}