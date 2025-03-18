<script setup>
defineProps({
    items: {
        type: Array,
        required: true
    }
})
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
                <th scope="col"></th>
            </tr>
        </thead>
        <tbody>
            <tr v-for="item in items" :key="item.id">
                <td>{{ item.active }}</td>
                <td>{{ item.parcel }}</td>
                <td>{{ item.name }}</td>
                <td>{{ item.address }}</td>
                <td>{{ item.phone }}</td>
                <td>{{ item.waterlevel_old }}</td>
                <td>{{ item.waterlevel_new }}</td>
                <td>PLACEHOLDER</td>
                <td>
                    <a href="#">Bearbeiten</a>
                </td>
            </tr>
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
