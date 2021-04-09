import repository.BlogDataRepository;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is testing main.");

        BlogDataRepository blogDataRepository = new BlogDataRepository();

        System.out.println(blogDataRepository.getBlogPost("Blog Post 1"));

        System.out.println(blogDataRepository.getAuthor("Julian Alsemmani"));
    }
}
