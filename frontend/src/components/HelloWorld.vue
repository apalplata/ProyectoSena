<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p>
      Aquí encontrarás productos personalizados, hechos a mano con amor 💜<br>
    </p>
    <h3>Categorías</h3>
    <ul>
      <li><a href="https://www.instagram.com/p/CNaiU41ABVQ/" target="_blank" rel="noopener">Cobijas</a></li>
      <li><a href="https://www.instagram.com/p/CNidkVkA106/" target="_blank" rel="noopener">Bolsos</a></li>
      <li><a href="https://www.instagram.com/p/CQ6_3FLAMm3/?img_index=1" target="_blank" rel="noopener">Agendas</a></li>
    </ul>
    <h3>Encuéntranos en Redes Sociales</h3>
    <ul>
      <li><a href="https://www.facebook.com/amarieparami" target="_blank" rel="noopener">Facebook</a></li>
      <li><a href="https://www.instagram.com/apalplata/" target="_blank" rel="noopener">Instagram</a></li>
      <li><a href="https://www.canva.com/design/DAEgQQtZRs0/rXx-TbR36pN9BnPwrbwAVg/view" target="_blank" rel="noopener">Catálogo en línea</a></li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #43888e;
}

a:hover {
  color: #fac8be;
  font-weight: bold;
}
</style>
