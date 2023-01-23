package com.example.demo.controller

import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:5173"])
class TestController {
    @GetMapping("/btnTest")
    fun btnTest(): HashMap<String, String> {
        val tmp = HashMap<String, String>()
        tmp.put("a", "100")
        tmp.put("b", "200")
        tmp.put("c", "300")
        return tmp
    }

    @PostMapping("/btnTest")
    fun btnTest2(@RequestBody tmp: String): String {
        println(tmp)
        return "Done"
    }
}