package model;

import java.time.LocalDate;
import java.util.Random;

public class BlogPost extends Author {
    private String articleTitle;
    private String articleLink;
    private String articleSummary;
    private String articleText;
    private String category;
    private Author author;
    private boolean published;


    public BlogPost(String firstName, String lastName, int age, String authorPictureUrl, String articleTitle, String articleSummary ,String articleText, String category, boolean published) {
        super(firstName, lastName, age, authorPictureUrl);
        this.articleTitle = articleTitle;
        this.articleSummary = articleSummary;
        this.articleText = articleText;
        this.category = category;
        this.published = published;
        this.articleLink = articleTitle.replaceAll(" ", "-");
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleLink() {
        return articleLink;
    }

    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
