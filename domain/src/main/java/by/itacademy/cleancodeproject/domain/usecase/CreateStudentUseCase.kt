package by.itacademy.cleancodeproject.domain.usecase

import by.itacademy.cleancodeproject.domain.usecase.entity.CreateStudent

interface CreateStudentUseCase {
    fun create(student:CreateStudent):Boolean
    }