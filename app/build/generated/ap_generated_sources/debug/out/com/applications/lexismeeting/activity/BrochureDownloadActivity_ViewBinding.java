// Generated code from Butter Knife. Do not modify!
package com.applications.lexismeeting.activity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.applications.lexismeeting.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BrochureDownloadActivity_ViewBinding implements Unbinder {
  private BrochureDownloadActivity target;

  private View view7f0a006c;

  @UiThread
  public BrochureDownloadActivity_ViewBinding(BrochureDownloadActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BrochureDownloadActivity_ViewBinding(final BrochureDownloadActivity target, View source) {
    this.target = target;

    View view;
    target.spinnerTitle = Utils.findRequiredViewAsType(source, R.id.spinnerTitle, "field 'spinnerTitle'", Spinner.class);
    target.editFirst = Utils.findRequiredViewAsType(source, R.id.editFirst, "field 'editFirst'", TextInputEditText.class);
    target.editCompany = Utils.findRequiredViewAsType(source, R.id.editCompany, "field 'editCompany'", TextInputEditText.class);
    target.spinnerCountry = Utils.findRequiredViewAsType(source, R.id.spinnerCountry, "field 'spinnerCountry'", Spinner.class);
    target.editEmail = Utils.findRequiredViewAsType(source, R.id.editEmail, "field 'editEmail'", TextInputEditText.class);
    target.editPhone = Utils.findRequiredViewAsType(source, R.id.editPhone, "field 'editPhone'", TextInputEditText.class);
    target.editQuires = Utils.findRequiredViewAsType(source, R.id.editQuires, "field 'editQuires'", TextInputEditText.class);
    view = Utils.findRequiredView(source, R.id.btnDownload, "field 'btnDownload' and method 'onViewClicked'");
    target.btnDownload = Utils.castView(view, R.id.btnDownload, "field 'btnDownload'", Button.class);
    view7f0a006c = view;
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
    BrochureDownloadActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinnerTitle = null;
    target.editFirst = null;
    target.editCompany = null;
    target.spinnerCountry = null;
    target.editEmail = null;
    target.editPhone = null;
    target.editQuires = null;
    target.btnDownload = null;
    target.progressBar = null;

    view7f0a006c.setOnClickListener(null);
    view7f0a006c = null;
  }
}
