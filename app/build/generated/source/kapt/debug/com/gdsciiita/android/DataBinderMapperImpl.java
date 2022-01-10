package com.gdsciiita.android;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.gdsciiita.android.databinding.ActivityMainBindingImpl;
import com.gdsciiita.android.databinding.EventItemBindingImpl;
import com.gdsciiita.android.databinding.FragmentContactBindingImpl;
import com.gdsciiita.android.databinding.FragmentEventsBindingImpl;
import com.gdsciiita.android.databinding.FragmentProjectsBindingImpl;
import com.gdsciiita.android.databinding.FragmentTeamBindingImpl;
import com.gdsciiita.android.databinding.MemberItemBindingImpl;
import com.gdsciiita.android.databinding.ProjectItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_EVENTITEM = 2;

  private static final int LAYOUT_FRAGMENTCONTACT = 3;

  private static final int LAYOUT_FRAGMENTEVENTS = 4;

  private static final int LAYOUT_FRAGMENTPROJECTS = 5;

  private static final int LAYOUT_FRAGMENTTEAM = 6;

  private static final int LAYOUT_MEMBERITEM = 7;

  private static final int LAYOUT_PROJECTITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gdsciiita.android.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gdsciiita.android.R.layout.event_item, LAYOUT_EVENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gdsciiita.android.R.layout.fragment_contact, LAYOUT_FRAGMENTCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gdsciiita.android.R.layout.fragment_events, LAYOUT_FRAGMENTEVENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gdsciiita.android.R.layout.fragment_projects, LAYOUT_FRAGMENTPROJECTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gdsciiita.android.R.layout.fragment_team, LAYOUT_FRAGMENTTEAM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gdsciiita.android.R.layout.member_item, LAYOUT_MEMBERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gdsciiita.android.R.layout.project_item, LAYOUT_PROJECTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_EVENTITEM: {
          if ("layout/event_item_0".equals(tag)) {
            return new EventItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for event_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONTACT: {
          if ("layout/fragment_contact_0".equals(tag)) {
            return new FragmentContactBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_contact is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEVENTS: {
          if ("layout/fragment_events_0".equals(tag)) {
            return new FragmentEventsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_events is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROJECTS: {
          if ("layout/fragment_projects_0".equals(tag)) {
            return new FragmentProjectsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_projects is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTEAM: {
          if ("layout/fragment_team_0".equals(tag)) {
            return new FragmentTeamBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_team is invalid. Received: " + tag);
        }
        case  LAYOUT_MEMBERITEM: {
          if ("layout/member_item_0".equals(tag)) {
            return new MemberItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for member_item is invalid. Received: " + tag);
        }
        case  LAYOUT_PROJECTITEM: {
          if ("layout/project_item_0".equals(tag)) {
            return new ProjectItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for project_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "event");
      sKeys.put(2, "member");
      sKeys.put(3, "project");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.gdsciiita.android.R.layout.activity_main);
      sKeys.put("layout/event_item_0", com.gdsciiita.android.R.layout.event_item);
      sKeys.put("layout/fragment_contact_0", com.gdsciiita.android.R.layout.fragment_contact);
      sKeys.put("layout/fragment_events_0", com.gdsciiita.android.R.layout.fragment_events);
      sKeys.put("layout/fragment_projects_0", com.gdsciiita.android.R.layout.fragment_projects);
      sKeys.put("layout/fragment_team_0", com.gdsciiita.android.R.layout.fragment_team);
      sKeys.put("layout/member_item_0", com.gdsciiita.android.R.layout.member_item);
      sKeys.put("layout/project_item_0", com.gdsciiita.android.R.layout.project_item);
    }
  }
}
