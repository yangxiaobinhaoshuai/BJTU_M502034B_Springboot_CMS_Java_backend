package org.bjtu.cms.bjtucms.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello world"
    }
}