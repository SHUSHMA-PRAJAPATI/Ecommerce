package com.admin.ecommerce.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.admin.ecommerce.dao.CategoryDao;
import com.admin.ecommerce.dao.ProductDao;
import com.admin.ecommerce.dao.UserDao;
import com.admin.ecommerce.entity.Category;
import com.admin.ecommerce.entity.Product;
import com.admin.ecommerce.entity.Users;
import com.admin.ecommerce.helper.FactoryProvider;

/**
 * Servlet implementation class ProductOperationServlet
 */
@MultipartConfig
public class ProductOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       HttpSession session;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductOperationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operation = request.getParameter("operation");
		System.out.println(operation);
		if(operation.equals("addCategory"))
		{
			String categoryName = request.getParameter("categoryName");
			Category category = new Category();
			category.setCategoryName(categoryName);
			category.setCategoryStatus("1");
			
			CategoryDao categoryDao = new CategoryDao(FactoryProvider.getFactory());
			int categoryId = categoryDao.saveCategory(category);
			session = request.getSession();
			session.setAttribute("message", "Category Added successfully..");
			response.sendRedirect("addCategory.jsp");
			return;
		}
		else if(operation.equals("addProduct"))
		{
			System.out.println("elese works");
			String productName = request.getParameter("productName");
			String productDescription = request.getParameter("productDescription");
			int productCategoryId  = Integer.parseInt(request.getParameter("productCategory"));
			
//			String productImage = request.getParameter("productImage");
			int productPrice = Integer.parseInt(request.getParameter("productPrice"));
			Part part = request.getPart("productImage");
			System.out.println(part);
			System.out.println(part.getSubmittedFileName());
			Product p = new Product();
			p.setProductName(productName);
			p.setProductDescription(productDescription);
			p.setProductPrice(productPrice);
			p.setProductImage(part.getSubmittedFileName());
			p.setProductStatus("true");
			p.setVendorId(1);
//			p.setProductImage(productImage);
			
			CategoryDao cDao = new CategoryDao(FactoryProvider.getFactory());
			Category category = cDao.getCategoryById(productCategoryId);
			p.setCategory(category);
			System.out.println(p);
			ProductDao pDao = new ProductDao(FactoryProvider.getFactory());
			boolean flag = pDao.saveProduct(p);
			
		  	try {
		  		String path = request.getRealPath("image") + File.separator + "productImages" + File.separator + part.getSubmittedFileName();
				System.out.println(path);
				FileOutputStream fos = new FileOutputStream(path);
				InputStream is = part.getInputStream();
	 
				byte [] data = new byte[is.available()];
				is.read(data);
				fos.write(data);
				fos.close();
		  	}
		  	catch(Exception e)
		  	{
		  		e.printStackTrace();
		  	}
//			
			session = request.getSession();
			session.setAttribute("message", "Product Added successfully..");
			response.sendRedirect("addProduct.jsp");
			return;
			
			 
		}
	} 

	/**

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
