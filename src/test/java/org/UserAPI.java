package org;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import static org.junit.Assert.*;

import org.json.JSONArray;
import org.json.JSONObject;
import utility.ConfigurationData;
import utility.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserAPI {
    public Response response;
    public RequestSpecification requestSpecification;
    public void setBaseURL(){
        RestAssured.baseURI= ConfigurationData.baseURL;
    }
    public void setSepecificationForAPI(){
    requestSpecification=RestAssured.given();

    }
    public void getListOfUser() throws Throwable{
        response=requestSpecification.get("/api/users?page=2");
        String jsonString=response.asString();
        System.out.println(jsonString);
        List<Map<String,String>> users= JsonPath.from(jsonString).get("data");
        System.out.println(users.get(0).get("email"));
    }
    public void getStatusCodeForAPI(int statusCode){
        assertEquals(statusCode,response.getStatusCode());
    }

    public void addUsers(){
        requestSpecification=RestAssured.given();
        JSONObject object=new JSONObject();
        object.put("name","Mohammad");
        object.put("job","Senior QA");
        requestSpecification.body(object.toString());
        response=requestSpecification.post("/api/user");
        System.out.println(response.getStatusCode());
}
public void updateUsers(){

}


}
