// Generated code from Butter Knife. Do not modify!
package com.applications.lexismeeting.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.lexismeeting.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CheckoutAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private CheckoutAdapter.MyViewHolder target;

  @UiThread
  public CheckoutAdapter$MyViewHolder_ViewBinding(CheckoutAdapter.MyViewHolder target,
      View source) {
    this.target = target;

    target.txtTitle = Utils.findRequiredViewAsType(source, R.id.txtTitle, "field 'txtTitle'", TextView.class);
    target.txtPrice = Utils.findRequiredViewAsType(source, R.id.txtPrice, "field 'txtPrice'", TextView.class);
    target.txtSubTitle = Utils.findRequiredViewAsType(source, R.id.txtSubTitle, "field 'txtSubTitle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CheckoutAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtTitle = null;
    target.txtPrice = null;
    target.txtSubTitle = null;
  }
}
