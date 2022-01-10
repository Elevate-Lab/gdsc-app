package com.gdsciiita.android.fragment

import android.app.usage.EventStats
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.gdsciiita.android.BaseApplication
import com.gdsciiita.android.adapter.EventListAdapter
import com.gdsciiita.android.adapter.MemberListAdapter
import com.gdsciiita.android.constants.EventStatus
import com.gdsciiita.android.databinding.FragmentEventsBinding
import com.gdsciiita.android.databinding.FragmentTeamBinding
import com.gdsciiita.android.viewmodel.EventViewModel
import com.gdsciiita.android.viewmodel.EventViewModelFactory


class EventsFragment : Fragment() {

    private var _binding: FragmentEventsBinding? = null
    private val binding get() = _binding!!


    private val viewModel: EventViewModel by activityViewModels {
        EventViewModelFactory(
            (activity?.application as BaseApplication).database.eventDao()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEventsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pastAdapter = EventListAdapter{}

        viewModel.getSubEvent(EventStatus.PAST).observe(this.viewLifecycleOwner) { items ->
            items.let {
                pastAdapter.submitList(it)
            }
        }

        binding.apply {
            recyclerViewPast.adapter = pastAdapter
        }

        viewModel.getData()
    }
}