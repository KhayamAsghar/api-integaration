package net.simplifiedcoding.retrofitandroidtutorial.models;

public class User {

    private int id,role;
    private String email, name,email_verified_at;
    private String created_at,updated_at;

    public User(int id, int role, String email, String name, String email_verified_at, String created_at, String updated_at) {
        this.id = id;
        this.role = role;
        this.email = email;
        this.name = name;
        this.email_verified_at = email_verified_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public int getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getEmail_verified_at() {
        return email_verified_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}
