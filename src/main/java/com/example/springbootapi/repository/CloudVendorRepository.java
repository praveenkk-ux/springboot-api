package com.example.springbootapi.repository;
import com.example.springbootapi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
