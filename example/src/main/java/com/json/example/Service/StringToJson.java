package com.json.example.Service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

@Service
public interface StringToJson {

    JSONObject StringToFastJson();

}
