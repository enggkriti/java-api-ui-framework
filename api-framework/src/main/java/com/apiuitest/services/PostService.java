package com.apiuitest.api.services;

import com.apiuitest.shared.models.Post;
import io.restassured.response.Response;
import java.util.List;

public class PostService extends BaseApiService {

    public Response getAllPosts() {
        return get("/posts");
    }

    public Response getPost(int id) {
        return get("/posts/" + id);
    }

    public Response createPost(Post post) {
        return post("/posts", post);
    }

    public Response updatePost(int id, Post post) {
        return put("/posts/" + id, post);
    }

    public Response deletePost(int id) {
        return delete("/posts/" + id);
    }
}