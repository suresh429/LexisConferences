// Generated code from Butter Knife. Do not modify!
package com.applications.lexisconferences.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.lexisconferences.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddOnAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private AddOnAdapter.MyViewHolder target;

  @UiThread
  public AddOnAdapter$MyViewHolder_ViewBinding(AddOnAdapter.MyViewHolder target, View source) {
    this.target = target;

    target.txtTitle = Utils.findRequiredViewAsType(source, R.id.txtTitle, "field 'txtTitle'", TextView.class);
    target.txtAmount = Utils.findRequiredViewAsType(source, R.id.txtAmount, "field 'txtAmount'", TextView.class);
    target.btnAddtoPlan = Utils.findRequiredViewAsType(source, R.id.btnAddtoPlan, "field 'btnAddtoPlan'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddOnAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtTitle = null;
    target.txtAmount = null;
    target.btnAddtoPlan = null;
  }
}
