package com.gdsciiita.android.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.gdsciiita.android.R

public class ProjectsFragmentDirections private constructor() {
  public companion object {
    public fun actionProjectsFragmentToTeamFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_projectsFragment_to_teamFragment)

    public fun actionProjectsFragmentToEventsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_projectsFragment_to_eventsFragment)

    public fun actionProjectsFragmentToContactFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_projectsFragment_to_contactFragment)
  }
}
