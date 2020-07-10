// Generated code from Butter Knife. Do not modify!
package com.applications.hillarisconferences.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.hillarisconferences.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegistrationsListAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private RegistrationsListAdapter.MyViewHolder target;

  @UiThread
  public RegistrationsListAdapter$MyViewHolder_ViewBinding(
      RegistrationsListAdapter.MyViewHolder target, View source) {
    this.target = target;

    target.txtTitle = Utils.findRequiredViewAsType(source, R.id.txtTitle, "field 'txtTitle'", TextView.class);
    target.txtPrice = Utils.findRequiredViewAsType(source, R.id.txtPrice, "field 'txtPrice'", TextView.class);
    target.txtOrderNo = Utils.findRequiredViewAsType(source, R.id.txtOrderNo, "field 'txtOrderNo'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RegistrationsListAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtTitle = null;
    target.txtPrice = null;
    target.txtOrderNo = null;
  }
}
