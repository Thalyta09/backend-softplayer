package com.tconrado.softplayers.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SourceControllerImpl {

    @GetMapping("/api/source")
    public String Github(){
        return "https://github.com/Thalyta09/backend-softplayer";
    }
}
