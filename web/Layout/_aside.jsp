<%-- 
    Document   : _aside
    Created on : Mar 5, 2024, 8:15:05 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <aside class="col-sm-3">
                <div class="card poly-cart">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-sm-5">
                                <img src="images/shoppingcart.gif" alt="" width="70">
                            </div>
                            <div class="col-sm-7">
                                <ul>
                                    <li>100 item</li>
                                    <li>$56.5</li>
                                    <li><a href="#">VIEW CART</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="card poly-cart">
                    <div class="card-body">
                        <div class="row">
                            <form action="">
                                <input type="text" class="form-control" placeholder="search">
                            </form>
                        </div>
                    </div>
                </div>
                <div class="card poly-cart" data-toggle="collapse" href="#collapseOne">
                    <div class="card-header" style="cursor: pointer;">
                        <span class="glyphicon glyphicon-th-list"></span> Chủng loại
                    </div>
                    <ul class="list-group list-group-flush card-collapse" id="collapseOne">
                        <li class="list-group-item">Text <span class="badge badge-secondary">50</span></li>
                        <li class="list-group-item">Text</li>
                        <li class="list-group-item">Text</li>
                        <li class="list-group-item">Text</li>
                        <li class="list-group-item">Text</li>
                        <li class="list-group-item">Text</li>
                        <li class="list-group-item">Text</li>
                    </ul>
                </div>
            </aside>