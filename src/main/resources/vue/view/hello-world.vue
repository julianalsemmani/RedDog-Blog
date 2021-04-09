<template id="hello-world">
  <h1 class="hello-world">Hello from Vue.js</h1>
</template>
<script>
Vue.component("hello-world", {template: "#hello-world"});
</script>
<style>
.hello-world {
  color: black;
}
</style>