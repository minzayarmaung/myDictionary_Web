package com.myProject.myDictionary.ServiceDao;

import com.myProject.myDictionary.Controller.DictionaryApi;
import com.myProject.myDictionary.Entity.Result;
import com.myProject.myDictionary.Util.ServerUtil;
import org.apache.catalina.Server;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceDao {

    private static final String todayDate = ServerUtil.getLocalDate();
    private static final String currentTime = ServerUtil.getLocalDateTime();

    public static Result saveData(DictionaryApi data) {
        Result res = new Result();


        return res;
    }
}
