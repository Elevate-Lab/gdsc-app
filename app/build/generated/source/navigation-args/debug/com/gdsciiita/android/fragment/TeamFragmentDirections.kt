package com.gdsciiita.android.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.gdsciiita.android.R

public class TeamFragmentDirections private constructor() {
  public companion object {
    public fun actionTeamFragmentToProjectsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_teamFragment_to_projectsFragment)

    public fun actionTeamFragmentToContactFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_teamFragment_to_contactFragment)

    public fun actionTeamFragmentToEventsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_teamFragment_to_eventsFragment)
  }
}
