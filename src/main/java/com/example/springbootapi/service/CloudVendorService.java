package com.example.springbootapi.service;

import com.example.springbootapi.model.CloudVendor;

public interface CloudVendorService{
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String vendorId);
    public CloudVendor getCloudVendor(String vendorId);
    public java.util.List<CloudVendor> getAllCloudVendors();

}
