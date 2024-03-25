const CLIENTI = document.querySelector("#cliente");
const VIAGGI = document.querySelector("#viaggio");
const URL_CLIENTI = "http://localhost:9008/api/clienti";
const URL_VIAGGI = "http://localhost:9008/api/viaggi";

fetch(URL_VIAGGI)
    .then(res=>res.json())
    .then(viaggi=>{
        for (const viaggio of viaggi) {
           const OPTION = document.createElement("option");
           OPTION.textContent = viaggio.nomeViaggio;
           OPTION.value = viaggio.id;
           VIAGGI.append(OPTION);
        }
    })
fetch(URL_CLIENTI)
    .then(res=>res.json())
    .then(clienti=>{
        for (const cliente of clienti) {
           const OPTION = document.createElement("option");
           OPTION.textContent = cliente.nome + " " + cliente.cognome;
           OPTION.value = cliente.id;
           CLIENTI.append(OPTION);
        }
    })