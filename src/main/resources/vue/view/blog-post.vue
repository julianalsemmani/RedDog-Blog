<template id="blog-post">
  <div>
    <title>RedDog Blog</title>
    <header>
      <h1 class="logo">RedDog Blog</h1>
      <nav class="navigation">
        <ul>
          <li><a class="current" href="/">Home</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </nav>
    </header>
    <section id="showcase">
      <h1>{{blogInformation.blogName}}</h1>
      <p>{{blogInformation.blogSlogan}}</p>
    </section>

    <div class="container">
      <section id="article">
        <article class="blog-article">
          <h2>{{spesificBlogPost.articleTitle}}</h2>
          <p>Written by: <a :href="`/author/${spesificBlogPost.firstName + ' ' + spesificBlogPost.lastName}`">{{spesificBlogPost.firstName + " " + spesificBlogPost.lastName}}</a></p>
          <br>
          <p>{{spesificBlogPost.articleText}}</p>
          <br>
          <p>Category: <b>{{spesificBlogPost.category}}</b></p>
          <br>
          <p><a class="readmore" href="/">Go Back to Blog</a></p>
        </article>
      </section>
    </div>

    <footer>
      <p>Copyright &copy; RedDog Blog</p>
      <p><a href="https://github.com/julianalsemmani">Developed by Julian Alsemmani</a></p>
    </footer>
  </div>
</template>
<script>
Vue.component("blog-post", {
  template: "#blog-post",
  data: () => ({
    spesificBlogPost: null,
    blogInformation: null,
  }),
  created() {
    const blogPostId = this.$javalin.pathParams["blogpost-id"];
    fetch(`/api/blogpost/${blogPostId}`)
        .then(res => res.json())
        .then(res => {
          this.spesificBlogPost = res;
        })
        .catch(() => alert("Error getting blog post."));
    fetch("/api/blogInformation")
        .then(res => res.json())
        .then(res => {
          this.blogInformation = res;
        })
  }
});
</script>
