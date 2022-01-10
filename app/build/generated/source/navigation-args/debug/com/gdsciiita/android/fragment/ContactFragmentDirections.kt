package com.gdsciiita.android.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.gdsciiita.android.R

public class ContactFragmentDirections private constructor() {
  public companion object {
    public fun actionContactFragmentToProjectsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_contactFragment_to_projectsFragment)

    public fun actionContactFragmentToEventsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_contactFragment_to_eventsFragment)

    public fun actionContactFragmentToTeamFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_contactFragment_to_teamFragment)
  }
}
