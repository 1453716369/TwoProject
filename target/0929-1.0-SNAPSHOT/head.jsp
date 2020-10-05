<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/1
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>头部文件</title>
    <link rel="stylesheet" href="assert/css/head.css">
    <link rel="stylesheet" href="assert/css/bootstrap.css">
    <script type="text/javascript" src="assert/js/jquery-3.4.1.js"></script>
    <script type="text/javascript" src="assert/js/bootstrap.js"></script>
    <script type="text/javascript" src="assert/js/head.js"></script>

</head>
<body>
<div class="container-fluid">
<%--    首页导航栏--%>
    <div class="row black">
        <div class="col-sm-1"></div>
        <div class="col-sm-7" style="position: relative">
            <ul class="list-inline">
                <li>小米商城</li>
                <li>MIUI</li>
                <li>IoT</li>
                <li>云服务</li>
                <li>金融</li>
                <li>有品</li>
                <li>小爱开放平台</li>
                <li>企业团购</li>
                <li>资质证照</li>
                <li>协议规则</li>
                <li id="download">下载app
                    <%--  漂浮  小米下载二维码--%>
                    <div class="download ">
                        <div class="text-center">
                            <dl>
                                <dt><img src="assert/img/wx.png " alt="下载二维码"></dt>
                            </dl>
                        </div>
                    </div>
                </li>
                <li>智能生活</li>
                <li>Select Location</li>
            </ul>
        </div>
        <div class="col-sm-2 ">
            <ul class="list-inline text-right">
                <li>
                    <a href="#">登入</a>
                </li>
                <li>
                    <a href="#">注册</a>
                </li>
                <li>
                    <a href="#">消息通知</a>
                </li>
            </ul>

        </div>
        <div class="col-sm-1 shopcar">
            <ul class="list-inline text-center ">
                <li>
                    <a href="#"><span class="glyphicon glyphicon-shopping-cart"></span>
                        购物车
                    </a>
                </li>
            </ul>
            <%--  漂浮  购物车展示--%>
            <div id="shopcar" class="text-center">
                购物车还没有商品，快去选购吧！
            </div>
        </div>
    </div>

        </div>


<%--    搜索栏--%>

    <div class="row">

        <div class="col-sm-1 "></div>
        <div class="col-sm-10">
            <div class="row">
                <div class="col-sm-2 ">
                    <div id="logo">
                        <img src="assert/img/milogo.png" alt="这是logo" ></div>
                </div>
                <div class="col-sm-7 daohang">
                    <ul class="list-inline ">
                        <li id="li1"> 小米手机 &nbsp;</li>
                        <li id="li2">Redmi&nbsp;</li>
                        <li id="li3">红米&nbsp;</li>
                        <li id="li4">电视&nbsp;</li>
                        <li id="li5">电视&nbsp;</li>
                        <li id="li6">家电&nbsp;</li>
                        <li id="li7">路由器&nbsp;</li>
                        <li id="li8">智能硬件&nbsp;</li>
                        <li>服务</li>
                        <li>社区</li>
                    </ul>
                    <%--  漂浮  分类商品预览--%>
                    <div id="proClass">
                        <div class="proClassl text-center">
                            <img src="assert/img/phone1.jpg"><br>
                            <span class="info ">Redmi K30 至尊纪念版</span><br>
                            <span class="price "> 2199元起</span>
                        </div>
                        <div class="proClass text-center">
                            <img src="assert/img/phone1.jpg"><br>
                            <span class="info ">Redmi K30 至尊纪念版</span><br>
                            <span class="price "> 2199元起</span>
                        </div>
                        <div class="proClass text-center">
                            <img src="assert/img/phone1.jpg"><br>
                            <span class="info ">Redmi K30 至尊纪念版</span><br>
                            <span class="price "> 2199元起</span>
                        </div>
                        <div class="proClass text-center">
                            <img src="assert/img/phone1.jpg"><br>
                            <span class="info ">Redmi K30 至尊纪念版</span><br>
                            <span class="price "> 2199元起</span>
                        </div>
                        <div class="proClass text-center">
                            <img src="assert/img/phone1.jpg"><br>
                            <span class="info ">Redmi K30 至尊纪念版</span><br>
                            <span class="price "> 2199元起</span>
                        </div>
                        <div class="proClass text-center">
                            <img src="assert/img/phone1.jpg"><br>
                            <span class="info ">Redmi K30 至尊纪念版</span><br>
                            <span class="price "> 2199元起</span>
                        </div>
                    </div>
                </div>
                <div class="col-sm-3 text-right">
                    <form class="form-inline suosuo">
                        <div class="form-group">
                            <div class="input-group">
                            <input type="text" class="form-control" id="sousuo" placeholder="请输入您要搜索的商品">
                               <span class="input-group-btn">
                                <button class="btn btn-default" type="button">搜索</button>
                               </span>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>
</div>
</body>
</html>
