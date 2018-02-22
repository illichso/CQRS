package conference.methodlevel;

public class UserNonCQRS {
    private String email;

    public boolean isEmailValid(String email) {
        boolean isMatch = isRegexMatch(email);

        if (isMatch) {
            this.email = email; // Command
        }

        return isMatch; // Query
    }



    private boolean isRegexMatch(String email) {
        return !email.isEmpty();
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
