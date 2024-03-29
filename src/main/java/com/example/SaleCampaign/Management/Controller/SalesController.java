package com.example.SaleCampaign.Management.Controller;

import com.example.SaleCampaign.Management.Model.Sales;
import com.example.SaleCampaign.Management.Services.SalesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Sales")
public class SalesController {

    @Autowired
    private SalesServices salesServices;

    @PostMapping("/Addsales")
    private Sales addsales(@RequestBody Sales s){
        return salesServices.addsales(s);
    }

    @GetMapping("/Getsales")
    private List<Sales> getsales(){
        return salesServices.getsales();
    }

    @GetMapping("/Getpast")
    private List<Sales> getpast(){
        return salesServices.getpast();
    }

        @GetMapping("/Getfuture")
    private List<Sales> getfuture(){
        return salesServices.getfuture();
    }

    @GetMapping("/Getpresent")
    private List<Sales> getpresent(){
        return salesServices.getpresent();
    }

}
