package com.vishnevskiy.hellweek.domain.usecases

import com.vishnevskiy.hellweek.domain.model.SaveUserNameParam
import com.vishnevskiy.hellweek.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam) : Boolean {
        val result: Boolean = userRepository.saveName(savepararam = param)
        return result
    }
}