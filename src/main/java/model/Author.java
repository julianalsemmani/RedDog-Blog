package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Author {
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<BlogPost> blogPosts = new ArrayList<>();
    private int totalPostsWritten;
    private String authorPictureUrl;

    public Author(String firstName, String lastName, int age, String authorPictureUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.authorPictureUrl = authorPictureUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTotalPostsWritten() {
        return totalPostsWritten;
    }

    public void increaseBlogArticles() {
        this.totalPostsWritten++;
    }

    public void addNewPostToAuthor(BlogPost blogPost) {
        blogPosts.add(blogPost);
        increaseBlogArticles();
    }

    public String getAuthorPictureUrl() {
        return authorPictureUrl;
    }

    public void setAuthorPictureUrl(String authorPictureUrl) {
        this.authorPictureUrl = authorPictureUrl;
    }
}
