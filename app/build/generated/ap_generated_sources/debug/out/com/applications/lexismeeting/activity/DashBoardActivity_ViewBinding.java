// Generated code from Butter Knife. Do not modify!
package com.applications.lexismeeting.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.applications.lexismeeting.R;
import com.smarteist.autoimageslider.SliderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DashBoardActivity_ViewBinding implements Unbinder {
  private DashBoardActivity target;

  private View view7f0a0154;

  private View view7f0a015a;

  private View view7f0a0159;

  private View view7f0a015b;

  private View view7f0a0157;

  private View view7f0a0158;

  @UiThread
  public DashBoardActivity_ViewBinding(DashBoardActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DashBoardActivity_ViewBinding(final DashBoardActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.linearBrochureDownload, "field 'linearBrochureDownload' and method 'onViewClicked'");
    target.linearBrochureDownload = Utils.castView(view, R.id.linearBrochureDownload, "field 'linearBrochureDownload'", LinearLayout.class);
    view7f0a0154 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.linearSessionsTracks, "field 'linearSessionsTracks' and method 'onViewClicked'");
    target.linearSessionsTracks = Utils.castView(view, R.id.linearSessionsTracks, "field 'linearSessionsTracks'", LinearLayout.class);
    view7f0a015a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.linearChat = Utils.findRequiredViewAsType(source, R.id.linearChat, "field 'linearChat'", LinearLayout.class);
    target.confType = Utils.findRequiredViewAsType(source, R.id.confType, "field 'confType'", TextView.class);
    target.mainContainer = Utils.findRequiredViewAsType(source, R.id.main_container, "field 'mainContainer'", LinearLayout.class);
    target.sliderImage = Utils.findRequiredViewAsType(source, R.id.slider_image, "field 'sliderImage'", SliderView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TextView.class);
    target.location = Utils.findRequiredViewAsType(source, R.id.location, "field 'location'", TextView.class);
    target.subject = Utils.findRequiredViewAsType(source, R.id.subject, "field 'subject'", TextView.class);
    target.progressBar1 = Utils.findRequiredViewAsType(source, R.id.progressBarFull, "field 'progressBar1'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.linearRegister, "field 'linearRegister' and method 'onViewClicked'");
    target.linearRegister = Utils.castView(view, R.id.linearRegister, "field 'linearRegister'", LinearLayout.class);
    view7f0a0159 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.linearSubmitAbstract, "field 'linearSubmitAbstract' and method 'onViewClicked'");
    target.linearSubmitAbstract = Utils.castView(view, R.id.linearSubmitAbstract, "field 'linearSubmitAbstract'", LinearLayout.class);
    view7f0a015b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.linearFeedback, "field 'linearFeedback' and method 'onViewClicked'");
    target.linearFeedback = Utils.castView(view, R.id.linearFeedback, "field 'linearFeedback'", LinearLayout.class);
    view7f0a0157 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.linearPresentation, "field 'linearPresentation' and method 'onViewClicked'");
    target.linearPresentation = Utils.castView(view, R.id.linearPresentation, "field 'linearPresentation'", LinearLayout.class);
    view7f0a0158 = view;
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
    DashBoardActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.linearBrochureDownload = null;
    target.linearSessionsTracks = null;
    target.linearChat = null;
    target.confType = null;
    target.mainContainer = null;
    target.sliderImage = null;
    target.title = null;
    target.date = null;
    target.location = null;
    target.subject = null;
    target.progressBar1 = null;
    target.linearRegister = null;
    target.linearSubmitAbstract = null;
    target.linearFeedback = null;
    target.linearPresentation = null;

    view7f0a0154.setOnClickListener(null);
    view7f0a0154 = null;
    view7f0a015a.setOnClickListener(null);
    view7f0a015a = null;
    view7f0a0159.setOnClickListener(null);
    view7f0a0159 = null;
    view7f0a015b.setOnClickListener(null);
    view7f0a015b = null;
    view7f0a0157.setOnClickListener(null);
    view7f0a0157 = null;
    view7f0a0158.setOnClickListener(null);
    view7f0a0158 = null;
  }
}
