package com.myProject.myDictionary.Repository;

import com.myProject.myDictionary.Entity.MeaningData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeaningDataRepository extends JpaRepository<MeaningData , Long> {
}
