package com.myProject.myDictionary.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dictionary")
@CrossOrigin(origins = "http://localhost:4200")
public class dictionaryApi {

    @PostMapping("/")
    public ResponseEntity<dictionaryApi>(){


        return ResponseEntity.ok();
    }
}
