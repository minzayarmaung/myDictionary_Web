package com.myProject.myDictionary.ServiceMgr;

import com.myProject.myDictionary.Controller.DictionaryApi;
import com.myProject.myDictionary.Entity.DictionaryData;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class JsonDataMgr {

    public static DictionaryData manageJsonData(Map<String, Object> response) {

        DictionaryData data = new DictionaryData();

        data.setT1(response.get("word").toString());
        data.setT2(response.get("phonetic").toString());

        return data;
    }
}
