package repository;

import model.Author;
import model.BlogInformation;
import model.BlogPost;

import java.time.LocalDate;
import java.util.ArrayList;

public class BlogDataRepository implements BlogRepository {
    ArrayList<BlogPost> allPosts = new ArrayList<>();
    ArrayList<Author> allAuthors = new ArrayList<>();

    public BlogDataRepository () {
        Author julianAlsemmani = new Author("Julian", "Alsemmani", 19, "https://kvener.no/wp-content/uploads/2019/02/blank-profile-picture-973460_640.png");
        BlogPost blogPost1 = new BlogPost(julianAlsemmani.getFirstName(), julianAlsemmani.getLastName(), julianAlsemmani.getAge(), julianAlsemmani.getAuthorPictureUrl(), "Blog Post 1", "Lorem Ipsum is simply dummy " +
                "text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, " ,"Lorem Ipsum is simply dummy " +
                "text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, " +
                "but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus " +
                "PageMaker including versions of Lorem Ipsum." +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus " +
                "PageMaker including versions of Lorem Ipsum.", "Fantasy",  true);

        BlogPost blogPost2 = new BlogPost(julianAlsemmani.getFirstName(), julianAlsemmani.getLastName(), julianAlsemmani.getAge(), julianAlsemmani.getAuthorPictureUrl(),"Blog Post 2", "Lorem Ipsum is simply dummy " +
                "text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, " ,"Lorem Ipsum is simply dummy " +
                "text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, " +
                "but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus " +
                "PageMaker including versions of Lorem Ipsum." +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus " +
                "PageMaker including versions of Lorem Ipsum.", "History", true);

        BlogPost blogPost3 = new BlogPost(julianAlsemmani.getFirstName(), julianAlsemmani.getLastName(), julianAlsemmani.getAge(), julianAlsemmani.getAuthorPictureUrl(),"Blog Post 3", "Lorem Ipsum is simply dummy " +
                "text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, " ,"Lorem Ipsum is simply dummy " +
                "text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, " +
                "but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus " +
                "PageMaker including versions of Lorem Ipsum." +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus " +
                "PageMaker including versions of Lorem Ipsum.", "Informative", true);

        julianAlsemmani.addNewPostToAuthor(blogPost1);
        julianAlsemmani.addNewPostToAuthor(blogPost2);
        julianAlsemmani.addNewPostToAuthor(blogPost3);
        allPosts.add(blogPost1);
        allPosts.add(blogPost2);
        allPosts.add(blogPost3);
        allAuthors.add(julianAlsemmani);
    }

    @Override
    public BlogPost getBlogPost(String title) {
        for (BlogPost blogPost : allPosts) {
            if (blogPost.getArticleTitle().equals(title)) {
                return blogPost;
            }
        }
        return null;
    }

    @Override
    public ArrayList<BlogPost> getAllBlogPosts() {
        return allPosts;
    }

    @Override
    public BlogPost createPost(String articleTitle, LocalDate publishDate, Author author, boolean published) {
        return null;
    }

    @Override
    public BlogPost updatePost(String articleTitle, LocalDate publishDate, Author author, boolean published) {
        return null;
    }

    @Override
    public BlogPost deletePost(String title) {
        return null;
    }

    @Override
    public Author getAuthor(String authorName) {
        for (Author author : allAuthors) {
            if ((author.getFirstName() + " " + author.getLastName()).equals(authorName)) {
                return author;
            }
        }
        return null;
    }
}
