package com.example.meditation.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.meditation.R
import com.example.meditation.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

private var _binding: FragmentNotificationsBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root = inflater.inflate(R.layout.fragment_home, container, false)

        return root
    }
}