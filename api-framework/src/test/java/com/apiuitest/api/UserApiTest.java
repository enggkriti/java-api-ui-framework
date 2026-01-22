package com.apiuitest.api;

import org.testng.annotations.Test;
import com.apiuitest.base.ApiBaseTest;
import com.apiuitest.data.TestDataProvider;
import com.apiuitest.models.User;
import com.apiuitest.services.UserService;
import com.apiuitest.utils.ApiUtils;
import io.restassured.response.Response;

public class UserApiTest extends ApiBaseTest {
    private UserService userService = new UserService();

    @Test
    public void testGetAllUsers() {
        Response response = userService.getAllUsers();
        ApiUtils.validateStatusCode(response, 200);
        ApiUtils.validateResponseTime(response, 2000);
    }

    @Test
    public void testGetUserById() {
        Response response = userService.getUser(1);
        ApiUtils.validateStatusCode(response, 200);
    }

    @Test
    public void testCreateUser() {
        User newUser = TestDataProvider.getDefaultUser();
        Response response = userService.createUser(newUser);
        ApiUtils.validateStatusCode(response, 201);
    }

    @Test
    public void testUpdateUser() {
        User updatedUser = TestDataProvider.getDefaultUser();
        Response response = userService.updateUser(1, updatedUser);
        ApiUtils.validateStatusCode(response, 200);
    }

    @Test
    public void testDeleteUser() {
        Response response = userService.deleteUser(1);
        ApiUtils.validateStatusCode(response, 200);
    }
}