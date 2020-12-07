package ee.mcdimus.androidacademyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), FragmentNavigationListener {

  private val rootFragment = FragmentMoviesList()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction().apply {
        add(R.id.main_content, rootFragment)
        commit()
      }
    }
  }

  override fun toList() {
    supportFragmentManager.popBackStack()
  }

  override fun toDetails() {
    val detailsFragment = FragmentMoviesDetails()
    supportFragmentManager.beginTransaction().apply {
      add(R.id.main_content, detailsFragment)
      addToBackStack("toDetails")
      commit()
    }
  }

}