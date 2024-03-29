package com.example.SaleCampaign.Management.Services;

import com.example.SaleCampaign.Management.Model.PriceHistory;
import com.example.SaleCampaign.Management.Repository.PriceHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriceHistoryServices {

    @Autowired
    private PriceHistoryRepository priceHistoryRepository;

    public PriceHistory addhistory(PriceHistory p) {
        return priceHistoryRepository.save(p);
    }

    public List<PriceHistory> gethistory() {
        return priceHistoryRepository.findAll();
    }

    public Optional<PriceHistory> getbyid(int id){
        return priceHistoryRepository.findById(id);
    }

    public PriceHistory getbypid(int pid){
        return priceHistoryRepository.findByProductid(pid);
    }
}
