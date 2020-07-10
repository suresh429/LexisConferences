// Generated code from Butter Knife. Do not modify!
package com.applications.hillarisconferences.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.hillarisconferences.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EPosterAdapter$SingleViewHolder_ViewBinding implements Unbinder {
  private EPosterAdapter.SingleViewHolder target;

  @UiThread
  public EPosterAdapter$SingleViewHolder_ViewBinding(EPosterAdapter.SingleViewHolder target,
      View source) {
    this.target = target;

    target.txtSubTitle = Utils.findRequiredViewAsType(source, R.id.txtSubTitle, "field 'txtSubTitle'", TextView.class);
    target.txtPrice1 = Utils.findRequiredViewAsType(source, R.id.txtPrice1, "field 'txtPrice1'", TextView.class);
    target.txtPrice2 = Utils.findRequiredViewAsType(source, R.id.txtPrice2, "field 'txtPrice2'", TextView.class);
    target.txtPrice3 = Utils.findRequiredViewAsType(source, R.id.txtPrice3, "field 'txtPrice3'", TextView.class);
    target.itemChildLayout = Utils.findRequiredViewAsType(source, R.id.itemChildLayout, "field 'itemChildLayout'", LinearLayout.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.imageView, "field 'imageView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EPosterAdapter.SingleViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtSubTitle = null;
    target.txtPrice1 = null;
    target.txtPrice2 = null;
    target.txtPrice3 = null;
    target.itemChildLayout = null;
    target.imageView = null;
  }
}
