package by.itacademy.cleancodeproject.domain.usecase

import by.itacademy.cleancodeproject.domain.usecase.entity.Student

interface GetStudentsUseCase {

    fun get() : List<Student>
}