import Vue from 'vue'
import VueRouter from 'vue-router'
import ListMovies from '../modules/movies/views/ListMovies.vue'
import Operaciones from '../modules/movies/views/Operaciones.vue'

Vue.use(VueRouter)

const router = new VueRouter({
  mode: 'history',
  base: import.meta.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'listMovies',
      component: ListMovies
    },
    {
      path: '/operaciones',
      name: 'operaciones',
      component: Operaciones
    }
  ]
})

export default router
