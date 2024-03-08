<template>
    <div>
      <h1>Operaciones <b-icon icon="book"></b-icon></h1>
      <br/>
      <b-card class="shadow">
        <b-table :items="logs" striped hover>
          <template #thead="{ fields }">
            <tr>
              <th v-for="field in fields" :key="field.key">{{ field.label }}</th>
            </tr>
          </template>
          <template #tbody="{ items }">
            <tr v-for="log in items" :key="log.id">
              <td>{{ log.id }}</td>
              <td>{{ log.tabla }}</td>
              <td>{{ log.operacion }}</td>
              <td>{{ log.descripcion }}</td>
            </tr>
          </template>
        </b-table>
      </b-card>
      <loading :active.sync="isLoading" :can-cancel="false" :is-full-page="fullPage"></loading>
    </div>
  </template>

<style>
.shadow {
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}
</style>
  
  <script>
  import MovieService from "../services/MovieService";
  import Loading from "vue-loading-overlay";

  
  export default {
    components:{
      Loading
    },
    data() {
      return {
        logs: [],
        showModal: false,
        isLoading: false,
      };
    },
    created() {
      this.fetchLogs();
    },
    methods: {

      async fetchLogs() {
        this.isLoading = true;
        try {
          this.logs = await MovieService.fetchLogs();
        } catch (error) {
          console.error("Error al obtener los logs:", error);
        }finally{
          this.isLoading = false;
        }
      },
    },
  };
  </script>