package com.ssh;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.body.MultipartBody;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;
/**
 * @author Evim
 * @date 2019/3/2020:10
 **/
public class Test {

    public static void main(String[] args) throws FileNotFoundException, UnirestException {
        File file = new File("e://upload.zip");
        String plateNo = "苏A2R111";
        MultipartBody field = Unirest.post("http://101.204.252.127/auap-esb-docker-sit/externalServices/trandition/uploadVideo.json")
                .field("plateNo", plateNo).field("file", file);
        HttpResponse<JsonNode> jsonNodeHttpResponse = field.asJson();
        String message = (String) jsonNodeHttpResponse.getBody().getObject().get("message");
        System.out.println("message = " + message);
        System.out.println("plateNo = " + plateNo);
    }
}
