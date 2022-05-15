package com.springdemo.testservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class TestServiceApplication

fun main(args: Array<String>) {
    runApplication<TestServiceApplication>(*args)
}
