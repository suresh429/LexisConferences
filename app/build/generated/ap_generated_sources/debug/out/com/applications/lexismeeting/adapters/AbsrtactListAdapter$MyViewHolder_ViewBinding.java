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

public class AbsrtactListAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private AbsrtactListAdapter.MyViewHolder target;

  @UiThread
  public AbsrtactListAdapter$MyViewHolder_ViewBinding(AbsrtactListAdapter.MyViewHolder target,
      View source) {
    this.target = target;

    target.txtTitle = Utils.findRequiredViewAsType(source, R.id.txtTitle, "field 'txtTitle'", TextView.class);
    target.txtTractName = Utils.findRequiredViewAsType(source, R.id.txtTractName, "field 'txtTractName'", TextView.class);
    target.txtConfType = Utils.findRequiredViewAsType(source, R.id.txtConfType, "field 'txtConfType'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AbsrtactListAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtTitle = null;
    target.txtTractName = null;
    target.txtConfType = null;
  }
}
