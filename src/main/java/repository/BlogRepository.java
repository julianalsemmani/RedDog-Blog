package repository;

import model.Author;
import model.BlogInformation;
import model.BlogPost;

import java.time.LocalDate;
import java.util.ArrayList;

public interface BlogRepository {
    BlogPost getBlogPost(String title);
    ArrayList<BlogPost> getAllBlogPosts();
    Author getAuthor(String authorName);
    BlogPost createPost(String articleTitle, LocalDate publishDate, Author author, boolean published);
    BlogPost updatePost(String articleTitle, LocalDate publishDate, Author author, boolean published);
    BlogPost deletePost(String title);
}
