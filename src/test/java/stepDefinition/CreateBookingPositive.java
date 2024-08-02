package stepDefinition;

import config.UtilServices;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateBookingPositive extends UtilServices {

    @Given("User yeni bir booking yaradir")
    public  void requestStart(){
        System.out.println("Positive start");
    }

    @Given("User create ucun lazim olan datani verir")
    public void user_create_ucun_lazim_olan_datani_verir() {

   


    }

    @When("Booking create")
    public void booking_create_olur() {}

    @Then("Assertions")
    public void asssertions() {}

    @Then("Booking ugurlu sekilde yaradildi")
    public void booking_ugurlu_sekilde_yaradildi() {
        System.out.println("Positive end");
    }

}
