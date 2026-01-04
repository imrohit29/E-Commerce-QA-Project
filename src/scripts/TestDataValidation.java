package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDataValidation {

    @Test
    public void validateUserData() {
        String username = "testuser";
        String password = "Test@123";

        Assert.assertFalse(username.isEmpty(), "Username should not be empty");
        Assert.assertTrue(password.length() >= 6, "Password should be at least 6 chars");
        System.out.println("User data validation passed!");
    }
}
