package ee.mcdimus.androidacademyapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.card.MaterialCardView

class FragmentMoviesList : Fragment() {

  private var navigationListener: FragmentNavigationListener? = null

  override fun onAttach(context: Context) {
    super.onAttach(context)

    if (context is FragmentNavigationListener) {
      navigationListener = context
    }
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? = inflater.inflate(R.layout.fragment_movies_list, container, false)

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    view.findViewById<MaterialCardView>(R.id.movie_card).apply {
      setOnClickListener {
        navigationListener?.toDetails() ?: throw IllegalStateException("FragmentNavigationListener is not available")
      }
    }
  }

}
