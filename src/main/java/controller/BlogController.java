package controller;

import io.javalin.http.Context;
import model.BlogInformation;
import model.BlogPost;
import repository.BlogRepository;

import java.util.ArrayList;

public class BlogController {
    private BlogRepository blogRepository;

    public BlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    public void getAllBlogPosts(Context ctx) {
        ArrayList<BlogPost> allPosts = blogRepository.getAllBlogPosts();

        ctx.json(allPosts);
    }

    public void getSpesificBlogPost(Context ctx) {
        String blogPostId = ctx.pathParam(":blogpost-id");

        //String originalBlogPostId = blogPostId.replaceAll("-", "\\s");

        BlogPost spesificBlogPost = blogRepository.getBlogPost(blogPostId);

        ctx.json(spesificBlogPost);
    }
}
