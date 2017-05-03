<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            签名校验
        </h1>
    </section>
    <!-- Main content -->
    <section class="content">
        <div class="row">
            <div class="col-md-12">
                <form:form modelAttribute="queryDTO" method="post" name="queryForm" action="">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">签名校验</h3>
                        </div>
                        <div class="box-body form-horizontal">
                            <div class="row form-group">
                                <div class="col-md-6">
                                    <label class="col-sm-3 control-label">总运单号</label>
                                    <form:select path="sNo" cssClass="form-control input-sm">
                                        <form:option value=""></form:option>
                                        <form:options items="${DECLARE_STATUS}" itemValue="dictCode" itemLabel="dictName"/>
                                    </form:select>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col-md-6">
                                    <label class="col-sm-3 control-label">分运单号</label>
                                    <form:select path="Sname" cssClass="form-control input-sm">
                                        <form:option value=""></form:option>
                                        <form:options items="${CUSTOMS_CODE}" itemValue="dictCode" itemLabel="dictName"/>
                                    </form:select>
                                </div>
                            </div>
                        </div>
                        <div class="overlay" style="display: none;">
                            <i class="fa fa-refresh fa-spin"></i>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </section>
</div>
<script>

</script>
