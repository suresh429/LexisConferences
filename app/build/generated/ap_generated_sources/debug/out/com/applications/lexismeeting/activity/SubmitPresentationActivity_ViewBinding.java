// Generated code from Butter Knife. Do not modify!
package com.applications.lexismeeting.activity;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.lexismeeting.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubmitPresentationActivity_ViewBinding implements Unbinder {
  private SubmitPresentationActivity target;

  @UiThread
  public SubmitPresentationActivity_ViewBinding(SubmitPresentationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SubmitPresentationActivity_ViewBinding(SubmitPresentationActivity target, View source) {
    this.target = target;

    target.txtFileChosen = Utils.findRequiredViewAsType(source, R.id.txtFileChosen, "field 'txtFileChosen'", TextView.class);
    target.spinnerTitle = Utils.findRequiredViewAsType(source, R.id.spinnerTitle, "field 'spinnerTitle'", Spinner.class);
    target.editFirst = Utils.findRequiredViewAsType(source, R.id.editFirst, "field 'editFirst'", TextInputEditText.class);
    target.spinnerCountry = Utils.findRequiredViewAsType(source, R.id.spinnerCountry, "field 'spinnerCountry'", Spinner.class);
    target.editEmail = Utils.findRequiredViewAsType(source, R.id.editEmail, "field 'editEmail'", TextInputEditText.class);
    target.editPhone = Utils.findRequiredViewAsType(source, R.id.editPhone, "field 'editPhone'", TextInputEditText.class);
    target.editAddress = Utils.findRequiredViewAsType(source, R.id.editAddress, "field 'editAddress'", TextInputEditText.class);
    target.buttonAttach = Utils.findRequiredViewAsType(source, R.id.buttonAttach, "field 'buttonAttach'", Button.class);
    target.nestedScroll = Utils.findRequiredViewAsType(source, R.id.nestedScroll, "field 'nestedScroll'", NestedScrollView.class);
    target.buttonRecord = Utils.findRequiredViewAsType(source, R.id.buttonRecord, "field 'buttonRecord'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SubmitPresentationActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtFileChosen = null;
    target.spinnerTitle = null;
    target.editFirst = null;
    target.spinnerCountry = null;
    target.editEmail = null;
    target.editPhone = null;
    target.editAddress = null;
    target.buttonAttach = null;
    target.nestedScroll = null;
    target.buttonRecord = null;
  }
}
