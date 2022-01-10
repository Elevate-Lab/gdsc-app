package com.gdsciiita.android.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.gdsciiita.android.BaseApplication
import com.gdsciiita.android.adapter.MemberListAdapter
import com.gdsciiita.android.databinding.FragmentTeamBinding
import com.gdsciiita.android.viewmodel.TeamViewModel
import com.gdsciiita.android.viewmodel.TeamViewModelFactory

class TeamFragment : Fragment() {

        private var _binding: FragmentTeamBinding? = null
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
        _binding = FragmentTeamBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val leadAdapter = MemberListAdapter{}
        val adapter = MemberListAdapter{}
        val memberAdapter = MemberListAdapter{}

        viewModel.getSubTeam(1).observe(this.viewLifecycleOwner) { items ->
            items.let {
                leadAdapter.submitList(it)
            }
        }

        viewModel.getSubTeam(2).observe(this.viewLifecycleOwner) { items ->
            items.let {
                adapter.submitList(it)
            }
        }

        viewModel.getSubTeam(3).observe(this.viewLifecycleOwner) { items ->
            items.let {
                memberAdapter.submitList(it)
            }
        }

        binding.apply {
            recyclerViewLead.adapter = leadAdapter
            recyclerView.adapter = adapter
            recyclerViewMembers.adapter = memberAdapter
        }

        viewModel.getData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}