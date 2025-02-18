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


    public static DictionaryData saveJsonData(DictionaryData data) {


        return data;
    }
}
