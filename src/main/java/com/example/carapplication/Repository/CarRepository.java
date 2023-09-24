package com.example.carapplication.Repository;

import com.example.carapplication.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarRepository extends JpaRepository<Car, Long> {
}