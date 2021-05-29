package com.dicoding.picodiploma.aurisproject.ui.dictionary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.dicoding.picodiploma.aurisproject.R
import com.dicoding.picodiploma.aurisproject.databinding.FragmentDictionaryBinding

class DictionaryFragment : Fragment() {

    private lateinit var dictionaryViewModel: DictionaryViewModel
    private var _binding: FragmentDictionaryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dictionaryViewModel =
            ViewModelProvider(this).get(DictionaryViewModel::class.java)
        _binding = FragmentDictionaryBinding.inflate(inflater, container, false)
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