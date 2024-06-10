package com.java.ec2.study.project.boundaries.in.controller.ItemController;

import com.java.ec2.study.project.boundaries.in.controller.ItemController.response.ItemResponse;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@NoArgsConstructor
@RequestMapping("/items")
public class ItemController {

    @GetMapping("")
    public ResponseEntity<List<ItemResponse>> getAllItems() {
        List<ItemResponse> items = Arrays.asList(
                new ItemResponse(1, "Logitech G Pro", 850.5, "Best competitive gaming mouse", 10),
                new ItemResponse(2, "Logitech G915", 850.5, "Mechanical Keyboard with Low Profile Key Caps and wireless", 10)
        );
        return ResponseEntity.ok(items);
    }
}
