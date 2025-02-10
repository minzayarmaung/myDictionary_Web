package com.myProject.myDictionary.ServiceMgr;

import com.fasterxml.jackson.databind.node.ArrayNode;
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

        // Phonetics Data
        List<Map<String, Object>> phonetics = (List<Map<String, Object>>) response.get("phonetics");
        PhoneticsData phoneticsData = new PhoneticsData();
        if (phonetics != null && !phonetics.isEmpty()) {
            for (Map<String, Object> phonetic : phonetics) {
                if (phonetic.get("audio") != null) {
                    phoneticsData.setT2(phonetic.get("audio").toString());
                }
                if (phonetic.get("text") != null) {
                    phoneticsData.setT1(phonetic.get("text").toString());
                }
                if (phonetic.get("sourceUrl") != null){
                    phoneticsData.setT3(phonetic.get("sourceUrl").toString());
                }
            }
            data.setPhoneticsData(phoneticsData);
        }

        // MeaningData
        List<Map<String, Object>> meanings = (List<Map<String, Object>>) response.get("meanings");
        MeaningData meaningData = new MeaningData();
        if(meanings != null && !meanings.isEmpty()){
            for(Map<String , Object> meaning : meanings){
                if(meaning.get("partOfSpeech") != null){
                    meaningData.setT1(meaning.get("partOfSpeech").toString());
                }
            }
        }
        return data;
    }
}
