package conference.methodlevel;

public class UserCQRS {
    private String email;

   // Query
    public boolean isEmailValid(String email) {
        return isRegexMatch(email);
    }

    // Command
    public void changeEmail(String email) {
        if (isEmailValid(email) == false)
            System.out.println("Email is not valid");
        this.email = email;
    }

    private boolean isRegexMatch(String email) {
        return email.isEmpty();
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
