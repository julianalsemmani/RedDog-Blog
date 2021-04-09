<template id="index">
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
        <article v-for="post in blogPost" class="blog-article">
          <h2>{{post.articleTitle}}</h2>
          <p>Written by <a :href="`/author/${post.firstName + ' ' + post.lastName}`">{{post.firstName + " " + post.lastName}}</a></p>
          <br>
          <p>{{post.articleSummary}}</p>
          <br>
          <p>This is a summary of {{post.articleTitle}}'s text. Click the button below to read more.
            <a class="readmore" :href="`/blogpost/${post.articleTitle}`">Read More..</a></p>
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
Vue.component("index", {
  template: "#index",
  data: () => ({
    blogPost: [],
    blogInformation: null,
  }),
  created() {
    fetch("/api")
    .then(res => res.json())
    .then(res => {
      this.blogPost = res.reverse();
      console.log(res)
    })
    .catch(() => alert(this.blogPost));
    fetch("/api/blogInformation")
    .then(res => res.json())
    .then(res => {
      this.blogInformation = res;
    })
  }
  });
</script>
