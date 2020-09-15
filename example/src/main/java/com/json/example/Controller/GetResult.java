package com.json.example.Controller;

import com.json.example.Service.StringToJson;

public class GetResult {
    StringToJson stringToJson;

    public StringToJson getResult(){
        return (StringToJson) stringToJson.StringToFastJson();
    }
}
