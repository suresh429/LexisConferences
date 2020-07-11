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

public class ContactUsActivity_ViewBinding implements Unbinder {
  private ContactUsActivity target;

  private View view7f0a006c;

  private View view7f0a0236;

  private View view7f0a0237;

  private View view7f0a0225;

  private View view7f0a0226;

  @UiThread
  public ContactUsActivity_ViewBinding(ContactUsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ContactUsActivity_ViewBinding(final ContactUsActivity target, View source) {
    this.target = target;

    View view;
    target.editFirst = Utils.findRequiredViewAsType(source, R.id.editFirst, "field 'editFirst'", TextInputEditText.class);
    target.editEmail = Utils.findRequiredViewAsType(source, R.id.editEmail, "field 'editEmail'", TextInputEditText.class);
    target.editPhone = Utils.findRequiredViewAsType(source, R.id.editPhone, "field 'editPhone'", TextInputEditText.class);
    target.editQuires = Utils.findRequiredViewAsType(source, R.id.editQuires, "field 'editQuires'", TextInputEditText.class);
    view = Utils.findRequiredView(source, R.id.btnDownload, "field 'btnDownload' and method 'onViewClicked'");
    target.btnDownload = Utils.castView(view, R.id.btnDownload, "field 'btnDownload'", Button.class);
    view7f0a006c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progressBar'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.txtmail1, "field 'txtmail1' and method 'onViewClicked'");
    target.txtmail1 = Utils.castView(view, R.id.txtmail1, "field 'txtmail1'", TextView.class);
    view7f0a0236 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.txtmail2, "field 'txtmail2' and method 'onViewClicked'");
    target.txtmail2 = Utils.castView(view, R.id.txtmail2, "field 'txtmail2'", TextView.class);
    view7f0a0237 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.txtDail1, "field 'txtDail1' and method 'onViewClicked'");
    target.txtDail1 = Utils.castView(view, R.id.txtDail1, "field 'txtDail1'", TextView.class);
    view7f0a0225 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.txtDail2, "field 'txtDail2' and method 'onViewClicked'");
    target.txtDail2 = Utils.castView(view, R.id.txtDail2, "field 'txtDail2'", TextView.class);
    view7f0a0226 = view;
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
    ContactUsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editFirst = null;
    target.editEmail = null;
    target.editPhone = null;
    target.editQuires = null;
    target.btnDownload = null;
    target.progressBar = null;
    target.txtmail1 = null;
    target.txtmail2 = null;
    target.txtDail1 = null;
    target.txtDail2 = null;

    view7f0a006c.setOnClickListener(null);
    view7f0a006c = null;
    view7f0a0236.setOnClickListener(null);
    view7f0a0236 = null;
    view7f0a0237.setOnClickListener(null);
    view7f0a0237 = null;
    view7f0a0225.setOnClickListener(null);
    view7f0a0225 = null;
    view7f0a0226.setOnClickListener(null);
    view7f0a0226 = null;
  }
}
