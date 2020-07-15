// Generated code from Butter Knife. Do not modify!
package com.applications.lexismeeting.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.lexismeeting.R;
import com.google.android.exoplayer2.ui.PlayerView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubmitVideoActivity_ViewBinding implements Unbinder {
  private SubmitVideoActivity target;

  @UiThread
  public SubmitVideoActivity_ViewBinding(SubmitVideoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SubmitVideoActivity_ViewBinding(SubmitVideoActivity target, View source) {
    this.target = target;

    target.pvMain = Utils.findRequiredViewAsType(source, R.id.pv_main, "field 'pvMain'", PlayerView.class);
    target.captureVideo = Utils.findRequiredViewAsType(source, R.id.capture_video, "field 'captureVideo'", Button.class);
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
    SubmitVideoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.pvMain = null;
    target.captureVideo = null;
    target.title1 = null;
    target.firstname = null;
    target.email1 = null;
    target.country1 = null;
    target.phone1 = null;
    target.address1 = null;
    target.filepath = null;
    target.buttonNext = null;
  }
}
