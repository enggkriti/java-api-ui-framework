package com.apiuitest.shared.data;

import com.apiuitest.shared.builders.PostBuilder;
import com.apiuitest.shared.builders.UserBuilder;
import com.apiuitest.shared.models.Post;
import com.apiuitest.shared.models.User;

public class TestDataProvider {

    public static User getDefaultUser() {
        return UserBuilder.defaultUser().build();
    }

    public static User getUserWithId(int id) {
        return UserBuilder.defaultUser().withId(id).build();
    }

    public static Post getDefaultPost() {
        return new PostBuilder()
                .withUserId(1)
                .withId(1)
                .withTitle("Test Post")
                .withBody("This is a test post body")
                .build();
    }

    public static Post getPostWithUserId(int userId) {
        return new PostBuilder()
                .withUserId(userId)
                .withTitle("Test Post for User " + userId)
                .withBody("Post body for user " + userId)
                .build();
    }
}