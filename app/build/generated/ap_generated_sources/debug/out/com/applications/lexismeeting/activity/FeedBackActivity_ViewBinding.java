// Generated code from Butter Knife. Do not modify!
package com.applications.lexismeeting.activity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.applications.lexismeeting.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FeedBackActivity_ViewBinding implements Unbinder {
  private FeedBackActivity target;

  private View view7f0a006e;

  @UiThread
  public FeedBackActivity_ViewBinding(FeedBackActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FeedBackActivity_ViewBinding(final FeedBackActivity target, View source) {
    this.target = target;

    View view;
    target.editFirst = Utils.findRequiredViewAsType(source, R.id.editFirst, "field 'editFirst'", TextInputEditText.class);
    view = Utils.findRequiredView(source, R.id.btnDownload, "field 'btnDownload' and method 'onViewClicked'");
    target.btnDownload = Utils.castView(view, R.id.btnDownload, "field 'btnDownload'", Button.class);
    view7f0a006e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progressBar'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FeedBackActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editFirst = null;
    target.btnDownload = null;
    target.progressBar = null;

    view7f0a006e.setOnClickListener(null);
    view7f0a006e = null;
  }
}
