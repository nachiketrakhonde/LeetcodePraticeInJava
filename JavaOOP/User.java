

public class User {

    // 🔒 Fields are private (data hiding)
    private Long id;
    private String username;
    private String email;
    private String password;

    //  Public getter
    public Long getId() {
        return id;
    }

    //  Public setter with validation
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }


    public void setPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password too short");
        }
        this.password = password;
    }


}

