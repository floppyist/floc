<script setup>
import axios from 'axios';
import { onBeforeMount } from 'vue';

onBeforeMount(() => {
    axios.get('/api/clients/getAll')
        .then(res => {
            var table = document.getElementById("tblElectricity");
            var btnNew = document.getElementById("btnNewClient");

            if (res.data.length == 0) {
                table.hidden = true;
                btnNew.hidden = false;
            } else {
                table.hidden = false;
                btnNew.hidden = true;
            }
        });
});
</script>

<template>
    <table class="table table-hover table-bordered" id="tblElectricity">
        <thead>
            <tr>
                <th scope="col" class="text-center">Aktiv</th>
                <th scope="col" class="text-center">Parzelle</th>
                <th scope="col">Name</th>
                <th scope="col">Addresse</th>
                <th scope="col">Telefon</th>
                <th scope="col">Alter Wasserstand</th>
                <th scope="col">Neuer Wasserstand</th>
                <th scope="col">Entstandene Kosten</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>
                    <input type="checkbox" value="">
                </td>
                <td class="text-center">1</td>
                <td>Max Mustermann</td>
                <td>Musterweg 3 09116 Musterstadt</td>
                <td>0001/00000001</td>
                <td>750,33 m³</td>
                <td>840,12 m³</td>
                <td>94,20€</td>
            </tr>
        </tbody>
    </table>
    <div class="row">
        <div class="col text-center">
            <button class="btn btn-info fix" type="button" id="btnNewClient" data-bs-toggle="modal"
                data-bs-target="#newClientModal">
                Neuen Mandanten anlegen
            </button>
        </div>
    </div>
</template>

<style scoped></style>
