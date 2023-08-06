package gg.borro.mongo.learn.mongol.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Тестовый контроллер")
@RequestMapping(value = "/test")
@RestController
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @Operation(summary = "Тест get")
    @GetMapping
    public String find() {
        return id;
    }
}
