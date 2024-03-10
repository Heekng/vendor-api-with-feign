package com.heekng.main.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class MainApiApplication {
}

fun main(args: Array<String>) {
    runApplication<MainApiApplication>(*args)
}
