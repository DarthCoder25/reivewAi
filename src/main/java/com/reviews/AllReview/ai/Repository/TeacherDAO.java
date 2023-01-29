package com.reviews.AllReview.ai.Repository;


import com.reviews.AllReview.ai.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeacherDAO extends JpaRepository<Teacher, UUID> {}