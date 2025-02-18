package com.myProject.myDictionary.Controller;

import com.myProject.myDictionary.Entity.DictionaryData;
import com.myProject.myDictionary.Entity.Result;
import com.myProject.myDictionary.ServiceDao.DictionaryServiceDao;
import com.myProject.myDictionary.ServiceMgr.DictionaryServiceMgr;
import com.myProject.myDictionary.ServiceMgr.JsonDataMgr;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/dictionary")
@CrossOrigin(origins = "http://localhost:4200")
public class DictionaryApi {

    private static final String DICTIONARY_API = "https://api.dictionaryapi.dev/api/v2/entries/en/";

    @PostMapping("/search")
    public ResponseEntity<?> searchWord(@RequestParam String word){
        String url = DICTIONARY_API + word;
        RestTemplate restTemplate = new RestTemplate();

        try {
            Map<String, Object>[] response = restTemplate.getForObject(url, Map[].class);

            if(response.length > 0){
                return ResponseEntity.status(200).body(response);
            } else {
                return ResponseEntity.status(404).body("Word not found.");
            }
        } catch(Exception e){
            return ResponseEntity.status(500).body("Error fetching word data: " + e.getMessage());
        }
    }

    @PostMapping("/ ")
    public Result saveWord(DictionaryApi data){
        Result res = new Result();
        res.setState(false);
        res = DictionaryServiceDao.saveData(data);
        return res;
    }
}
