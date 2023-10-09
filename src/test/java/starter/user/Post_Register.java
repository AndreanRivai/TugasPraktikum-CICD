package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post_Register {

    protected String url = "https://reqres.in/api/";

    @Step("I set POST api endpoint to register")
    public String setPostApiEndpointRegister() {return url + "register"; }

    @Step("I send POST HTTP request to register")
    public void sendPostHttpRequestRegister() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "eve.holt@reqres.in");
        requestBody.put("password","pistol");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpointRegister());
    }

    @Step("I receive valid HTTP response 200")
    public  void  receiveValidHttp200() {restAssuredThat(response -> response.statusCode(200));}

    @Step("I receive valid data for register")
    public void validateDataRegister(){
        JsonSchemaHelper helper = new JsonSchemaHelper();

        restAssuredThat(response -> response.body(matchesJsonSchema(helper.getPostResponseSchemaRegister())));

    }

}
