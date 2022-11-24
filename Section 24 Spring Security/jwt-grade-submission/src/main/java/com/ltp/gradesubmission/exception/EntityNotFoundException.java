package com.ltp.gradesubmission.exception;
//This class replaces the need for additional exception classes for each entity.

public class EntityNotFoundException extends RuntimeException { 

    public EntityNotFoundException(Long id, Class<?> entity) {
            super("The " + entity.getSimpleName().toLowerCase() + " with id '" + id + "' does not exist in our records");
    }

}