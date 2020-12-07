package ee.mcdimus.androidacademyapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment() {

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
  ): View? = inflater.inflate(R.layout.fragment_movies_details, container, false)

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    view.findViewById<Button>(R.id.back_btn).setOnClickListener {
      navigationListener?.toList() ?: throw IllegalStateException("FragmentNavigationListener is not available")
    }
  }

}
