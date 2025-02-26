package com.myProject.myDictionary.ServiceDao;

import com.myProject.myDictionary.Controller.DictionaryApi;
import com.myProject.myDictionary.Entity.DictionaryData;
import com.myProject.myDictionary.Entity.Result;
import com.myProject.myDictionary.ServiceMgr.DictionaryServiceMgr;
import com.myProject.myDictionary.ServiceMgr.JsonDataMgr;
import com.myProject.myDictionary.Util.ServerUtil;
import org.apache.catalina.Server;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceDao {

    private static final String todayDate = ServerUtil.getLocalDate();
    private static final String currentTime = ServerUtil.getLocalDateTime();

    public static Result saveData(DictionaryData data) {
        Result res = new Result();
        DictionaryData dictionaryData = DictionaryServiceMgr.mapJsonData(data);



        return res;
    }
}
