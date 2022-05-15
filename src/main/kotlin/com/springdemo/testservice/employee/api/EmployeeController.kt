package com.springdemo.testservice.employee.api

import com.springdemo.testservice.employee.api.requests.EmployeeRequest
import com.springdemo.testservice.employee.application.IEmployeeFacade
import com.springdemo.testservice.employee.domain.Employee
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController(val employeeFacade: IEmployeeFacade) {

    @PostMapping("/api/employee")
    fun addEmployee(
        @RequestBody request: EmployeeRequest
    ): ResponseEntity<Employee> {
        val employee = employeeFacade.addEmployer(request)
        return ResponseEntity.ok().body(employee);
    }
}