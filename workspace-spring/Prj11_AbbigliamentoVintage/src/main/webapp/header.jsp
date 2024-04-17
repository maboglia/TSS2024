<!doctype html>
<html lang="en">

<head>
    <title>
        <%= request.getAttribute("titolo")%>
    </title>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

    <!-- Bootstrap CSS v5.2.1 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous" />
</head>

<body>
    <header>
        <nav class="navbar navbar-expand-sm navbar-primary" style="
                background-color: $ {
                    3: #e3f2fd;
                }
            ">
            <a class="navbar-brand" href="#">Zarra</a>
            <button class="navbar-toggler d-lg-none" type="button" data-bs-toggle="collapse"
                data-bs-target="#collapsibleNavId" aria-controls="collapsibleNavId" aria-expanded="false"
                aria-label="Toggle navigation"></button>
            <div class="collapse navbar-collapse" id="collapsibleNavId">
                <ul class="navbar-nav me-auto mt-2 mt-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" href="?" aria-current="page">Home <span
                                class="visually-hidden">(current)</span></a>
                    </li>
                    <li class="nav-item">
					<% if (session.getAttribute("logged")!=null && session.getAttribute("logged").equals("test")){ %>						
                        <a class="nav-link" href="login">Logout</a>
                    <% } %>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="dropdownId" data-bs-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">Abbigliamento</a>
                        <div class="dropdown-menu" aria-labelledby="dropdownId">
                            <a class="dropdown-item" href="?page=maglie">Maglie</a>
                            <a class="dropdown-item" href="?page=pantaloni">Pantaloni</a>
                        </div>
                    </li>
                </ul>
                <form class="d-flex my-2 my-lg-0">
                    <input class="form-control me-sm-2" type="text" placeholder="Search" />
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">
                        Search
                    </button>
                </form>
            </div>
        </nav>

    </header>