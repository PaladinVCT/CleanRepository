package by.itacademy.cleancodeproject.domain.usecase

interface DeleteStudentUseCase {

    fun delete(id: String): Boolean
}