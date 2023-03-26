package com.example.meditation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.meditation.R
import com.example.meditation.databinding.FragmentHomeBinding
import com.example.meditation.recadapters.FeelRecycler
import com.example.meditation.recadapters.MyFeel

class HomeFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {

    val root = inflater.inflate(R.layout.fragment_home, container, false)

    return root
  }
}