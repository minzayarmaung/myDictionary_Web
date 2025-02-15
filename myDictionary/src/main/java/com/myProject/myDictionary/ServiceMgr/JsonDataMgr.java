package com.myProject.myDictionary.ServiceMgr;

import com.myProject.myDictionary.Entity.DictionaryData;

import com.myProject.myDictionary.Entity.MeaningData;
import com.myProject.myDictionary.Entity.PhoneticsData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JsonDataMgr {

    public static DictionaryData saveJsonData(Map<String, Object> response) {

        DictionaryData data = new DictionaryData();

        data.setT1(response.get("word").toString());
        data.setT2(response.get("phonetic").toString());

        return data;
    }
}
