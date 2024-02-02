package com.example.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.activity.viewModels
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.lifecycleScope
import com.example.core.base.BaseFragment
import com.example.domain.entities.Results
import com.example.presentation.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: EpisodeViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.putIdCharacter.addTextChangedListener {
            binding.putId.isEnabled = !it.isNullOrEmpty()
        }

        val fragment = BaseFragment()
        Log.d("value","${fragment.base}")
        binding.putId.setOnClickListener {
            lifecycleScope.launch {
                val values = viewModel.getCharacterById(binding.putIdCharacter.text.toString())
                when(values){
                    is Results.Success ->{
                        binding.apply {
                            tvNameTextValue.text = values.value.name
                            tvStatusTextValue.text = values.value.status
                            tvGenderTextValue.text = values.value.gender
                        }
                    }
                    is Results.Failure ->{
                        Log.d("error","${values.error}")
                    }
                }
            }
        }

    }
}