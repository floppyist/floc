<script setup>
import axios from 'axios';
import { onBeforeMount } from 'vue';

onBeforeMount(() => {
    axios.get('/api/clients/getAll')
        .then(res => {
            var table = document.getElementById("tblElectricity").getElementsByTagName('tbody')[0];

            if (res.data.length == 0) {
                table.hidden = true;
            } else {
                table.hidden = false;

                for (var i = 1; i < res.data.length; i++) {
                    var newRow = table.insertRow();
                    var newCell;
                    var newText;
                    var newElement;

                    console.log(res.data[i].id);

                    newCell = newRow.insertCell(0);
                    newText = document.createTextNode(res.data[i].active);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(1);
                    newText = document.createTextNode(res.data[i].parcel);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(2);
                    newText = document.createTextNode(res.data[i].name);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(3);
                    newText = document.createTextNode(res.data[i].address);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(4);
                    newText = document.createTextNode(res.data[i].phone);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(5);
                    newText = document.createTextNode(res.data[i].waterlevel_old);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(6);
                    newText = document.createTextNode(res.data[i].waterlevel_new);
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(7);
                    newText = document.createTextNode('');
                    newCell.appendChild(newText);

                    newCell = newRow.insertCell(8);
                    newElement = document.createElement('button');
                    newElement.setAttribute('type', 'button');
                    newElement.setAttribute('class', 'btn btn-success');
                    newElement.innerHTML = 'Bearbeiten';
                    newCell.appendChild(newElement);

                    newElement = document.createElement('span');
                    newCell.appendChild(newElement);

                    newElement = document.createElement('button');
                    newElement.setAttribute('type', 'button');
                    newElement.setAttribute('class', 'btn btn-danger');
                    newElement.innerHTML = 'Löschen';
                    newCell.appendChild(newElement);

                    console.log(`${i}`);
                }
            }
        });
});

function deleteClient(id) {
    console.log('Client with ID ' + id + ' will be deleted.');


    axios.delete('/api/clients/delete/' + id)
        .then((response) => {
            console.log(response);
        })
        .catch((error) => {
            console.log(error);
        })
}
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
