<%-- 
    Document   : lijstSpelletjes
    Created on : 14-jan-2015, 14:23:45
    Author     : 11627
--%>

<%@page import="Services.SpelServices"%>
<%@page import="ViewModels.LijstSpelViewModel"%>
<%@page import="DAL.Spel"%>
<% LijstSpelViewModel vm = (LijstSpelViewModel) session.getAttribute("ViewModel"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spelletjes database</title>
    <link rel="stylesheet" href="CSS/stylesheet.css" type="text/css" />
</head>
<body>
    <div id="divContainer">
        <div id="divHeader"><h1>Spelletje Database</h1></div>
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
        <% for (Spel spel : vm.getSpelletjes()) {%>
        <div id="divContent_area">

            <img src="images/logoTuts.jpg" width="120" height="143" />
            <div id="divPlus"><a href="SpelNegatiefQuoterenController?id=<%=spel.getId()%>"> - </a></div>
            <div id="divMin"><a href="SpelPositiefQuoterenController?id=<%=spel.getId()%>"> + </a></div>
            <div id="divInteractie">
                <div id="divScheiding">
                    <p class="categorie"><%=spel.getCategory().getName() %></p>
                <p class="personen">Personen: <%= spel.getAantalPersonenVanaf() %> tot <%= spel.getAantalPersonenTot() %></p>
                </div>
                
                <p><a href="ViewCommentsController?id=<%=spel.getId()%>">View comments (</a><a href="ViewCommentsController?id=<%=spel.getId()%>"><%= SpelServices.getAantalComments(spel.getId())%>)</a></p>
                <p><a href="CommentToevoegenController?id=<%=spel.getId()%>">Voeg comment toe </a></p>
                <p><a href="SpelBewerkenController?id=<%= spel.getId()%>"> edit</a></p>
            </div>
                <div id="divCounter"><p><%=spel.getCounter() %></p></div>
            <div id="divData">
                <h5><%= spel.getTitel() %></h5>
                <p class="benodigdheden">Benodigdheden: <%=spel.getBenodigdheden() %></p>
                <p> <%= spel.getOmschrijvingSpel() %> </p>
            </div>

        </div>
        <% } %>
        <div id="divFooter"></div>
    </div>
</body>
</html>
