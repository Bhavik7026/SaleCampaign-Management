package com.example.SaleCampaign.Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class PriceHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Double actualprice;

    private int productid;

    private List<Double> phistory;

    private List<LocalDateTime> changetime;
}
