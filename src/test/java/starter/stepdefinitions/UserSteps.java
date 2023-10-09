package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {

    @Steps
    Post post;

    @Steps
    Post_Register post_register;

    @Steps
    Put put;

    @Given("I set POST api endpoint")
    public void setPostApiEndpoints() {
        post.setPostApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void setPostHttpRequest() {
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201() {
        post.receiveValidHttp201();
    }

    @And("I receive valid data for new user")
    public void validateDataNewUser() {
        post.validateDataNewUser();
    }

    @Given("I set POST api endpoint to register")
    public void setPostApiEndpointRegister() {post_register.setPostApiEndpointRegister(); }

    @When("I send POST HTTP request to register")
    public void setPostHttpRequestRegister() {post_register.sendPostHttpRequestRegister();}

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttp200() {post_register.receiveValidHttp200();}

    @And("I receive valid data for register")
    public void validateDataRegister() {post_register.validateDataRegister();}

    @Given("I set PUT api endpoint")
    public void setPutApiEndpoints() {
        put.setPutApiEndpoint();
    }

    @When("I send PUT HTTP request")
    public void setPutHttpRequest() {
        put.sendPutHttpRequest();
    }

    @And("I receive valid data for updated user")
    public void validateDataUpdatedUser() {
        put.validateDataUpdatedUser();
    }

}
