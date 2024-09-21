package com.minigame.one_two_three.controllers;


import com.minigame.one_two_three.models.Options;
import com.minigame.one_two_three.models.Results;
import com.minigame.one_two_three.services.RandomObject;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/play")
@RequiredArgsConstructor
public class PlayController {
    private final RandomObject randomObject;
    @GetMapping("/chose-option")
    public ResponseEntity<Results> choseOption(@RequestBody Options opt) {
        return ResponseEntity.status(200).body(randomObject.GetRandomResult(opt));
    }
}
