package com.myProject.myDictionary.Repository;

import com.myProject.myDictionary.Entity.DictionaryData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryRepository extends JpaRepository<DictionaryData , Long> {
}
