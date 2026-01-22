package com.apiuitest.shared.builders;

import com.apiuitest.shared.models.Address;
import com.apiuitest.shared.models.Company;
import com.apiuitest.shared.models.Geo;
import com.apiuitest.shared.models.User;

public class UserBuilder {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public UserBuilder() {}

    public UserBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public UserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder withAddress(Address address) {
        this.address = address;
        return this;
    }

    public UserBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder withWebsite(String website) {
        this.website = website;
        return this;
    }

    public UserBuilder withCompany(Company company) {
        this.company = company;
        return this;
    }

    public User build() {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setUsername(username);
        user.setEmail(email);
        user.setAddress(address);
        user.setPhone(phone);
        user.setWebsite(website);
        user.setCompany(company);
        return user;
    }

    public static UserBuilder defaultUser() {
        return new UserBuilder()
                .withId(1)
                .withName("John Doe")
                .withUsername("johndoe")
                .withEmail("john@example.com")
                .withAddress(new Address("123 Main St", "Apt 1", "Anytown", "12345", new Geo(0.0, 0.0)))
                .withPhone("123-456-7890")
                .withWebsite("www.example.com")
                .withCompany(new Company("Example Corp", "Making examples", "example business"));
    }
}