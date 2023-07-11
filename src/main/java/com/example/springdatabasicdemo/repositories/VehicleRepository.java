package com.example.springdatabasicdemo.repositories;



import com.example.springdatabasicdemo.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long>{
}