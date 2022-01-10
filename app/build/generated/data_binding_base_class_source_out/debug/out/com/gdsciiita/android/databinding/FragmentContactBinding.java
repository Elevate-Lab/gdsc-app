// Generated by data binding compiler. Do not edit!
package com.gdsciiita.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gdsciiita.android.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentContactBinding extends ViewDataBinding {
  @NonNull
  public final ImageView img1;

  @NonNull
  public final ImageView img2;

  @NonNull
  public final ImageView img3;

  @NonNull
  public final ImageView img4;

  @NonNull
  public final TextView title1;

  @NonNull
  public final TextView title2;

  @NonNull
  public final TextView title3;

  @NonNull
  public final TextView title4;

  protected FragmentContactBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView img1, ImageView img2, ImageView img3, ImageView img4, TextView title1,
      TextView title2, TextView title3, TextView title4) {
    super(_bindingComponent, _root, _localFieldCount);
    this.img1 = img1;
    this.img2 = img2;
    this.img3 = img3;
    this.img4 = img4;
    this.title1 = title1;
    this.title2 = title2;
    this.title3 = title3;
    this.title4 = title4;
  }

  @NonNull
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_contact, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentContactBinding>inflateInternal(inflater, R.layout.fragment_contact, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_contact, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentContactBinding>inflateInternal(inflater, R.layout.fragment_contact, null, false, component);
  }

  public static FragmentContactBinding bind(@NonNull View view) {
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
  public static FragmentContactBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentContactBinding)bind(component, view, R.layout.fragment_contact);
  }
}
