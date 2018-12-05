package weatherapp;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getRequest {

    @Test
    public void testResponse(){
        Response resp =   RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        int status_code = resp.getStatusCode();
        System.out.println("Status code is : " + status_code);
        Assert.assertEquals(status_code,200);
    }

    @Test
    public void testbody(){
        Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        String data = resp.asString();

        System.out.println("Response data : " + data);

        System.out.println("Response time :" + resp.getTime());
    }
}
