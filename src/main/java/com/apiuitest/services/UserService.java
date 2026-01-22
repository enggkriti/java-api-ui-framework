package com.apiuitest.services;

import com.apiuitest.models.User;
import io.restassured.response.Response;

public class UserService extends BaseApiService {

    public Response getAllUsers() {
        return get("/users");
    }

    public Response getUser(int id) {
        return get("/users/" + id);
    }

    public Response createUser(User user) {
        return post("/users", user);
    }

    public Response updateUser(int id, User user) {
        return put("/users/" + id, user);
    }

    public Response deleteUser(int id) {
        return delete("/users/" + id);
    }
}