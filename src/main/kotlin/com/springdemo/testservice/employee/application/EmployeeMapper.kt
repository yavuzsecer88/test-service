package com.springdemo.testservice.employee.application

import com.springdemo.testservice.employee.api.requests.EmployeeRequest
import com.springdemo.testservice.employee.domain.Employee
import org.springframework.stereotype.Component

@Component
class EmployeeMapper {

    fun map(employeeRequest: EmployeeRequest): Employee {
        return Employee("3", "Johnny", "Boy")
    }
}