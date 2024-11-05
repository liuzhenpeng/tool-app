package com.example.tool;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import com.example.tool.bootstrap.Application;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Ignore
public class BaseTest {

    public<T> String buildJson(T t) {
        return JSON.toJSONString(t, JSONWriter.Feature.WriteMapNullValue, JSONWriter.Feature.WriteNullNumberAsZero, JSONWriter.Feature.WriteNullListAsEmpty, JSONWriter.Feature.WriteNullListAsEmpty, JSONWriter.Feature.WriteNullBooleanAsFalse, JSONWriter.Feature.PrettyFormat);
    }

    @Before
    public void setTestContext() {
//        String eid = "6822727", oid = "5d0a27d3e4b02c374694f1bd", userId = "5934b5b300b09fce0cbd38e1", networkId = "59880e3d00b03d773419ba4f";
        String eid = "6822727", oid = "63eed507e4b0f78f86bd9500", userId = "5ba31367e4b07d419d93130c", networkId = "59880e3d00b03d773419ba4f";
    }
}
