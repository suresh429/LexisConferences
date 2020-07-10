// Generated code from Butter Knife. Do not modify!
package com.applications.hillarisconferences.activity;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.hillarisconferences.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubmitAbstractActivity_ViewBinding implements Unbinder {
  private SubmitAbstractActivity target;

  @UiThread
  public SubmitAbstractActivity_ViewBinding(SubmitAbstractActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SubmitAbstractActivity_ViewBinding(SubmitAbstractActivity target, View source) {
    this.target = target;

    target.spinnerTitle = Utils.findRequiredViewAsType(source, R.id.spinnerTitle, "field 'spinnerTitle'", Spinner.class);
    target.editFirst = Utils.findRequiredViewAsType(source, R.id.editFirst, "field 'editFirst'", TextInputEditText.class);
    target.spinnerCountry = Utils.findRequiredViewAsType(source, R.id.spinnerCountry, "field 'spinnerCountry'", Spinner.class);
    target.editEmail = Utils.findRequiredViewAsType(source, R.id.editEmail, "field 'editEmail'", TextInputEditText.class);
    target.editPhone = Utils.findRequiredViewAsType(source, R.id.editPhone, "field 'editPhone'", TextInputEditText.class);
    target.spinnerAbstractCategory = Utils.findRequiredViewAsType(source, R.id.spinnerAbstractCategory, "field 'spinnerAbstractCategory'", Spinner.class);
    target.spinnerTrackName = Utils.findRequiredViewAsType(source, R.id.spinnerTrackName, "field 'spinnerTrackName'", Spinner.class);
    target.editAddress = Utils.findRequiredViewAsType(source, R.id.editAddress, "field 'editAddress'", TextInputEditText.class);
    target.buttonAttach = Utils.findRequiredViewAsType(source, R.id.buttonAttach, "field 'buttonAttach'", Button.class);
    target.buttonNext = Utils.findRequiredViewAsType(source, R.id.buttonNext, "field 'buttonNext'", Button.class);
    target.nestedScroll = Utils.findRequiredViewAsType(source, R.id.nestedScroll, "field 'nestedScroll'", NestedScrollView.class);
    target.txtFileChosen = Utils.findRequiredViewAsType(source, R.id.txtFileChosen, "field 'txtFileChosen'", TextView.class);
    target.downloadTemplate = Utils.findRequiredViewAsType(source, R.id.downloadTemplate, "field 'downloadTemplate'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SubmitAbstractActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinnerTitle = null;
    target.editFirst = null;
    target.spinnerCountry = null;
    target.editEmail = null;
    target.editPhone = null;
    target.spinnerAbstractCategory = null;
    target.spinnerTrackName = null;
    target.editAddress = null;
    target.buttonAttach = null;
    target.buttonNext = null;
    target.nestedScroll = null;
    target.txtFileChosen = null;
    target.downloadTemplate = null;
  }
}
