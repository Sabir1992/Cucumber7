package stepDefinition;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    // DataProvider method supplying data for the test method
    @DataProvider(name = "loginData")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { "user1", "password1" },
                { "user2", "password2" },
                { "user3", "password3" }
        };
    }

    // Test method using data from the DataProvider
    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        // Add your test code here, for example:
        // Assert.assertTrue(login(username, password));
    }
}
