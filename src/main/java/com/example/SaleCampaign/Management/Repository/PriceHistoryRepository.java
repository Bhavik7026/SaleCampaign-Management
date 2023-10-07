package com.example.SaleCampaign.Management.Repository;

import com.example.SaleCampaign.Management.Model.PriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceHistoryRepository extends JpaRepository<PriceHistory , Integer> {
    PriceHistory findByProductid(int pid);
}
