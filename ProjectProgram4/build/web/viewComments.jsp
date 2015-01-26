<%-- 
    Document   : viewComments
    Created on : 14-jan-2015, 15:41:20
    Author     : 11627
--%>

<%@page import="DAL.Spel"%>
<%@page import="ViewModels.LijstCommentsViewModel"%>
<%@page import="Services.SpelServices"%>
<%@page import="DAL.Comment"%>
<% LijstCommentsViewModel vm = (LijstCommentsViewModel) session.getAttribute("ViewModel");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/viewComments.css" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <div id="divContainer">
            <div id="divHeader"><h1>View comments <%= SpelServices.getSpelComment(vm.getComments())%></h1></div>
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
            <% for (Comment comment : vm.getComments()) {%>
            <div id="divContent_area">
                <div id="divData">
                    <div id="username>"<p>User: <%=comment.getUsername()%></p></div>
                    <div id="datum>"<p>Datum: <%=comment.getDatum()%></p></div>
                    <div id="comment>"<p><%=comment.getComment()%></p></div>
                    <div id="reactieVerwijderen">
                    <a href="ReactieVerwijderenController?id=<%=comment.getId()%>">Ongepaste Reactie</a> 
                    </div>
                </div>
            </div>
            <% }%>
            <div id="divFooter"></div>
        </div>
    </body>
</html>
