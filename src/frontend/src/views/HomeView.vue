<script setup>
import { onMounted, ref } from 'vue';
import WaterTable from '../components/WaterTable.vue'

const items = ref([]);

onMounted(async () => {
    const response = await fetch('http://localhost:8080/api/clients/getAll');

    items.value = await response.json();
});
</script>

<template>
    <main>
        <WaterTable :items="items" />
    </main>
</template>
