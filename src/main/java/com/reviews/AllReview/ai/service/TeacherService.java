package com.reviews.AllReview.ai.service;


import com.reviews.AllReview.ai.entity.Review;
import com.reviews.AllReview.ai.entity.Teacher;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

public interface TeacherService {


    void addReview(@NotNull String teacherID, @NotNull Review review);

    Optional<List<Teacher>> getTeachers();
}
