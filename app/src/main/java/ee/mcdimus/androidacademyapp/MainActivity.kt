package ee.mcdimus.androidacademyapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val pushButton = findViewById<Button>(R.id.btn_open_movie_details)
    pushButton.setOnClickListener {
      startMovieDetailsActivity()
    }
  }

  private fun startMovieDetailsActivity() {
    val intent = Intent(this, MovieDetailsActivity::class.java)
    startActivity(intent)
  }

}