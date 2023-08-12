<template>
  <div class="home">
    <img alt="AmarieParaMi logo" src="../assets/logo.png">
    <HelloWorld msg="Bienvenidos a nuestra tienda online"/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  components: {
    HelloWorld
  }
}
</script>
