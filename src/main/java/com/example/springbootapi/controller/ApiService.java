package com.example.springbootapi.controller;

import com.example.springbootapi.model.CloudVender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cloudvendors")
public class ApiService {

    @GetMapping
    public String getAllCloudVendors() {
        return "Get all vendors";
    }

    @GetMapping("/{id}")
    public CloudVender getCloudVendor(@PathVariable String id) {
        return new CloudVender(id, "Vendor " + id, "Address " + id, "123-456-7890");
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVender vendor) {
        return "Vendor created: " + vendor.getVendorName();
    }

    @PutMapping("/{id}")
    public String updateCloudVendor(@PathVariable String id, @RequestBody CloudVender vendor) {
        return "Vendor " + id + " updated";
    }

    @DeleteMapping("/{id}")
    public String deleteCloudVendor(@PathVariable String id) {
        return "Vendor " + id + " deleted";
    }
}
