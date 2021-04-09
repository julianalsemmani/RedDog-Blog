import controller.AuthorController;
import controller.BlogController;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.plugin.rendering.vue.VueComponent;
import model.BlogInformation;
import org.jetbrains.annotations.NotNull;
import repository.BlogDataRepository;

public class Application {
    public static void main(String[] args) {
        BlogInformation blogInformation = new BlogInformation("Julian's Blogg", "Utvikler Bloggen på sitt beste!");
        Javalin app = Javalin.create().start();

        app.config.enableWebjars();

        app.get("/first-page", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                ctx.result("Version 0.0.1 of RedDog Blog. Built with Javalin and Vue.js by Julian Alsemmani");
            }
        });

        BlogDataRepository blogDataRepository = new BlogDataRepository();
        BlogController blogController = new BlogController(blogDataRepository);
        AuthorController authorController = new AuthorController(blogDataRepository);

        app.get("/", new VueComponent("index"));
        app.get("/blogpost/:blogpost-id", new VueComponent("blog-post"));
        app.get("/author/:author-id", new VueComponent("author"));

        app.error(404, ctx -> {
            ctx.result("Cannot find the page you're looking for.");
        });

        app.get("/api/blogInformation", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                ctx.json(blogInformation);
            }
        });


        app.get("/api", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                blogController.getAllBlogPosts(ctx);
            }
        });

        app.get("/api/blogpost/:blogpost-id", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                blogController.getSpesificBlogPost(ctx);
            }
        });

        app.get("/api/author/:author-id", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                authorController.getAuthor(ctx);
            }
        });

    }
}
