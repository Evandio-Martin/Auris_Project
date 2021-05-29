package com.dicoding.picodiploma.aurisproject.ui.dictionary.number

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.dicoding.picodiploma.aurisproject.DataAdapter
import com.dicoding.picodiploma.aurisproject.databinding.FragmentNumberBinding
import com.dicoding.picodiploma.aurisproject.utils.DataDummy

class NumberFragment : Fragment() {

    private lateinit var fragmentNumberBinding: FragmentNumberBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentNumberBinding = FragmentNumberBinding.inflate(layoutInflater, container, false)
        return fragmentNumberBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            val library = DataDummy.generateDummyNumber()
            val dataAdapter = DataAdapter()
            dataAdapter.setDataLibrary(library)

            with(fragmentNumberBinding.rvNumber){
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = dataAdapter
            }
        }
    }
}