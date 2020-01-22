package com.monsercode.skyllaconnect.ui.announce

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.monsercode.skyllaconnect.R

class AnnounceFragment : Fragment() {

    private lateinit var announceViewModel: AnnounceViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        announceViewModel =
            ViewModelProviders.of(this).get(AnnounceViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_announce, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        announceViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}