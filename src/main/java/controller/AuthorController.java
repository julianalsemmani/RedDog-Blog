package controller;

import io.javalin.http.Context;
import model.Author;
import repository.BlogRepository;

public class AuthorController {
    private BlogRepository blogRepository;

    public AuthorController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    public void getAuthor(Context ctx) {
        String authorId = ctx.pathParam(":author-id");

        Author author = blogRepository.getAuthor(authorId);

        ctx.json(author);
    }


}
