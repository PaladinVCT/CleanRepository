package by.itacademy.cleancodeproject.domain.usecase

import by.itacademy.cleancodeproject.domain.usecase.entity.Student

interface UpdateStudentUseCase {

    fun update(student: Student): Boolean
}