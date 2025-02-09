package com.myProject.myDictionary.Controller;

import com.myProject.myDictionary.ServiceMgr.dictionaryServiceMgr;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/dictionary")
@CrossOrigin(origins = "http://localhost:4200")
public class dictionaryApi {

    private static final String DICTIONARY_API = "https://api.dictionaryapi.dev/api/v2/entries/en/";

    @PostMapping("/search")
    public ResponseEntity<?> searchWord(@RequestParam String word){
        String url = DICTIONARY_API + word;
        RestTemplate restTemplate = new RestTemplate();

        try {
            Object response = restTemplate.getForObject(url , Object.class);
            dictionaryServiceMgr.save(response);
            return ResponseEntity.status(200).body(response);
        } catch(Exception e){
            return ResponseEntity.status(500).body("Error fetching word data: " + e.getMessage());
        }
    }
}
