<%-- 
    Document   : editSpel
    Created on : 14-jan-2015, 14:23:22
    Author     : 11627
--%>

<%@page import="DAL.Category"%>
<%@page import="Services.SpelServices"%>
<%@page import="DAL.Spel"%>
<% Spel vm = (Spel) session.getAttribute("ViewModel");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/editSpel.css" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <div id="divContainer">
            <div id="divHeader"><h1>Bewerk het spel "<%= vm.getTitel()%>"</h1></div>
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
            <div id="divLine"></div>
            <div id="divContent_area">
                <div id="divData">
                    <form action="SpelBewerkenController" role="form">
                        <input type="hidden" name="edit" value="true">
                        <input type="hidden" name="id" value="<%= vm.getId()%>">
                        <input type="hidden" name="counter" value="<%= vm.getCounter()%>">
                        <div class="form-group">
                            <label for="Model" class="col-sm-2 control-label">Titel</label>
                            <div class="col-sm-10">
                                <input value="<%= vm.getTitel()%>" type="text" name="titel" class="form-control" id="titel" placeholder="titel">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="aantalPersonenVanaf" class="col-sm-2 control-label">Aantal personen vanaf</label>
                            <div class="col-sm-10">
                                <input value="<%= vm.getAantalPersonenVanaf()%>" type="text" name="aantalPersonenVanaf" class="form-control" id="aantalPersonenVanaf" placeholder="aantalPersonenVanaf">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="aantalPersonenTot" class="col-sm-2 control-label">Aantal personen tot</label>
                            <div class="col-sm-10">
                                <input value="<%= vm.getAantalPersonenTot()%>" type="text" name="aantalPersonenTot" class="form-control" id="aantalPersonenTot" placeholder="aantalPersonenTot">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="omschrijvingSpel" class="col-sm-2 control-label">omschrijvingSpel</label>
                            <div class="col-sm-10">
                                <input value="<%= vm.getOmschrijvingSpel()%>" type="text" name="omschrijvingSpel" class="form-control" id="omschrijvingSpel" placeholder="omschrijvingSpel">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="benodigdheden" class="col-sm-2 control-label">benodigdheden</label>
                            <div class="col-sm-10">
                                <input value="<%= vm.getBenodigdheden()%>" type="text" name="benodigdheden" class="form-control" id="benodigdheden" placeholder="benodigdheden">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="categorie" class="col-sm-2 control-label">categorie</label>
                            <div class="col-sm-10">
                                <select name="categorie-id" id="categorie-id" selectedindex="<%=vm.getCategory().getName()%>">
                                    <%
                                        for (Category categorie : SpelServices.getAllCategories()) {%>
                                    <option value="<%= categorie.getId()%>"><%=categorie.getName()%></option>
                                    <% }%>
                                </select>
                            </div>
                        </div>
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">opslaan</button>
                        </div>
                    </form>         
                </div>
            </div>
            <div id="divFooter"></div>
        </div>
    </body>
</html>
