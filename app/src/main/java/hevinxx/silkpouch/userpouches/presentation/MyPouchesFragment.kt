package hevinxx.silkpouch.userpouches.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import hevinxx.silkpouch.R

class MyPouchesFragment : Fragment() {

    private lateinit var myPouchesViewModel: MyPouchesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myPouchesViewModel =
                ViewModelProviders.of(this).get(MyPouchesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_my_pouch, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        myPouchesViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}