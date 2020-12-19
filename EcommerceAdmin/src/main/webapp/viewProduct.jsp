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
              <form action="LoginServlet" method="post" class="form-horizontal">
                <div class="card-body">
                <%@ include file="components/message.jsp" %>
                  <div class="form-group row">
                    <label for="categoryName" class="col-sm-2 col-form-label">Category Name</label>
                    <div class="col-sm-10">
                    <div class="input-group-prepend">
                    	<select class="form-control " name="productCategory">
	               		    <option disabled="" selected="" hidden=""> Select Category</option>
	                   		<option value="1">Category</option>
                      	</select>
                    </div>
                    </div>
                  </div>
                  <div class="form-group row">
                    <label for="categoryName" class="col-sm-2 col-form-label">Product Name</label>
                    <div class="col-sm-10">
                      <input type="text" name="productName" class="form-control" placeholder="Product Name">
                    </div>
                  </div>
                   <div class="form-group row">
                    <label for="categoryName" class="col-sm-2 col-form-label">Product Description</label>
                    <div class="col-sm-10">
                      <input type="text" name="productDescription" class="form-control" placeholder="Product Description">
                    </div>
                  </div>
                  <div class="form-group row">
                    <label for="categoryName" class="col-sm-2 col-form-label">Product Image</label>
                    <div class="col-sm-10">
                      <input type="file" name="productImage" class="form-control-file" placeholder="Product Image">
                    </div>
                  </div>
                 <div class="form-group row">
                    <label for="categoryName" class="col-sm-2 col-form-label">Product Status</label>
                    <div class="col-sm-10 col-form-label">
                      <div class="custom-control custom-checkbox">
                      <input type="checkbox" class="custom-control-input" value="1" name="productStatus" id="customCheck9">
                      <label class="custom-control-label" for="customCheck9">Active</label>
                    </div>
                    </div>
                  </div>
                  
               </div>
                <!-- /.card-body -->
                <div class="card-footer">
                  <button type="submit" class="btn btn-info float-right mx-2">Submit</button>
                  <button type="reset" class="btn btn-danger float-right">Reset</button>
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