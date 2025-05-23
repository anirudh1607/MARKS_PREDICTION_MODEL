package com.siddhant.markspredictionmodel

import PredictiveModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import com.siddhant.markspredictionmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {
            binding.tvPredictedMarks.text = ""
            binding.tvSuggession.text = ""

            val hours = binding.etHours.text.toString().toDoubleOrNull()
            if(hours != null && hours >= 1 && hours <= 19){
                val predictedResult = PredictiveModel.predictMarks(hours)
                binding.tvPredictedMarks.text = String.format("%.2f", predictedResult.predictedMarks).plus(" %")
                binding.tvSuggession.text = predictedResult.suggestion
            }else {
                Toast.makeText(this@MainActivity, getString(R.string.error_hours), Toast.LENGTH_SHORT).show()
            }
        }

        binding.etHours.setOnFocusChangeListener { _, b ->
            if(b){
                binding.tvPredictedMarks.text = ""
                binding.tvSuggession.text = ""
            }
        }
    }
}