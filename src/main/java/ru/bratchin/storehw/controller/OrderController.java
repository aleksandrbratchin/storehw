package ru.bratchin.storehw.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.bratchin.storehw.service.api.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public ResponseEntity<?> add(
            @RequestParam List<Integer> ids
    ) {
        service.add(ids);
        return ResponseEntity.ok("");
    }

    @GetMapping("/get")
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(service.get());
    }

}
