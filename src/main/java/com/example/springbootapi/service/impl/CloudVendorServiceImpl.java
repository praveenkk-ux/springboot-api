package com.example.springbootapi.service.impl;

import org.springframework.stereotype.Service;

import com.example.springbootapi.model.CloudVendor;
import com.example.springbootapi.repository.CloudVendorRepository;
import com.example.springbootapi.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "successfully created";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Updated Successfully";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Deleted Successfully";
    }

    @Override
    public com.example.springbootapi.model.CloudVendor getCloudVendor(String vendorId) {
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public java.util.List<com.example.springbootapi.model.CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }    
}
