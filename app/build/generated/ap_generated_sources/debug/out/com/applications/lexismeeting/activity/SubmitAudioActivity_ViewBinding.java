// Generated code from Butter Knife. Do not modify!
package com.applications.lexismeeting.activity;

import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.applications.lexismeeting.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubmitAudioActivity_ViewBinding implements Unbinder {
  private SubmitAudioActivity target;

  private View view7f0a0070;

  private View view7f0a0071;

  @UiThread
  public SubmitAudioActivity_ViewBinding(SubmitAudioActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SubmitAudioActivity_ViewBinding(final SubmitAudioActivity target, View source) {
    this.target = target;

    View view;
    target.chronometerTimer = Utils.findRequiredViewAsType(source, R.id.chronometerTimer, "field 'chronometerTimer'", Chronometer.class);
    view = Utils.findRequiredView(source, R.id.btnStart, "field 'btnStart' and method 'onViewClicked'");
    target.btnStart = Utils.castView(view, R.id.btnStart, "field 'btnStart'", Button.class);
    view7f0a0070 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnStop, "field 'btnStop' and method 'onViewClicked'");
    target.btnStop = Utils.castView(view, R.id.btnStop, "field 'btnStop'", Button.class);
    view7f0a0071 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.title1 = Utils.findRequiredViewAsType(source, R.id.title, "field 'title1'", TextView.class);
    target.firstname = Utils.findRequiredViewAsType(source, R.id.firstname, "field 'firstname'", TextView.class);
    target.email1 = Utils.findRequiredViewAsType(source, R.id.email, "field 'email1'", TextView.class);
    target.country1 = Utils.findRequiredViewAsType(source, R.id.country, "field 'country1'", TextView.class);
    target.phone1 = Utils.findRequiredViewAsType(source, R.id.phone, "field 'phone1'", TextView.class);
    target.address1 = Utils.findRequiredViewAsType(source, R.id.address, "field 'address1'", TextView.class);
    target.filepath = Utils.findRequiredViewAsType(source, R.id.filepath, "field 'filepath'", TextView.class);
    target.buttonNext = Utils.findRequiredViewAsType(source, R.id.buttonNext, "field 'buttonNext'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SubmitAudioActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.chronometerTimer = null;
    target.btnStart = null;
    target.btnStop = null;
    target.title1 = null;
    target.firstname = null;
    target.email1 = null;
    target.country1 = null;
    target.phone1 = null;
    target.address1 = null;
    target.filepath = null;
    target.buttonNext = null;

    view7f0a0070.setOnClickListener(null);
    view7f0a0070 = null;
    view7f0a0071.setOnClickListener(null);
    view7f0a0071 = null;
  }
}
