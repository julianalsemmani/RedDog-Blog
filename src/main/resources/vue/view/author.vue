<template id="author">
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
      <section id="author">
        <img src="`${author.authorPictureUrl}`" alt="Person">
        <div class="info">
          <h2>Name: {{author.firstName + " " + author.lastName}}</h2>
          <h2>Age: {{author.age}}</h2>
          <h2>Total Written blog posts: {{author.totalPostsWritten}}</h2>
        </div>
      </section>
    </div>

    <footer>
      <p>Copyright &copy; RedDog Blog</p>
      <p><a href="https://github.com/julianalsemmani">Developed by Julian Alsemmani</a></p>
    </footer>

  </div>
</template>
<script>
Vue.component("author", {
  template: "#author",
  data: () => ({
    author: null,
    blogInformation: null,
  }),
  created() {
    const authorId = this.$javalin.pathParams["author-id"];
    fetch(`/api/author/${authorId}`)
        .then(res => res.json())
        .then(res => {
          this.author = res;
        })
        .catch(() => alert("Error getting author."));
    fetch("/api/blogInformation")
    .then(res => res.json())
    .then(res => {
      this.blogInformation = res;
    })
  }
});
</script>
