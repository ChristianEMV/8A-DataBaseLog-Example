<script setup>
</script>
<template>
  <div>
    <b-navbar variant="dark">
      <b-navbar-brand class="mx-auto">
        <b-img
          src="https://www.cinedot.com.mx/IT-CDN/Themes/_default/Images/color_logo.png"
          alt="Logo"
          width="250"
          height="auto"
        ></b-img>
      </b-navbar-brand>
      <b-icon icon="tools" style="color: white"></b-icon>
      <b-nav-item-dropdown text="Herramientas" style="color: white">
        <b-dropdown-item @click="goToInicio">
          <b-icon icon="house"></b-icon> Inicio
        </b-dropdown-item>
        <b-dropdown-item @click="goToOperaciones">
          <b-icon icon="card-list"></b-icon> Operaciones
        </b-dropdown-item>
        <b-dropdown-item href="#"
          ><b-icon icon="people"></b-icon> Empleados</b-dropdown-item
        >
      </b-nav-item-dropdown>
    </b-navbar>
    <b-container fluid>
      <router-view />
    </b-container>
    <br />
    <br />
    <b-footer
      class="bg-dark text-white text-center"
      style="position: fixed; left: 0; bottom: 0; width: 100%; font-size: 12px"
    >
      Todos los derechos reservados ©
    </b-footer>
  </div>
</template>

<script>
export default {
  methods: {
    goToOperaciones() {
      this.$router.push("/operaciones");
    },
    goToInicio(){
      this.$router.push("/")
    }
  },
};
</script>

<style scoped>
.navbarstyle {
  background-color: #e83e8c;
  color: #ffff;
  font-size: 30px;
}
.tools {
  color: #ffff;
}
</style>