package com.springdemo.testservice.employee.application

import com.springdemo.testservice.employee.api.requests.EmployeeRequest
import com.springdemo.testservice.employee.domain.Employee

interface IEmployeeRepository {

    fun createEmployee(employeeRequest: EmployeeRequest): Employee
}