package com.vishnevskiy.hellweek.data.repository

import com.vishnevskiy.hellweek.domain.model.SaveUserNameParam
import com.vishnevskiy.hellweek.domain.model.UserName
import com.vishnevskiy.hellweek.domain.repository.UserRepository

class UserRepositoryImpl : UserRepository {

    override fun saveName(savepararam: SaveUserNameParam): Boolean{
        return true
    }

    override fun getname(): UserName {
        return UserName(firstName = "Kiparo", lastName = "Hello from repo")
    }
}