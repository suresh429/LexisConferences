// Generated code from Butter Knife. Do not modify!
package com.applications.hillarisconferences.activity;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.hillarisconferences.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PersonalInfoActivity_ViewBinding implements Unbinder {
  private PersonalInfoActivity target;

  @UiThread
  public PersonalInfoActivity_ViewBinding(PersonalInfoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PersonalInfoActivity_ViewBinding(PersonalInfoActivity target, View source) {
    this.target = target;

    target.editFirst = Utils.findRequiredViewAsType(source, R.id.editFirst1, "field 'editFirst'", TextInputEditText.class);
    target.spinnerCountry = Utils.findRequiredViewAsType(source, R.id.spinnerCountry, "field 'spinnerCountry'", Spinner.class);
    target.editEmail = Utils.findRequiredViewAsType(source, R.id.editEmail1, "field 'editEmail'", TextInputEditText.class);
    target.editPhone = Utils.findRequiredViewAsType(source, R.id.editPhone1, "field 'editPhone'", TextInputEditText.class);
    target.buttonNext = Utils.findRequiredViewAsType(source, R.id.buttonNext, "field 'buttonNext'", Button.class);
    target.nestedScroll = Utils.findRequiredViewAsType(source, R.id.nestedScroll, "field 'nestedScroll'", NestedScrollView.class);
    target.editPhoneId = Utils.findRequiredViewAsType(source, R.id.editPhoneId, "field 'editPhoneId'", TextInputEditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PersonalInfoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editFirst = null;
    target.spinnerCountry = null;
    target.editEmail = null;
    target.editPhone = null;
    target.buttonNext = null;
    target.nestedScroll = null;
    target.editPhoneId = null;
  }
}
