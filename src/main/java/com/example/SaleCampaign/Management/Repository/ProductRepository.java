package com.example.SaleCampaign.Management.Repository;

import com.example.SaleCampaign.Management.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product , Integer> {
}
