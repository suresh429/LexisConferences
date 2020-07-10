// Generated code from Butter Knife. Do not modify!
package com.applications.hillarisconferences.activity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.hillarisconferences.R;
import com.stripe.android.view.CardInputWidget;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CheckOutActivity_ViewBinding implements Unbinder {
  private CheckOutActivity target;

  @UiThread
  public CheckOutActivity_ViewBinding(CheckOutActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CheckOutActivity_ViewBinding(CheckOutActivity target, View source) {
    this.target = target;

    target.checkoutRecycler = Utils.findRequiredViewAsType(source, R.id.checkoutRecycler, "field 'checkoutRecycler'", RecyclerView.class);
    target.cardInputWidget = Utils.findRequiredViewAsType(source, R.id.cardInputWidget, "field 'cardInputWidget'", CardInputWidget.class);
    target.payButton = Utils.findRequiredViewAsType(source, R.id.payButton, "field 'payButton'", Button.class);
    target.txtTitle = Utils.findRequiredViewAsType(source, R.id.txtTitle, "field 'txtTitle'", TextView.class);
    target.txtPrice = Utils.findRequiredViewAsType(source, R.id.txtPrice, "field 'txtPrice'", TextView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progressBar'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CheckOutActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.checkoutRecycler = null;
    target.cardInputWidget = null;
    target.payButton = null;
    target.txtTitle = null;
    target.txtPrice = null;
    target.progressBar = null;
  }
}
