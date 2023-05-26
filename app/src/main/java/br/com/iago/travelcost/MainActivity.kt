package br.com.iago.travelcost

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.iago.travelcost.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    
    var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
    
    binding.editDistance
    
  }
}

