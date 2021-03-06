// Generated code from Butter Knife. Do not modify!
package com.applications.lexismeeting.activity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.applications.lexismeeting.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserRegistrationActivity_ViewBinding implements Unbinder {
  private UserRegistrationActivity target;

  private View view7f0a0074;

  @UiThread
  public UserRegistrationActivity_ViewBinding(UserRegistrationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UserRegistrationActivity_ViewBinding(final UserRegistrationActivity target, View source) {
    this.target = target;

    View view;
    target.editFirst = Utils.findRequiredViewAsType(source, R.id.editFirst, "field 'editFirst'", TextInputEditText.class);
    target.editEmail = Utils.findRequiredViewAsType(source, R.id.editEmail, "field 'editEmail'", TextInputEditText.class);
    target.editPassword = Utils.findRequiredViewAsType(source, R.id.editPassword, "field 'editPassword'", TextInputEditText.class);
    view = Utils.findRequiredView(source, R.id.buttonNext, "field 'buttonNext' and method 'onViewClicked'");
    target.buttonNext = Utils.castView(view, R.id.buttonNext, "field 'buttonNext'", Button.class);
    view7f0a0074 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.txtSignin = Utils.findRequiredViewAsType(source, R.id.txtSignin, "field 'txtSignin'", TextView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progressBar'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserRegistrationActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editFirst = null;
    target.editEmail = null;
    target.editPassword = null;
    target.buttonNext = null;
    target.txtSignin = null;
    target.progressBar = null;

    view7f0a0074.setOnClickListener(null);
    view7f0a0074 = null;
  }
}
