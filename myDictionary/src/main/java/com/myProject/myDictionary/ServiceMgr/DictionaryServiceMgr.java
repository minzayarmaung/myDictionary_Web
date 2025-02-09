package com.myProject.myDictionary.ServiceMgr;

import com.myProject.myDictionary.Entity.DictionaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DictionaryServiceMgr {

    public static void save( Map<String , Object> response) {
        DictionaryData data = new DictionaryData();

        String word = response.get("word").toString();
        String phonetic = response.get("phonetic").toString();
        data.setT1(word);



    }
}
