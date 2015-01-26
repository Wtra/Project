<%-- 
    Document   : nieuwSpel
    Created on : 14-jan-2015, 14:23:57
    Author     : 11627
--%>

<%@page import="DAL.Category"%>
<%@page import="Services.SpelServices"%>
<script type="text/javascript" src="jquery-1.2.6.min.js"></script>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/newSpel.css" type="text/css"/>
        <title>Nieuw Spel</title>
    </head>
    <body>
        <div id="divContainer">
            <div id="divHeader"><h1>Nieuw spel toevoegen</h1></div>
            <div id="divLine"></div>
            <div id="divLinks">
                <div id="divNav">
                    <ul>
                        <li><a href="ToonLijstController">Index</a></li>
                        <li><a href="populairSpelController">Populair</a></li>
                        <li><a href="nieuwSpel.jsp">Nieuw</a></li>
                        <li><a href="contact.html">Contact</a></li>
                    </ul>
                </div>
            </div>
            <div id="divContent_area">
                <form name="nieuwSpel" action="NieuwSpelController" role="form"  method="post">
                    <div id="divData">
                        <div>
                            <label for="titel">Titel spel</label>
                            <div>
                                <input type="text" name="titel" id="titel" placeholder="titel">
                            </div>
                        </div>
                        <div>
                            <label for="aantalPersonenVanaf">Minimum aantal personen</label>
                            <div>
                                <input type="text" name="aantalPersonenVanaf" id="aantalPersonenVanaf" placeholder="aantalPersonenVanaf">
                            </div>
                        </div>
                        <div>
                            <label for="aantalPersonenTot">Maximum aantal personen</label>
                            <div>
                                <input type="text" name="aantalPersonenTot" id="aantalPersonenTot" placeholder="aantalPersonenTot">
                            </div>
                        </div>
                        <div>
                            <label for="omschrijvingSpel">Geef omschrijving spel</label>
                            <div>
                                <input type="text" name="omschrijvingSpel" id="omschrijvingSpel" placeholder="omschrijvingSpel">
                            </div>
                        </div>
                        <div>
                            <label for="benodigdheden">benodigdheden</label>
                            <div>
                                <input type="text" name="benodigdheden"  id="benodigdheden" placeholder="benodigdheden">
                            </div>
                        </div>

                        <div>
                            <label for="categorie">categorie</label>
                            <div>
                                <select name="categorie-id" id="categorie-id">
                                    <%
                                        for (Category categorie : SpelServices.getAllCategories()) {%>
                                    <option value="<%= categorie.getId()%>"><%=categorie.getName()%></option>
                                    <% }%>
                                </select>
                            </div>
                        </div>

                        <div>
                            <div>
                                <button type="submit">opslaan</button>
                            </div>
                        </div>
                    </div>
            </div>
            <div id="divFooter"></div>
        </div>
    </form>
</body>
</html>
