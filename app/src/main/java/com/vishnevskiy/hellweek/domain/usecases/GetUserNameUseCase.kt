package com.vishnevskiy.hellweek.domain.usecases

import com.vishnevskiy.hellweek.domain.model.UserName

class GetUserNameUseCase {

    fun execute(): UserName{
        return UserName(firstName = "Oleg", lastName = "Vishnevskiy")
    }
}