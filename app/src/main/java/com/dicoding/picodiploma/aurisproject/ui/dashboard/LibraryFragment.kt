package com.dicoding.picodiploma.aurisproject.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.dicoding.picodiploma.aurisproject.R
import com.dicoding.picodiploma.aurisproject.databinding.FragmentLibraryBinding

class LibraryFragment : Fragment() {

    private lateinit var libraryViewModel: LibraryViewModel
    private var _binding: FragmentLibraryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        libraryViewModel =
            ViewModelProvider(this).get(LibraryViewModel::class.java)
        _binding = FragmentLibraryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnStart.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_navigation_library_to_libraryActivity)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}