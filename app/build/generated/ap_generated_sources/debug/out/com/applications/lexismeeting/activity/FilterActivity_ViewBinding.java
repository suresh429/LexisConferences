// Generated code from Butter Knife. Do not modify!
package com.applications.lexismeeting.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.applications.lexismeeting.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FilterActivity_ViewBinding implements Unbinder {
  private FilterActivity target;

  private View view7f0a01c1;

  private View view7f0a01bf;

  private View view7f0a01c0;

  private View view7f0a006c;

  private View view7f0a006d;

  @UiThread
  public FilterActivity_ViewBinding(FilterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FilterActivity_ViewBinding(final FilterActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.rbSubjects, "field 'rbSubjects' and method 'onViewClicked'");
    target.rbSubjects = Utils.castView(view, R.id.rbSubjects, "field 'rbSubjects'", RadioButton.class);
    view7f0a01c1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rbCountries, "field 'rbCountries' and method 'onViewClicked'");
    target.rbCountries = Utils.castView(view, R.id.rbCountries, "field 'rbCountries'", RadioButton.class);
    view7f0a01bf = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rbMonth, "field 'rbMonth' and method 'onViewClicked'");
    target.rbMonth = Utils.castView(view, R.id.rbMonth, "field 'rbMonth'", RadioButton.class);
    view7f0a01c0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.radioGroup, "field 'radioGroup'", RadioGroup.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progressBar'", ProgressBar.class);
    target.subjectList = Utils.findRequiredViewAsType(source, R.id.subjectList, "field 'subjectList'", ListView.class);
    target.subjectLayout = Utils.findRequiredViewAsType(source, R.id.subjectLayout, "field 'subjectLayout'", LinearLayout.class);
    target.countriesList = Utils.findRequiredViewAsType(source, R.id.countriesList, "field 'countriesList'", ExpandableListView.class);
    target.countriesLayout = Utils.findRequiredViewAsType(source, R.id.countriesLayout, "field 'countriesLayout'", LinearLayout.class);
    target.monthList = Utils.findRequiredViewAsType(source, R.id.monthList, "field 'monthList'", ListView.class);
    target.monthLayout = Utils.findRequiredViewAsType(source, R.id.monthLayout, "field 'monthLayout'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.btnApply, "field 'btnApply' and method 'onViewClicked'");
    target.btnApply = Utils.castView(view, R.id.btnApply, "field 'btnApply'", Button.class);
    view7f0a006c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnClear, "field 'btnClear' and method 'onViewClicked'");
    target.btnClear = Utils.castView(view, R.id.btnClear, "field 'btnClear'", Button.class);
    view7f0a006d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FilterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rbSubjects = null;
    target.rbCountries = null;
    target.rbMonth = null;
    target.radioGroup = null;
    target.progressBar = null;
    target.subjectList = null;
    target.subjectLayout = null;
    target.countriesList = null;
    target.countriesLayout = null;
    target.monthList = null;
    target.monthLayout = null;
    target.btnApply = null;
    target.btnClear = null;

    view7f0a01c1.setOnClickListener(null);
    view7f0a01c1 = null;
    view7f0a01bf.setOnClickListener(null);
    view7f0a01bf = null;
    view7f0a01c0.setOnClickListener(null);
    view7f0a01c0 = null;
    view7f0a006c.setOnClickListener(null);
    view7f0a006c = null;
    view7f0a006d.setOnClickListener(null);
    view7f0a006d = null;
  }
}
