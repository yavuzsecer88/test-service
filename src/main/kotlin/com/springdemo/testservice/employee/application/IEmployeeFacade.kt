package com.springdemo.testservice.employee.application

import com.springdemo.testservice.employee.api.requests.EmployeeRequest
import com.springdemo.testservice.employee.domain.Employee

interface IEmployeeFacade {

    fun addEmployer(
        employee: EmployeeRequest
    ): Employee
}