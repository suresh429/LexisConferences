// Generated code from Butter Knife. Do not modify!
package com.applications.lexisconferences.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.lexisconferences.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeActivity_ViewBinding implements Unbinder {
  private HomeActivity target;

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target, View source) {
    this.target = target;

    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressbar, "field 'progressBar'", ProgressBar.class);
    target.appbarLayout = Utils.findRequiredViewAsType(source, R.id.appbarLayout, "field 'appbarLayout'", AppBarLayout.class);
    target.nestedScroll = Utils.findRequiredViewAsType(source, R.id.nestedScroll, "field 'nestedScroll'", LinearLayout.class);
    target.rv = Utils.findRequiredViewAsType(source, R.id.eventsRecycle1, "field 'rv'", RecyclerView.class);
    target.navView = Utils.findRequiredViewAsType(source, R.id.nav_view, "field 'navView'", NavigationView.class);
    target.drawerLayout = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawerLayout'", DrawerLayout.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.etSearch = Utils.findRequiredViewAsType(source, R.id.etSearch, "field 'etSearch'", TextView.class);
    target.cardSearch = Utils.findRequiredViewAsType(source, R.id.cardSearch, "field 'cardSearch'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressBar = null;
    target.appbarLayout = null;
    target.nestedScroll = null;
    target.rv = null;
    target.navView = null;
    target.drawerLayout = null;
    target.toolbar = null;
    target.etSearch = null;
    target.cardSearch = null;
  }
}
