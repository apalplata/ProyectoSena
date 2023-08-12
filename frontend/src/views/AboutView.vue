<template>
  <div class="acercade">
    <img alt="Imagen Contacto" src="../assets/hola.jpg" width="1200">
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