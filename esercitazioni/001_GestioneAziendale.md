# ESERCIZIO: GESTIONE AZIENDALE

## DESCRIZIONE GENERICA

Ho un'azienda in cui lavorano Impiegati.
Ogni Impiegato ha un proprio nome, cognome, id e stipendio.
Ho una Segreteria utilizzata per il calcolo degli ID degli impiegati.
Devo poter calcolare lo stipendio totale.

### SEGRETERIA

Definire una classe Segreteria che ci permette (dato un nome, un cognome ed un anno di nascita) di creare un ID
Questa classe ha un solo metodo statico.
In particolare il metodo:

* creaID (String n, String c, Int a)
che prende 2 stringhe ed un intero (in particolare saranno un nome, un
cognome e l'età) e ritorna una Stringa formata dalla concatenazione di: le prime
2 lettere di n, le prime 2 lettere di c, a (esempio: con l'input “paolo”, “rossi”, 1980 ritorna come risultato: paro1980).

### IMPIEGATO

La classe Impiegato ha

* attributi di tipo string: nome, cognome, id;
* attributi di tipo int: anno di nascita e stipendio;
* i relativi metodi getter e setter di tutti.
Il setter dell'attributo id però non prende in input il valore ma lo ottiene con il metodo creaID della classe Segreteria.

### AZIENDA

La classe Azienda conserva il riferimento a tutti gli impiegati e può calcolare lo stipendio totali di tutti essi.
Quindi ha come attributo:

* un ArrayList di Impiegati;
Ha come metodi:
* un metodo addImpiegato( ... ):
aggiunge un impiegato all'ArrayList;
* un metodo deleteImpiegato( ... ):
elimina un impiegato dall'ArrayList;
* un metodo stipendioTOT( ):
calcola lo stipendio totale come somma di tutti gli stipendi.

### MAIN

* Crea uno Scanner per prendere input da tastiera;
* Crea un oggetto azienda;
* Crea un tot di Impiegati chiedendo l'input da tastiera;
* Aggiunge man mano questi impiegati all'azienda;
* Calcola e stampa lo stipendio totale.
