package hevinxx.silkpouch.createpouch.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import hevinxx.silkpouch.R

class CreatePouchFragment : Fragment() {

    private lateinit var createPouchViewModel: CreatePouchViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        createPouchViewModel =
                ViewModelProviders.of(this).get(CreatePouchViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_new_pouch, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        createPouchViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}