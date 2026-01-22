package com.apiuitest.builders;

import com.apiuitest.models.Post;

public class PostBuilder {
    private int userId;
    private int id;
    private String title;
    private String body;

    public PostBuilder() {}

    public PostBuilder withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public PostBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public PostBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public PostBuilder withBody(String body) {
        this.body = body;
        return this;
    }

    public Post build() {
        Post post = new Post();
        post.setUserId(userId);
        post.setId(id);
        post.setTitle(title);
        post.setBody(body);
        return post;
    }
}