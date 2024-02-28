<%@ include file="header.jsp" %>

        <h1>I miei film</h1>

        <input class="form-control" type="number" name="dal" id="dal" placeholder="dal">
        <input class="form-control" type="number" name="al" id="al" placeholder="al">
        <button class="btn btn-primary" id="cerca">Cerca per anno</button>
        <button class="btn btn-danger" id="tutti">Trova tutti</button>

        <table class="table table-striped">
            <thead>

                <tr>
                    <th>Title</th>
                    <th>Rating</th>
                    <th>Anno</th>
                </tr>
            </thead>
            <tbody>

            </tbody>
        </table>


    </div>

    <script>

        const URL = 'http://localhost:8080/FilmIMDB/api/all';
        const URL_GOOGLE = 'https://www.google.com/search?q='
        const TABELLA = document.querySelector('tbody');
        const CERCA = document.getElementById('cerca')
        const TUTTI = document.getElementById('tutti')
        const DAL = document.getElementById('dal')
        const AL = document.getElementById('al')


        CERCA.addEventListener('click', function () {
            fetch(URL + '?dal=' + DAL.value + '&' + 'al=' + AL.value)
                .then(res => res.json())
                .then(res => {
                    TABELLA.innerHTML = '';
                    DAL.value = ''
                    for (const film of res) {
                        const TR = document.createElement('tr')
                        const TD1 = document.createElement('td')
                        const LINK = document.createElement('a')
                        LINK.setAttribute('href', URL_GOOGLE + film.titolo)
                        LINK.setAttribute('target', '_blank')
                        LINK.textContent = film.titolo;
                        TD1.appendChild(LINK)

                        const TD2 = document.createElement('td')
                        TD2.textContent = film.rating;
                        const TD3 = document.createElement('td')
                        TD3.textContent = film.anno;

                        TR.append(TD1, TD2, TD3);
                        TABELLA.append(TR)


                    }
                })

        })

        TUTTI.onclick = function () {
            TABELLA.innerHTML = '';
            fetch(URL)
                .then(res => res.json())
                .then(res => {

                    for (const film of res) {
                        const TR = document.createElement('tr')
                        const TD1 = document.createElement('td')
                        TD1.textContent = film.titolo;
                        const TD2 = document.createElement('td')
                        TD2.textContent = film.rating;
                        const TD3 = document.createElement('td')
                        TD3.textContent = film.anno;

                        TR.append(TD1, TD2, TD3);
                        TABELLA.append(TR)


                    }




                })


        }





    </script>




<%@ include file="footer.jsp" %>