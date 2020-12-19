<%@page import="com.admin.ecommerce.entity.Users" %>
<% 
Users user = (Users)session.getAttribute("CURRENT_USER");
if(user==null)
{
	session.setAttribute("message", "You are not logged in!! Login first");
	response.sendRedirect("index.jsp");
	return;
}
else
{
	
}
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="components/common_js_css.jsp" %>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">

  <!-- Navbar -->
  <%@ include file="components/navbar.jsp" %>
  
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <%@ include file="components/sidebar.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0">Add Category</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="home.jsp">Home</a></li>
              <li class="breadcrumb-item active">Add Category</li>
            </ol>
           </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

    <!-- Main content -->  
    <section class="content">
      <div class="container-fluid">
        <div class="wrapper d-flex justify-content-center">
<div class="card card-info col-8 my-5">
              
              <!-- form start -->
              <form action="ProductOperationServlet" method="post" class="form-horizontal">
                <div class="card-body">
                <%@ include file="components/message.jsp" %>
                <input type="hidden" name="operation" value="addCategory"> 
                  <div class="form-group row">
                    <label for="categoryName" class="col-sm-2 col-form-label">Category Name</label>
                    <div class="col-sm-10">
                      <input type="text" name="categoryName" class="form-control" placeholder="Category Name">
                    </div>
                  </div>
                  
               </div>
                <!-- /.card-body -->
                <div class="card-footer">
                  <button type="submit" class="btn btn-info float-right mx-2">Submit</button>
                  <button type="submit" class="btn btn-default float-right">Cancel</button>
                </div>
                <!-- /.card-footer -->
              </form>
            </div></div>
        </div>
        </section>
        </div>
         <%@ include file="components/footer.jsp" %>
         
</body>
</html>