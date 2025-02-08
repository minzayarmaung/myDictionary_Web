package com.myProject.myDictionary.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dictionary")
@CrossOrigin(origins = "http://localhost:4200")
public class dictionaryApi {


}
