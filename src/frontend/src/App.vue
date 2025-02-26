<script setup>
import { RouterLink, RouterView } from 'vue-router'

function test() {
    console.log('Pressed [Speichern]');
}
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
            <ul class="navbar-nav ms-auto">
                <button class="btn btn-info fix" type="button" data-bs-toggle="modal" data-bs-target="#fixedCostsModal">
                    Fixkosten
                </button>
            </ul>
        </div>
    </nav>

    <div class="modal fade" id="fixedCostsModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="inputAccountCosts">Kontokosten / Jahr:</label>
                        <input type="text" class="form-control" id="inputAccountCosts">

                        <br>
                        <label for="inputWaterPrice">Wasserpreis pro m³:</label>
                        <input type="text" class="form-control" id="inputWaterPrice">

                        <br>
                        <label for="inputAccountCosts">Grundgebühr:</label>
                        <input type="text" class="form-control" id="inputBasicFee">

                        <br>
                        <label for="inputAccountCosts">Portokosten:</label>
                        <input type="text" class="form-control" id="inputPortoCosts">
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Schließen</button>
                    <button @click="test()" type="button" class="btn btn-info">Speichern</button>
                </div>
            </div>
        </div>
    </div>

    <RouterView />
</template>

<style scoped>
.navbar-brand {
    margin-left: 8px;
}

.fix {
    margin-right: 8px;
}
</style>
