package com.gdsciiita.android.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.gdsciiita.android.BaseApplication
import com.gdsciiita.android.databinding.FragmentContactBinding
import com.gdsciiita.android.viewmodel.TeamViewModel
import com.gdsciiita.android.viewmodel.TeamViewModelFactory


class ContactFragment : Fragment() {

    private var _binding: FragmentContactBinding? = null
    private val binding get() = _binding!!

    private val viewModel: TeamViewModel by activityViewModels {
        TeamViewModelFactory(
            (activity?.application as BaseApplication).database.memberDao()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContactBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}