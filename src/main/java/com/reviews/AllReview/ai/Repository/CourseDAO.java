package com.reviews.AllReview.ai.Repository;

import com.reviews.AllReview.ai.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseDAO extends JpaRepository<Course, UUID> {}