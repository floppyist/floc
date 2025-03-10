<script setup>
import { RouterLink, RouterView } from 'vue-router'

function btnFixedCostsSave() {
    console.log('Pressed [Speichern]');
}

function btnNewClient() {
    var inputActive = document.getElementById('inputClientActive');
    var inputParcel = document.getElementById('inputClientParcel');
    var inputName = document.getElementById('inputClientName');
    var inputPhone = document.getElementById('inputClientPhone');
    var inputWaterlevelOld = document.getElementById('inputClientWaterlevelOld');
    var inputWaterlevelNew = document.getElementById('inputClientWaterlevelNew');

    console.log(inputActive.value);
    console.log(inputParcel.value);
    console.log(inputName.value);
    console.log(inputPhone.value);
    console.log(inputWaterlevelOld.value);
    console.log(inputWaterlevelNew.value);
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

    <div class="modal fade" id="fixedCostsModal" tabindex="-1" aria-hidden="true">
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
                    <button @click="btnFixedCostsSave()" type="button" class="btn btn-info">Speichern</button>
                </div>
            </div>
        </div>
    </div>

    <div class="modal fade" id="newClientModal" tbindex="-1" data-bs-target="#newClientModal">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="inputClientActive">Aktiv:</label>
                        <select class="form-control" id="inputClientActive">
                            <option>Ja</option>
                            <option>Nein</option>
                        </select>

                        <br>
                        <label for="inputClientParcel">Parzelle:</label>
                        <input type="text" class="form-control" id="inputClientParcel">

                        <br>
                        <label for="inputClientName">Name:</label>
                        <input type="text" class="form-control" id="inputClientName">

                        <br>
                        <label for="inputClientAddress">Adresse:</label>
                        <input type="text" class="form-control" id="inputClientAddress">

                        <br>
                        <label for="inputClientPhone">Telefon (optional):</label>
                        <input type="text" class="form-control" id="inputClientPhone">

                        <br>
                        <label for="inputClientWaterlevelOld">Wasserstand (alt):</label>
                        <input type="text" class="form-control" id="inputClientWaterlevelOld"></input>

                        <br>
                        <label for="inputClientWaterlevelNew">Wasserstand (alt):</label>
                        <input type="text" class="form-control" id="inputClientWaterlevelNew"></input>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Schließen</button>
                    <button @click="btnNewClient()" type="button" class="btn btn-info">Anlegen</button>
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
