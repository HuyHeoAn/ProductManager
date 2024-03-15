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
                  <!--end content-->
<!--                <div class="row" style="margin-top: 15px;">
                    <div class="col-sm-4">
                        <img class="img-thumbnail" src="images/m3.jpg" style="width: 240px; height: 200px;" alt="">
                        <p style="text-align: justify; padding: 10px;">Using color to add meaning only provides a visual indication, which will not be conveyed to users of assistive
                        technologies. <button class="btn btn-primary" type="button">chi tiet</button></p>
                    </div>
                    <div class="col-sm-4">
                        <img class="img-thumbnail" src="images/m4.jpg" style="width: 240px; height: 200px;" alt="">
                        <p style="text-align: justify; padding: 10px;">Using color to add meaning only provides a visual indication, which
                            will not be conveyed to users of assistive
                            technologies. <button class="btn btn-primary" type="button">chi tiet</button></p>
                    </div>
                    <div class="col-sm-4">
                        <img class="img-thumbnail" src="images/m5.jpg" style="width: 240px; height: 200px;" alt="">
                        <p style="text-align: justify; padding: 10px;">Using color to add meaning only provides a visual indication, which
                            will not be conveyed to users of assistive
                            technologies. <button class="btn btn-primary" type="button">chi tiet</button></p>
                    </div>
                </div>
                <div class="row" style="margin-top: 15px;">
                    <div class="col-sm-4">
                        <img class="img-thumbnail" src="images/1014.jpg" style="width: 240px; height: 200px;" alt="">
                        <p style="text-align: justify; padding: 10px;">Using color to add meaning only provides a visual indication,
                            which will not be conveyed to users of assistive
                            technologies. <button class="btn btn-primary" type="button">chi tiet</button></p>
                    </div>
                    <div class="col-sm-4">
                        <img class="img-thumbnail" src="images/m6.jpg" style="width: 240px; height: 200px;" alt="">
                        <p style="text-align: justify; padding: 10px;">Using color to add meaning only provides a visual indication,
                            which
                            will not be conveyed to users of assistive
                            technologies. <button class="btn btn-primary" type="button">chi tiet</button></p>
                    </div>
                    <div class="col-sm-4">
                        <img class="img-thumbnail" src="images/m7.jpg" style="width: 240px; height: 200px;" alt="">
                        <p style="text-align: justify; padding: 10px;">Using color to add meaning only provides a visual indication,
                            which
                            will not be conveyed to users of assistive
                            technologies. <button class="btn btn-primary" type="button">chi tiet</button></p>
                    </div>
                </div>-->
                <!--Phan Trang -->
<!--                <nav aria-label="Page navigation example">
                    <ul class="pagination justify-content-center">
                        <li class="page-item disabled">
                            <a class="page-link" href="#" tabindex="-1">Previous</a>
                        </li>
                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item">
                            <a class="page-link" href="#">Next</a>
                        </li>
                    </ul>
                </nav>-->

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