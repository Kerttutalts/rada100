package com.example.ekm.Repository;

import com.example.ekm.Model.Point;
import com.example.ekm.Model.Trail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PointRepository extends JpaRepository<Point, Long> {
    List<Point> findAllByTrail(Trail trail);

    List<Point> findAll();
}
