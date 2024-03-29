package com.example.SaleCampaign.Management.Services;

import com.example.SaleCampaign.Management.Model.Product;
import com.example.SaleCampaign.Management.Model.Sales;
import com.example.SaleCampaign.Management.Repository.ProductRepository;
import com.example.SaleCampaign.Management.Repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SalesServices {

    @Autowired
    private SalesRepository salesRepository;
    @Autowired
    private ProductRepository productRepository;

    public Sales addsales(Sales s) {
        List<Product> p = productRepository.findAll();
        s.setCampaignDiscount(p);
        return salesRepository.save(s);
    }

    public List<Sales> getsales() {
        return salesRepository.findAll();
    }

    public List<Sales> getpast() {
        return salesRepository.findByEndDateBefore(LocalDate.now());
    }

    public List<Sales> getfuture() {
        return salesRepository.findByStartDateAfter(LocalDate.now());
    }

    public List<Sales> getpresent() {
        return salesRepository.findByStartDateBeforeAndEndDateAfterOrStartDateEqualsOrEndDateEquals(LocalDate.now(),LocalDate.now() , LocalDate.now() , LocalDate.now());
    }
}
