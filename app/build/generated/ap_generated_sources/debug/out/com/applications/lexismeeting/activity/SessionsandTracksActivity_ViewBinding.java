// Generated code from Butter Knife. Do not modify!
package com.applications.lexismeeting.activity;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.lexismeeting.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SessionsandTracksActivity_ViewBinding implements Unbinder {
  private SessionsandTracksActivity target;

  @UiThread
  public SessionsandTracksActivity_ViewBinding(SessionsandTracksActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SessionsandTracksActivity_ViewBinding(SessionsandTracksActivity target, View source) {
    this.target = target;

    target.sessionandTrackList = Utils.findRequiredViewAsType(source, R.id.sessionandTrackList, "field 'sessionandTrackList'", ExpandableListView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progressBar'", LinearLayout.class);
    target.emptyView = Utils.findRequiredViewAsType(source, R.id.emptyView, "field 'emptyView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SessionsandTracksActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.sessionandTrackList = null;
    target.progressBar = null;
    target.emptyView = null;
  }
}
