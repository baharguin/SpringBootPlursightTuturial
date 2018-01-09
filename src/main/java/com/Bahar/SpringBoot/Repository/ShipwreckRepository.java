package com.Bahar.SpringBoot.Repository;


import com.Bahar.SpringBoot.Model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
