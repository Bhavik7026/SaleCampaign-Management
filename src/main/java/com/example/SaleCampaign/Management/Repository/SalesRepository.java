package com.example.SaleCampaign.Management.Repository;

import com.example.SaleCampaign.Management.Model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SalesRepository extends JpaRepository<Sales  ,Integer> {
    List<Sales> findByEndDateBefore(LocalDate now);

    List<Sales> findByStartDateAfter(LocalDate now);


    List<Sales> findByStartDateBeforeAndEndDateAfterOrStartDateEqualsOrEndDateEquals(LocalDate now, LocalDate now1, LocalDate now2, LocalDate now3);
}
