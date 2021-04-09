package model;

public class BlogInformation {
    private String blogName;
    private String blogSlogan;

    public BlogInformation(String blogName, String blogSlogan) {
        this.blogName = blogName;
        this.blogSlogan = blogSlogan;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogSlogan() {
        return blogSlogan;
    }

    public void setBlogSlogan(String blogSlogan) {
        this.blogSlogan = blogSlogan;
    }
}
