<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">
            <img src="/favicon.png" width="30" height="30" alt="">
            Floc 0.1a
        </a>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <RouterLink class="nav-link" to="/">Wasser</RouterLink>
                </li>
                <li class="nav-item">
                    <RouterLink class="nav-link" to="/electricity">Strom</RouterLink>
                </li>
            </ul>
        </div>
    </nav>

    <RouterView />
</template>

<style scoped></style>
