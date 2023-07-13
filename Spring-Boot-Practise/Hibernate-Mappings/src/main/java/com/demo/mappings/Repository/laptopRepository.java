package com.demo.mappings.Repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mappings.Entity.Laptop;

@Repository
public interface laptopRepository extends JpaRepository<Laptop, Integer> {

}
