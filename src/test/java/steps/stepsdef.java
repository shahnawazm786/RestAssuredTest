package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.UserAPI;

public class stepsdef {
    UserAPI listUserAPI=new UserAPI();

    @Given("set the base url for the api")
    public void setTheBaseUrlForTheApi() {
        listUserAPI.setBaseURL();

    }
    @Given("set the endpoints for the list user")
    public void setTheEndpointsForTheListUser() {
        listUserAPI.setSepecificationForAPI();
    }
    @And("list the user data")
    public void listTheUserDataAbc() throws Throwable {
        listUserAPI.getListOfUser();
    }
    @Then("response should be {int}")
    public void responseShouldBe(int arg0) {
        listUserAPI.getStatusCodeForAPI(arg0);
    }


    @Given("set the endpoints for the add user")
    public void setTheEndpointsForTheAddUser() {
       // listUserAPI.setEndPointForAddUser();
    }

    @Then("enter data to add user")
    public void enterDataToAddUser() {
        listUserAPI.addUsers();
    }

    @When("enter data to update user")
    public void enterDataToUpdateUser() {

    }
}
