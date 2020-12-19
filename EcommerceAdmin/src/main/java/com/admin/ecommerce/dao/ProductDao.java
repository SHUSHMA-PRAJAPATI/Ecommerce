package com.admin.ecommerce.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.admin.ecommerce.entity.Product;

public class ProductDao {

	private SessionFactory factory;

	public ProductDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public boolean saveProduct(Product product)
	{
		boolean isProductSave = false;
		try
		{
			Session session = this.factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(product);
			tx.commit();
			session.close();
			isProductSave = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			isProductSave = false;
		}
		return isProductSave;
	}
}
