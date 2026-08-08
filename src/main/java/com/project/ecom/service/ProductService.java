package com.project.ecom.service;

import java.io.IOException;
import java.util.List;

import com.project.ecom.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.ecom.model.Product;
import com.project.ecom.repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;
	
//	public List<Product> getAllProducts() {
//		return repo.findAll();
//	} commented to add pagination method

	public Product getProductById(int id) {
		Product product =  repo.findById(id).orElse(null);

		if(product == null){
			throw new ProductNotFoundException("Product Not Found!");
		}
		return product;
	}

	public Page<Product> getProducts(int page, int size){
		Pageable pageable = PageRequest.of(page, size);
		return repo.findAll(pageable);
	}

	public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
		product.setImageName(imageFile.getOriginalFilename());
		product.setImageType(imageFile.getContentType());
		product.setImageData(imageFile.getBytes());
		return repo.save(product);
	}

	public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
		product.setImageData(imageFile.getBytes());
		product.setImageName(imageFile.getOriginalFilename());
		product.setImageType(imageFile.getContentType());
		return repo.save(product);
	}

	public void deleteProduct(int id) {
		repo.deleteById(id);
		
	}

	public Page<Product> sortProducts(int page, int size, String sortBy){
		Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
		return repo.findAll(pageable);
	}

	public List<Product> searchProducts(String keyword) {
		return repo.searchProducts(keyword);
	}

}
