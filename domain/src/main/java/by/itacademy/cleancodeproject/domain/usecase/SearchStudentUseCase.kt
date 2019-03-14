package by.itacademy.cleancodeproject.domain.usecase

import by.itacademy.cleancodeproject.domain.usecase.entity.SearchParam
import by.itacademy.cleancodeproject.domain.usecase.entity.Student

interface SearchStudentUseCase {

    fun search(params:SearchParam):List<Student>
}