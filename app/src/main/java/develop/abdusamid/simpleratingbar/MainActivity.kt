package develop.abdusamid.simpleratingbar

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.RatingBar
import androidx.appcompat.app.AppCompatActivity
import develop.abdusamid.simpleratingbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()
        binding.ratingBar.numStars = 6
        binding.ratingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { _, _, _ ->
            }
        binding.buttonCheck.setOnClickListener {
            binding.textView.text = "You Have Got ${binding.ratingBar.rating.toDouble()} Stars"
        }
    }
}