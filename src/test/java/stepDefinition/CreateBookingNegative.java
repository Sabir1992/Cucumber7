package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateBookingNegative {

    @Given("Create booking with valid data for firstname {string} and lastname {string}")
    public void createBookingWithValidData(String firstname, String lastname) {
        System.out.println("Negative start");
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
    }

    @When("I send a POST request to the Create Booking API")
    public void i_send_a_post_request_to_the_create_booking_api() {}

    @Then("I should receive a status code 200")
    public void i_should_receive_a_status_code_200() {}

    @Then("The response should contain the booking details")
    public void the_response_should_contain_the_booking_details() {
        System.out.println("Negative end");
    }


}
