package com.apiuitest.api.tests;

import org.testng.annotations.Test;
import com.apiuitest.base.ApiBaseTest;
import com.apiuitest.data.TestDataProvider;
import com.apiuitest.models.Post;
import com.apiuitest.api.services.PostService;
import com.apiuitest.utils.ApiUtils;
import io.restassured.response.Response;

public class PostApiTest extends ApiBaseTest {
    private PostService postService = new PostService();

    @Test
    public void testGetAllPosts() {
        Response response = postService.getAllPosts();
        ApiUtils.validateStatusCode(response, 200);
        ApiUtils.validateResponseTime(response, 2000);
    }

    @Test
    public void testGetPostById() {
        Response response = postService.getPost(1);
        ApiUtils.validateStatusCode(response, 200);
    }

    @Test
    public void testCreatePost() {
        Post newPost = TestDataProvider.getDefaultPost();
        Response response = postService.createPost(newPost);
        ApiUtils.validateStatusCode(response, 201);
    }

    @Test
    public void testUpdatePost() {
        Post updatedPost = TestDataProvider.getDefaultPost();
        Response response = postService.updatePost(1, updatedPost);
        ApiUtils.validateStatusCode(response, 200);
    }

    @Test
    public void testDeletePost() {
        Response response = postService.deletePost(1);
        ApiUtils.validateStatusCode(response, 200);
    }
}