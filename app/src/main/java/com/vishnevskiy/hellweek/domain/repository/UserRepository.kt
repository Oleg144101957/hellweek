package com.vishnevskiy.hellweek.domain.repository

import com.vishnevskiy.hellweek.domain.model.SaveUserNameParam
import com.vishnevskiy.hellweek.domain.model.UserName

interface UserRepository {

    fun saveName(savepararam: SaveUserNameParam): Boolean

    fun getname(): UserName

}