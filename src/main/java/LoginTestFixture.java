/**
 * Fixture to explain script table. Simplified from FitNesse's LoginDialogDriver.
 */
public class LoginTestFixture {
    private int counter;

    public boolean loginWithUsernameAndPassword(String username, String password) {
        counter = counter + 1;
        return "Bob".equals(username)
                && "secret".equals(password);
    }

    public int numberOfLoginAttempts() {
        return counter;
    }
}
