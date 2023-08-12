<template>
    <div class="container">
        <h1>Tabla Empleados</h1>
        <table>
            <thead>
                <tr>
                    <th>Documento</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Dirección</th>
                    <th>Teléfono</th>
                </tr>
            </thead>
            <tbody>
                    <tr v-for="empleado in empleados" :key="empleado.documento">
                    <td>{{ empleado.documento }}</td>
                    <td>{{ empleado.nombre }}</td>
                    <td>{{ empleado.apellido }}</td>
                    <td>{{ empleado.direccion }}</td>
                    <td>{{ empleado.telefono }}</td>
                </tr>                  
                <router-view />

            </tbody>
        </table>
    </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      empleados: [],
    };
  },
  methods: {
    obtenerEmpleados() {
      // Método para obtener la lista de todos los estudiantes
      axios.get("http://localhost:8080/api/empleados/listar")
      .then((response) => {
        this.empleados = response.data;
      })
      .catch((error) => {
        console.error("Error al obtener empleados:", error);
      });
    },
  },
  mounted() {
    // Llamar al método para obtener la lista de estudiantes al cargar el componente
    this.obtenerEmpleados();
  },
};
</script>
