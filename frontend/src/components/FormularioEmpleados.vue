<template>
  <div class="container">
    <h1>Formulario Empleados</h1>
    <form id="empleado-form" @submit.prevent="guardar">
      <div class="form-group">
        <label for="documento">Documento:</label>
        <input type="text" id="documento" name="documento" required  v-model="documento" />
      </div>
      <div class="form-group">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required v-model="nombre"/>
      </div>
      <div class="form-group">
        <label for="apellido">Apellido:</label>
        <input type="text" id="apellido" name="apellido" required v-model="apellido"/>
      </div>
      <div class="form-group">
        <label for="direccion">Dirección:</label>
        <input type="text" id="direccion" name="direccion" required v-model="direccion" />
      </div>
      <div class="form-group">
        <label for="telefono">Teléfono:</label>
        <input type="text" id="telefono" name="telefono" required v-model="telefono" />
      </div>

      <button type="button" id="actualizar" name="actualizar"  @click="actualizar"> Actualizar</button><br />
      <button type="button" id="eliminar" name="eliminar" @click="eliminar"> Eliminar</button ><br />
      <button type="button" id="consultar" name="consultar" @click="consultar"> Consultar</button><br />
      <button type="submit" id="guardar" name="guardar">Guardar</button><br />
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  
  data() {

    return {
      documento: "",
      nombre: "",
      apellido: "",
      direccion: "",
      telefono: ""
    };

  },

  methods: {
    guardar() {
      
      axios
        .post("http://localhost:8080/api/empleados", {
          documento: this.documento,
          nombre: this.nombre,
          apellido: this.apellido,
          direccion: this.direccion,
          telefono: this.telefono
        })
        .then((response) => {
          console.log("Empleado registrado con éxito:", response.data);
          alert("Empleado registrado con éxito");
          this.documento = '';
          this.nombre = '';
          this.apellido = '';
          this.direccion = '';
          this.telefono = '';
        })
        .catch((error) => {
          console.error("Error al registrar empleado:", error);
          alert("Error al registrar empleado");
        });
    },
    
    consultar() {
      
      axios
        .get('http://localhost:8080/api/empleados/'+this.documento)
        .then((response) => {
          // Actualizar los campos del formulario con los datos del estudiante consultado
          this.nombre = response.data.nombre;
          this.apellido = response.data.apellido;
          this.direccion = response.data.direccion;
          this.telefono = response.data.telefono;
        })
        .catch((error) => {
          console.error("Error al consultar empleado:", error);
          alert("Error al consultar empleado");
        });
    },


    actualizar() {
      
      axios
        .put("http://localhost:8080/api/empleados/actualizar/"+this.documento, {
          documento:this.documento,
          nombre: this.nombre,
          apellido: this.apellido,
          direccion: this.direccion,
          telefono: this.telefono,
        })
        .then((response) => {
          console.log("Empleado actualizado con éxito:", response.data);
          alert("Empleado actualizado con éxito");
        })
        .catch((error) => {
          console.error("Error al actualizar empleado:", error);
          alert("Error al actualizar empleado");
        });
    },
    
    eliminar() {
     
      axios
        .delete("http://localhost:8080/api/empleados/"+this.documento)
        .then(() => {
          console.log("Empleado eliminado con éxito");
          alert("Empleado eliminado con éxito");
          // Limpiar los campos del formulario después de eliminar
          this.documento = "";
          this.nombre = "";
          this.apellido = "";
          this.direccion = "";
          this.telefono = "";
        })
        .catch((error) => {
          console.error("Error al eliminar empleado:", error);
          alert("Error al eliminar empleado");
        });
    },
  },
};
</script>
