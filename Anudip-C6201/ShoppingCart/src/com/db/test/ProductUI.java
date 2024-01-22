package com.db.test;

import java.util.List;
import java.util.Scanner;

import com.db.dao.impl.ProductDaoImpl;
import com.db.pojo.Product;

public class ProductUI {

	public static void main(String[] args) {
		
		Integer option;
		Boolean exit=false;
		Integer productId;         
		String productName;        
		String productType; 
		Double price;              
		Integer quantityInStock;   
		Double rating;             
		String description;  
		String choice;
		
		Scanner sc=new Scanner(System.in);
		
		Product p=null;
		ProductDaoImpl pimpl=new ProductDaoImpl();
		Boolean flag;
		List<Product> plist=null;
		
		System.out.println("-------------------------------Welcome ------------------------------------");
		while(exit==false) {
			
			System.out.println("Enter the options as given below:-");
			System.out.println("1------> Add product");
			System.out.println("2------> Show all products");
			System.out.println("3------> Update product");
			System.out.println("4------> Delete a product");
			System.out.println("5------> Search product by name");
			
			option=sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			
			case 1:
				System.out.print("Enter name of product: ");
                productName = sc.nextLine();

                System.out.print("Enter type of product: ");
                productType = sc.nextLine();

                System.out.print("Enter price of product: ");
                price = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter number of product in stock: ");
                quantityInStock = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter rating for the product: ");
                rating = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter short description of the product: ");
                description=sc.nextLine();      
				
				p=new Product(productName, productType, price, quantityInStock,rating, description);
				
				flag=pimpl.addProduct(p);
				if(flag)
					System.out.println("Product added to database successfully!!!\n***************************************************");
				else 
					System.err.println("Error while adding the product to database..");
				break;
				
			case 2:
				plist=pimpl.showAllProducts();
				if(plist!=null && plist.isEmpty()!=true) {
					
					for(Product product : plist) {
						System.out.println(product);

					}
				}
				else
					System.err.println("Unable to show products at this moment!! Please try again later...");
				break;
				
			case 3:
				
				plist=pimpl.showAllProducts();
				if(plist!=null && plist.isEmpty()!=true) {
					
					for(Product product : plist) {
						System.out.println(product.getProductName()+" : "+product.getProductId());
						System.out.println("__________________________________________________\n");
					}
					
					System.out.print("Please enter the id of the product to be updated: ");
					productId=sc.nextInt();
					sc.nextLine();
					
					p=pimpl.showProductById(productId);
					if(p!=null) {
						
						System.out.println(p);
						System.out.print("Enter yes or no based on if you want to update this product: ");
						choice=sc.nextLine();
						
						if(choice.equalsIgnoreCase("yes")) {
							
							System.out.print("Enter name of product: ");
			                productName = sc.nextLine();

			                System.out.print("Enter type of product: ");
			                productType = sc.nextLine();

			                System.out.print("Enter price of product: ");
			                price = sc.nextDouble();
			                sc.nextLine();

			                System.out.print("Enter number of product in stock: ");
			                quantityInStock = sc.nextInt();
			                sc.nextLine();

			                System.out.print("Enter rating for the product: ");
			                rating = sc.nextDouble();
			                sc.nextLine();

			                System.out.print("Enter short description of the product: ");
			                description=sc.nextLine();
			                
			                p.setDescription(description);
			                p.setPrice(price);
			                p.setProductName(productName);
			                p.setProductType(productType);
			                p.setQuantityInStock(quantityInStock);
			                p.setRating(rating);
			                
			                flag=pimpl.updateProduct(p);
			                if(flag)
			                	System.out.println("Product updated successfully!");
			                else
			                	System.err.println("Error while updating product...");
						}
						else if(choice.equalsIgnoreCase("no"))
							System.out.println("No issues. Continue browsing");
						else 
							System.out.println("Please enter yes or no only!!!");
						
					}
					else 
						System.out.println("No product found by this id");
				
				}
				else
					System.err.println("Unable to show products at this moment!! Please try again later...");
				break;
				
			case 4:
				plist=pimpl.showAllProducts();
				if(plist!=null && plist.isEmpty()!=true) {
					
					for(Product product : plist) {
						System.out.println(product.getProductName()+" : "+product.getProductId());
						System.out.println("__________________________________________________\n");
					}
					
					System.out.print("Please enter the id of the product to be deleted: ");
					productId=sc.nextInt();
					sc.nextLine();
					
					p=pimpl.showProductById(productId);
					
					if(p!=null) {
						
						System.out.println("****Product******");
						System.out.println(p);
						
						System.out.println("Are you sure you want to delete this Product?");
						System.out.println("Answer in yes or no");
						choice=sc.next();
						sc.nextLine();
						
						if(choice.equalsIgnoreCase("yes")) {
							
							flag=pimpl.deleteProduct(productId);
							if(flag)
								System.out.println("Product with ID " + productId + " deleted successfully.");
							else
								System.out.println("Error while deleting product!!");
						}
						else
							System.out.println("No problem. Please continue browsing!!");
					}
					else
						System.out.println("No product of this id found!!");
				}
				
				break;
				
			case 5:
				
				System.out.print("Enter the name of the product you want to search: ");
				productName=sc.nextLine();
				
				plist=pimpl.searchProductbyName(productName);
				if(plist!=null && plist.isEmpty()!=true) {
					
					for(Product product : plist) {
						System.out.println(product);
						System.out.println("__________________________________________________\n");
					}
				}
				else
					System.err.println("Unable to show products at this moment!! Please try again later...");
				break;
			}
		}

	}

}
