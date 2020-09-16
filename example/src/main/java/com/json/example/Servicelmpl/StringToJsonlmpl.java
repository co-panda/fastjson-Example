package com.json.example.Servicelmpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.json.example.Service.StringToJson;



public class StringToJsonlmpl implements StringToJson {
    String contents = "{\"SectionVIPhotos\": {\"Photo1\":{\"abcd\"}}, \"SectionVIPhotos\": {\"Photo2\":{\"efg\"}}}";
    public JSONObject StringToFastJson() {
        JSONObject r = new JSONObject();
        JSONObject jsonObject = (JSONObject) JSON.parse(contents);
        JSONArray p1 = jsonObject.getJSONObject("SectionVIPhotos").getJSONArray("Photo1");
        JSONArray p2 = jsonObject.getJSONObject("SectionVIPhotos").getJSONArray("Photo2");
        String cont = jsonObject.getJSONObject("SignaturePage").getJSONObject("Signature")
                .getString("Content");

        r.put("photo1", p1);
        r.put("photo2", p2);
        r.put("content", cont);

        System.out.println(p1);
        return r;
    }
}
