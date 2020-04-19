package com.admin.his.repository;

import com.admin.his.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("medicineRepository")
public interface MedicineRepository extends JpaRepository<Medicine,Long> {

}
