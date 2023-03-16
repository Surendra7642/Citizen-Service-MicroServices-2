package com.surya.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.entity.Citizen;
@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

	abstract public List<Citizen> VaccinationCenterId(Integer id);
}
