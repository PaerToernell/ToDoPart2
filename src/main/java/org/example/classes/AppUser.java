package org.example.classes;

import java.util.Objects;

public class AppUser {
    public enum AppRole  {
        ROLE_APP_USER,
        ROLE_APP_ADMIN,
        LOW
    }

    // Fields
    private String username;
    private String password;
    AppRole role;

    //Overrides
    public String toString(){
        return "Username: "+getUsername()+" Role: "+getRole();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(getUsername(), appUser.getUsername()) && Objects.equals(getPassword(), appUser.getPassword()) && getRole() == appUser.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword(), getRole());
    }


    public AppUser(String  username, String password, AppRole role){
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    //Getters Setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }





}
