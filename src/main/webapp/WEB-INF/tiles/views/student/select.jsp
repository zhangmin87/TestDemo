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
                <form id="form1" method="post">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">签名校验</h3>
                        </div>
                        <div class="box-body form-horizontal">
                            <div class="row form-group">
                                <div class="col-md-6">
                                    <label class="col-sm-3 control-label">签名算法</label>
                                    <div class="col-sm-9">
                                        <select name="algorithms" class="form-control input-sm required">
                                            <option value="MD5">MD5</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col-md-6">
                                    <label class="col-sm-3 control-label">字符编码</label>
                                    <div class="col-sm-9">
                                        <select name="charset" class="form-control input-sm required">
                                            <option value="UTF-8">UTF-8</option>
                                            <option value="GBK">GBK</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col-md-6">
                                    <label class="col-sm-3 control-label">SecretKey</label>
                                    <div class="col-sm-9">
                                        <input name="secureKey" type="text" class="form-control input-sm required" title="SecretKey">
                                    </div>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col-md-6">
                                    <label class="col-sm-3 control-label">请求报文</label>
                                    <div class="col-sm-9">
                                        <textarea name="reqMessageText" class="form-control input-sm required" title="请求报文" rows="10"></textarea>
                                    </div>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col-md-6">
                                    <label class="col-sm-3 control-label"></label>
                                    <div class="col-sm-9">
                                        <button type="button" class="btn btn-sm btn-primary" onclick="doEncode();">生成签名</button>
                                    </div>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col-md-6">
                                    <label class="col-sm-3 control-label">数字签名</label>
                                    <div class="col-sm-9">
                                        <input id="signature" name="signature" type="text" class="form-control input-sm">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="overlay" style="display: none;">
                            <i class="fa fa-refresh fa-spin"></i>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </section>
</div>
<script>

</script>
