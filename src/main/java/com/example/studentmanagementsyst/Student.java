package com.example.studentmanagementsyst;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private String presence;

    public Student(String firstName, String lastName, String id, String presence) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.presence = presence;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }
    @Override
    public String toString() {
        return String.format("%s %s (ID: %s) - %s", firstName, lastName, id, presence);
    }
}
