package com.gdsciiita.android.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.gdsciiita.android.BaseApplication
import com.gdsciiita.android.adapter.MemberListAdapter
import com.gdsciiita.android.adapter.ProjectListAdapter
import com.gdsciiita.android.databinding.FragmentProjectsBinding
import com.gdsciiita.android.viewmodel.ProjectViewModel
import com.gdsciiita.android.viewmodel.ProjectViewModelFactory
import com.gdsciiita.android.viewmodel.TeamViewModel
import com.gdsciiita.android.viewmodel.TeamViewModelFactory


class ProjectsFragment : Fragment() {

    private var _binding: FragmentProjectsBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ProjectViewModel by activityViewModels {
        ProjectViewModelFactory(
            (activity?.application as BaseApplication).database.projectDao()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProjectsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ProjectListAdapter{}

        viewModel.allProjects.observe(this.viewLifecycleOwner) { items ->
            items.let {
                adapter.submitList(it)
            }
        }

        binding.apply {
            recyclerViewProjects.adapter = adapter
        }

        viewModel.getProjects()
    }
}