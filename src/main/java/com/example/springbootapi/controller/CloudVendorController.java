package com.example.springbootapi.controller;

import com.example.springbootapi.model.CloudVendor;
import com.example.springbootapi.service.CloudVendorService;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cloudvendors")
public class CloudVendorController {
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorService.getAllCloudVendors();
    }

    @GetMapping("/{id}")
    public CloudVendor getCloudVendor(@PathVariable String id) {
        return cloudVendorService.getCloudVendor(id);
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor vendor) {
        return cloudVendorService.createCloudVendor(vendor);
    }

    @PutMapping("/{id}")
    public String updateCloudVendor(@PathVariable String id, @RequestBody CloudVendor vendor) {
        return cloudVendorService.updateCloudVendor(vendor);
    }

    @DeleteMapping("/{id}")
    public String deleteCloudVendor(@PathVariable String id) {
        return cloudVendorService.deleteCloudVendor(id);
    }
}
