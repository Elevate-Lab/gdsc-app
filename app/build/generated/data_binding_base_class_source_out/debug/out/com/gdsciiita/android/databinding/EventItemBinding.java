// Generated by data binding compiler. Do not edit!
package com.gdsciiita.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gdsciiita.android.R;
import com.gdsciiita.android.model.Event;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EventItemBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView card;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView desc;

  @NonNull
  public final Button link;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final TextView name;

  @Bindable
  protected Event mEvent;

  protected EventItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView card, TextView date, TextView desc, Button link, ImageView logo,
      TextView name) {
    super(_bindingComponent, _root, _localFieldCount);
    this.card = card;
    this.date = date;
    this.desc = desc;
    this.link = link;
    this.logo = logo;
    this.name = name;
  }

  public abstract void setEvent(@Nullable Event event);

  @Nullable
  public Event getEvent() {
    return mEvent;
  }

  @NonNull
  public static EventItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.event_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EventItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EventItemBinding>inflateInternal(inflater, R.layout.event_item, root, attachToRoot, component);
  }

  @NonNull
  public static EventItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.event_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EventItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EventItemBinding>inflateInternal(inflater, R.layout.event_item, null, false, component);
  }

  public static EventItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static EventItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (EventItemBinding)bind(component, view, R.layout.event_item);
  }
}