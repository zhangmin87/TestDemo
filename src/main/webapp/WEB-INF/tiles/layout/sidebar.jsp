<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Left side column. contains the sidebar -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <%-- TODO 渲染用户面板 --%>
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="http://dev.infoccsp.com/staticNG/local/images/default_avatar.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>${sessionUser.username}</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <%-- TODO 渲染Sidebar Menu --%>
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">MAIN NAVIGATION</li>
            <li class="treeview">
                <a href="${ctx}">
                    <i class="fa fa-home"></i> <span>Home</span>
                </a>
            </li>
            <c:forEach items="${sessionScope.categories}" var="category">
                <li class="treeview">
                    <a href="#">
                        <i class="fa ${category.categoryIcon}"></i>
                        <span>${category.categoryName}</span>
                    <span class="pull-right-container">
                      <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">
                        <c:forEach items="${category.menus}" var="menu">
                            <li>
                                <a href="${menu.menuUrl}"><i class="fa fa-circle-o"></i> ${menu.menuName}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </li>
            </c:forEach>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>