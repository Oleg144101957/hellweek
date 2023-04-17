package com.vishnevskiy.hellweek.domain.usecases

import com.vishnevskiy.hellweek.domain.model.UserName
import com.vishnevskiy.hellweek.domain.repository.UserRepository

class GetUserNameUseCase (private val userRepository: UserRepository){

    fun execute(): UserName{
        return userRepository.getname()
    }
}