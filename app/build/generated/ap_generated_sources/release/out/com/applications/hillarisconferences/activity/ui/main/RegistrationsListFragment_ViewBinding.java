// Generated code from Butter Knife. Do not modify!
package com.applications.hillarisconferences.activity.ui.main;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.hillarisconferences.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegistrationsListFragment_ViewBinding implements Unbinder {
  private RegistrationsListFragment target;

  @UiThread
  public RegistrationsListFragment_ViewBinding(RegistrationsListFragment target, View source) {
    this.target = target;

    target.registrationsRecycler = Utils.findRequiredViewAsType(source, R.id.registrationsRecycler, "field 'registrationsRecycler'", RecyclerView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progressBar'", LinearLayout.class);
    target.constraintLayout = Utils.findRequiredViewAsType(source, R.id.constraintLayout, "field 'constraintLayout'", FrameLayout.class);
    target.emptyView = Utils.findRequiredViewAsType(source, R.id.emptyView, "field 'emptyView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RegistrationsListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.registrationsRecycler = null;
    target.progressBar = null;
    target.constraintLayout = null;
    target.emptyView = null;
  }
}
