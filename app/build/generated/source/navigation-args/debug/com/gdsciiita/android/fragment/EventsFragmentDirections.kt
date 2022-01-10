package com.gdsciiita.android.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.gdsciiita.android.R

public class EventsFragmentDirections private constructor() {
  public companion object {
    public fun actionEventsFragmentToContactFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_eventsFragment_to_contactFragment)

    public fun actionEventsFragmentToProjectsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_eventsFragment_to_projectsFragment)

    public fun actionEventsFragmentToTeamFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_eventsFragment_to_teamFragment)
  }
}
