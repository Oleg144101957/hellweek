package com.vishnevskiy.hellweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vishnevskiy.hellweek.databinding.ActivityMainBinding
import com.vishnevskiy.hellweek.domain.model.SaveUserNameParam
import com.vishnevskiy.hellweek.domain.model.UserName
import com.vishnevskiy.hellweek.domain.usecases.GetUserNameUseCase
import com.vishnevskiy.hellweek.domain.usecases.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val getUserNameUseCase = GetUserNameUseCase()
    private val saveUserNameUseCase = SaveUserNameUseCase()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaveData.setOnClickListener {
            val userName: UserName = getUserNameUseCase.execute()
            binding.titleTV.text = "Save result = ${userName.firstName}"

        }

        binding.btnGetData.setOnClickListener {
            val text = binding.etData.text.toString()
            val params = SaveUserNameParam(name = text)
            val result : Boolean = saveUserNameUseCase.execute(param = params)
            binding.titleTV.text = "Save result = $result"
        }


    }

    //my super code
}