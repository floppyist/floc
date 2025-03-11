<script setup>
import axios from 'axios';
import { onBeforeMount } from 'vue';

onBeforeMount(() => {
    axios.get('/api/clients/getAll')
        .then(res => {
            var table = document.getElementById("tblElectricity").getElementsByTagName('tbody')[0];
            console.log(table);

            if (res.data.length == 0) {
                table.hidden = true;
            } else {
                table.hidden = false;

                for (const element of res.data) {
                    var newRow = table.insertRow();
                    var newCell;
                    var newText;

                    newCell = newRow.insertCell(0);
                    newText = document.createTextNode(element.active);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(1);
                    newText = document.createTextNode(element.parcel);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(2);
                    newText = document.createTextNode(element.name);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(3);
                    newText = document.createTextNode(element.address);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(4);
                    newText = document.createTextNode(element.phone);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(5);
                    newText = document.createTextNode(element.waterlevel_old);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(6);
                    newText = document.createTextNode(element.waterlevel_new);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(7);
                    newText = document.createTextNode('');
                    newCell.appendChild(newText);
                }
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
        </tbody>
    </table>
    <div class="col text-center">
        <button class="btn btn-info fix" type="button" id="btnNewClient" data-bs-toggle="modal"
            data-bs-target="#newClientModal">
            Neuen Mandanten anlegen
        </button>
    </div>
</template>

<style scoped>
#btnNewClient {
    margin-bottom: 15px;
}
</style>
