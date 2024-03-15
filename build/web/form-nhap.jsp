<%-- 
    Document   : Layout
    Created on : Mar 5, 2024, 8:07:47 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

    <head>
        <title>Title</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="css/style.css">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
    </head>

    <body>

        <div class="container">
            <jsp:include page="Layout/_header.jsp"/>    

            <jsp:include page="Layout/_menu.jsp"/>    
            <div class="row">
                <article class="col-sm-9">
                    <!--content -->
                    <div class="card" style="margin-top: 5px;">
                        <div class="card-header">
                            NHẬP LƯƠNG THÁNG 12
                        </div>
                        <form action="#">
                            <div class="row" style="margin: 5px;">
                                <div class="form-group col-sm-6">
                                    <label for="">Ma nhan vien</label>
                                    <input type="text" class="form-control" placeholder="Ma nhan vien">
                                </div>
                                <div class="form-group col-sm-6">
                                    <label for="">Ten nhan vien</label>
                                    <input type="text" class="form-control" placeholder="Ten nhan vien">
                                </div>
                            </div>
                            <div class="row" style="margin: 5px;">
                                <div class="form-group col-sm-6">
                                    <label for="">Cau lac bo</label>
                                    <select name="" id="" class="form-control">
                                        <option value="">Da Nang</option>
                                        <option value="">HCM</option>
                                        <option value="">Ha Noi</option>
                                    </select>
                                </div>
                                <div class="form-group col-sm-6">
                                    <label for="">Thuong</label>
                                    <input type="text" class="form-control" placeholder="Thuong">
                                </div>
                            </div>
                            <div class="row" style="margin: 5px;">

                                <div class="form-group col-sm-12">
                                    <label for="">Phu cap</label>
                                    <input type="text" class="form-control" placeholder="Phu cap">
                                </div>
                            </div>
                            <div class="row" style="margin: 5px;">

                                <div class="form-group col-sm-12">
                                    <label for="">Ghi chu</label>
                                    <textarea class="form-control" name="" id=""  rows="4"></textarea>
                                </div>
                            </div>
                            <div class="row" style="margin: 5px;">
                                <div class="form-group col-sm-12">
                                    <button type="submit" class="btn btn-primary" style="font-size: 16px;">Luu</button>
                                    <button type="reset" class="btn btn-secondary"  style="font-size: 16px;">Huy</button>
                                </div>

                            </div>

                        </form>
                        <div class="card-footer">
                            Vui lòng nhập thông tin cầu thủ
                        </div>
                    </div>
                    <!--end content-->
                    <!--               
                    <!--Phan Trang -->


                </article>

                <jsp:include page="Layout/_aside.jsp"/>
            </div>
            <jsp:include page="Layout/footer.jsp"/>
        </div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>

</html>