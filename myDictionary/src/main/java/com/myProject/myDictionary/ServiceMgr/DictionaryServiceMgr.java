package com.myProject.myDictionary.ServiceMgr;

import com.myProject.myDictionary.Entity.DictionaryData;
import com.myProject.myDictionary.Repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DictionaryServiceMgr {

    @Autowired
    private DictionaryRepository dictionaryRepository;


    public static DictionaryData mapJsonData(DictionaryData data) {
        DictionaryData dictionaryData = new DictionaryData();

        System.out.println(dictionaryData.getT1());


        return data;
    }
}
