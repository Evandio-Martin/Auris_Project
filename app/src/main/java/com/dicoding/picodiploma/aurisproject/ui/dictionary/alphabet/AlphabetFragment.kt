package com.dicoding.picodiploma.aurisproject.ui.dictionary.alphabet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.dicoding.picodiploma.aurisproject.DataAdapter
import com.dicoding.picodiploma.aurisproject.databinding.FragmentAlphabetBinding
import com.dicoding.picodiploma.aurisproject.utils.DataDummy

class AlphabetFragment : Fragment() {

    private lateinit var fragmentAlphabetBinding: FragmentAlphabetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentAlphabetBinding = FragmentAlphabetBinding.inflate(layoutInflater, container, false)
        return fragmentAlphabetBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            val library = DataDummy.generateDummyAlphabet()
            val dataAdapter = DataAdapter()
            dataAdapter.setDataLibrary(library)

            with(fragmentAlphabetBinding.rvAlphabet){
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = dataAdapter
            }
        }
    }
}