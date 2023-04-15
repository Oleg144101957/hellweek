package com.vishnevskiy.hellweek.domain.usecases

import com.vishnevskiy.hellweek.domain.model.SaveUserNameParam

class SaveUserNameUseCase {


    fun execute(param: SaveUserNameParam) : Boolean {
        if (param.name.isEmpty()){
            return false
        } else {
            return true
        }

    }
}