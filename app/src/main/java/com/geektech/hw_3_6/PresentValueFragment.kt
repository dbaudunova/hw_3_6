package com.geektech.hw_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.geektech.hw_3_6.databinding.FragmentPresentValueBinding

class PresentValueFragment : Fragment() {

    private lateinit var binding: FragmentPresentValueBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPresentValueBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        initObserver()
    }

    private fun initObserver() {
        viewModel.mCounter.observe(requireActivity()) {
            binding.tvValue.text = it.toString()
        }
    }

}