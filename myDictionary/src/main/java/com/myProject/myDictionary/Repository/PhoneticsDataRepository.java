package com.myProject.myDictionary.Repository;

import com.myProject.myDictionary.Entity.PhoneticsData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneticsDataRepository extends JpaRepository<PhoneticsData , Long> {
}
