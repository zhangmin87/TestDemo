<%@ page import="framework.core.utils.CookieUtils" %>
<%
    boolean sidebarClosed = "closed".equals(CookieUtils.getCookieValue("AdminLTE.sidebar.state", request));
    /*session.setAttribute("sessionUser", session.getAttribute("session.user"));*/
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="/WEB-INF/jspi/minimal.jspi"%>
    <%@ include file="/WEB-INF/jspi/AdminLTE.jspi"%>
    <title><tiles:getAsString name="title" ignore="true"/></title>
    <script>
        $(document).ready(function () {
            var pgurl = window.location.href;
            // active：ul.sidebar-menu -> li -> a
            $("ul.sidebar-menu>li>a").each(function () {
                if ($(this).attr("href") != "#" && pgurl.indexOf($(this).attr("href").split("?")[0]) >= 0) {
                    $(this).parent().addClass("active");
                }
            });
            // active：ul.treeview-menu -> li -> a
            $("ul.treeview-menu>li>a").each(function () {
                if ($(this).attr("href") != "#" && pgurl.indexOf($(this).attr("href").split("?")[0]) >= 0) {
                    $(this).parent().addClass("active");
                    $(this).parent().parent().parent().addClass("active");
                }
            });
        });
    </script>
</head>
<body class="fixed skin-blue sidebar-mini <%=sidebarClosed?"sidebar-collapse":""%>">
<div class="wrapper">
    <tiles:insertAttribute name="header"/>

    <!-- Left side column. contains the sidebar -->
    <tiles:insertAttribute name="sidebar"/>

    <!-- =============================================== -->
    <!-- Content Wrapper. Contains page content -->
    <tiles:insertAttribute name="main"/>
    <!-- =============================================== -->

    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>
