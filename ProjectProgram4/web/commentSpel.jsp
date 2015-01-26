<%-- 
    Document   : commentSpel
    Created on : 14-jan-2015, 14:23:15
    Author     : 11627
--%>

<%@page import="Services.SpelServices"%>
<%@page import="DAL.Spel"%>
<% Spel vm = (Spel) session.getAttribute("ViewModel");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CSS/commentCss.css" type="text/css"/>
    </head>
    <body>
        <div id="divContainer">
            <div id="divHeader"><h1>Geef uw mening</h1></div>
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
                <form class="form-horizontal" action="CommentToevoegenController" role="form">
                    <input type="hidden" name="id" value="<%=vm.getId()%>">
                    <input type="hidden" name="edit" value="true">
                    <div id="divData">
                        <h2><%= vm.getTitel()%></h2>
                        <div>
                            <p class="body"><%= vm.getOmschrijvingSpel()%></p>
                        </div>
                        <p><a href="ViewCommentsController?id=<%= vm.getId()%> ">View comments</a></p>
                    </div>

                    <div class="reactie">
                        <label class="titelReactie">Geef uw reactie</label>
                               <input value="" type="text" name="comment" class="textarea" id="comment">
                               <label class="usernameLabel">Username: </label>
                            <input value="" type="text" name="username" class="username" id="username">
                            <br/>
                            <button type="submit" class="button">opslaan</button>
                    </div>
                </form>  
            </div>
            <div id="divFooter"></div>
        </div>
    </body>
</html>
