// Generated code from Butter Knife. Do not modify!
package com.applications.hillarisconferences.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.hillarisconferences.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PaymentActivity1_ViewBinding implements Unbinder {
  private PaymentActivity1 target;

  @UiThread
  public PaymentActivity1_ViewBinding(PaymentActivity1 target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PaymentActivity1_ViewBinding(PaymentActivity1 target, View source) {
    this.target = target;

    target.radio0 = Utils.findRequiredViewAsType(source, R.id.radio0, "field 'radio0'", RadioButton.class);
    target.radio1 = Utils.findRequiredViewAsType(source, R.id.radio1, "field 'radio1'", RadioButton.class);
    target.radio2 = Utils.findRequiredViewAsType(source, R.id.radio2, "field 'radio2'", RadioButton.class);
    target.currencyGroup = Utils.findRequiredViewAsType(source, R.id.currency_group, "field 'currencyGroup'", RadioGroup.class);
    target.spinnerCategory = Utils.findRequiredViewAsType(source, R.id.spinnerCategory, "field 'spinnerCategory'", Spinner.class);
    target.spinnerCategoryProduct = Utils.findRequiredViewAsType(source, R.id.spinnerCategoryProduct, "field 'spinnerCategoryProduct'", Spinner.class);
    target.txtDate1 = Utils.findRequiredViewAsType(source, R.id.txtDate1, "field 'txtDate1'", TextView.class);
    target.txtDate2 = Utils.findRequiredViewAsType(source, R.id.txtDate2, "field 'txtDate2'", TextView.class);
    target.txthide = Utils.findRequiredViewAsType(source, R.id.txthide, "field 'txthide'", TextView.class);
    target.txtPrice1 = Utils.findRequiredViewAsType(source, R.id.txtPrice1, "field 'txtPrice1'", TextView.class);
    target.txtPrice2 = Utils.findRequiredViewAsType(source, R.id.txtPrice2, "field 'txtPrice2'", TextView.class);
    target.textAdd1 = Utils.findRequiredViewAsType(source, R.id.textAdd1, "field 'textAdd1'", CheckBox.class);
    target.itemChildLayout1 = Utils.findRequiredViewAsType(source, R.id.itemChildLayout1, "field 'itemChildLayout1'", LinearLayout.class);
    target.catCard = Utils.findRequiredViewAsType(source, R.id.catCard, "field 'catCard'", CardView.class);
    target.txtTotalPrice = Utils.findRequiredViewAsType(source, R.id.txtTotalPrice, "field 'txtTotalPrice'", TextView.class);
    target.btnProceed = Utils.findRequiredViewAsType(source, R.id.btnProceed, "field 'btnProceed'", Button.class);
    target.bottamLayout = Utils.findRequiredViewAsType(source, R.id.bottamLayout, "field 'bottamLayout'", LinearLayout.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progressBar'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PaymentActivity1 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.radio0 = null;
    target.radio1 = null;
    target.radio2 = null;
    target.currencyGroup = null;
    target.spinnerCategory = null;
    target.spinnerCategoryProduct = null;
    target.txtDate1 = null;
    target.txtDate2 = null;
    target.txthide = null;
    target.txtPrice1 = null;
    target.txtPrice2 = null;
    target.textAdd1 = null;
    target.itemChildLayout1 = null;
    target.catCard = null;
    target.txtTotalPrice = null;
    target.btnProceed = null;
    target.bottamLayout = null;
    target.progressBar = null;
  }
}
