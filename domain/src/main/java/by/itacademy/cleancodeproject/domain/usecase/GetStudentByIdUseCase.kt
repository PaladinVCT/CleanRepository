package by.itacademy.cleancodeproject.domain.usecase

import by.itacademy.cleancodeproject.domain.usecase.entity.Student

interface GetStudentByIdUseCase {
    fun get(id:String) : Student
}