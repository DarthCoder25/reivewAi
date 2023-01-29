package com.reviews.AllReview.ai.service;

import com.reviews.AllReview.ai.entity.Review;
import com.reviews.AllReview.ai.entity.Teacher;
import com.reviews.AllReview.ai.Repository.TeacherDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.util.*;

@Service
public class SimpleTeacherService implements TeacherService {
    private final TeacherDAO teacherDAO;

    public SimpleTeacherService(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void addReview(String teacherID, Review review) {
        Objects.requireNonNull(teacherID);
        Objects.requireNonNull(review);
        Teacher teacher = teacherDAO
                .findById(UUID.fromString(teacherID))
                .orElseThrow(() -> new EntityNotFoundException(teacherID));
        review.setDate(LocalDate.now());
        if(teacher.getReviews() == null){
            teacher.setReviews(new ArrayList<>());
        }
        teacher.getReviews().add(review);
        teacherDAO.save(teacher);
    }

    @Override
    public Optional<List<Teacher>> getTeachers() {
        try {
            return Optional.ofNullable(teacherDAO.findAll());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    return null;
    }
}
