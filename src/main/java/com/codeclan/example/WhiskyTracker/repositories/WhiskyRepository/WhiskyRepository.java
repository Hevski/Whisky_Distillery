package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {

    List<Whisky> findAllWhiskyByYear(int year);

    List<Whisky> findAllWhiskyByDistillery(String distillery);

    List<Whisky> findWhiskyByDistilleryIdAndAge(Long id, int age);

    List<Whisky> findWhiskyByDistilleryRegion(String region);
}
