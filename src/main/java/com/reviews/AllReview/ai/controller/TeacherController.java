package com.reviews.AllReview.ai.controller;

import com.reviews.AllReview.ai.entity.Review;
import com.reviews.AllReview.ai.entity.Teacher;
import com.reviews.AllReview.ai.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/getAllTeachers")
    public ResponseEntity<Optional<List<Teacher>>> getAllTeacher() {

            Optional<List<Teacher>> data = teacherService.getTeachers();
            return ResponseEntity.ok(data);


    }


    @PostMapping("/teachers/{id}/review")
    public ResponseEntity addReview(@RequestBody Review review, @PathVariable("id") String teacherID) {
        try {
            teacherService.addReview(teacherID, review);
            return ResponseEntity.ok("Data Saved");
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
