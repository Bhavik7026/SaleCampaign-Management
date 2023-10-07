package com.example.SaleCampaign.Management.Controller;

import com.example.SaleCampaign.Management.Model.PriceHistory;
import com.example.SaleCampaign.Management.Services.PriceHistoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/History")
public class PriceHistorycontroller {

    @Autowired
    private PriceHistoryServices priceHistoryServices;

    @PostMapping("/Addpricehistory")
    private PriceHistory Addhistory(@RequestBody PriceHistory p){
        return priceHistoryServices.addhistory(p);
    }

    @GetMapping("/GetHistory")
    private List<PriceHistory> GetHistory(){
        return priceHistoryServices.gethistory();
    }
}
