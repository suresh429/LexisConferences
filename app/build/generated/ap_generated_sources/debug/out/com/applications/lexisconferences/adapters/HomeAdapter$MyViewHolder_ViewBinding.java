// Generated code from Butter Knife. Do not modify!
package com.applications.lexisconferences.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applications.lexisconferences.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private HomeAdapter.MyViewHolder target;

  @UiThread
  public HomeAdapter$MyViewHolder_ViewBinding(HomeAdapter.MyViewHolder target, View source) {
    this.target = target;

    target.articleImage = Utils.findRequiredViewAsType(source, R.id.articleImage1, "field 'articleImage'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBar1, "field 'progressBar'", ProgressBar.class);
    target.articleTitle = Utils.findRequiredViewAsType(source, R.id.articleTitle1, "field 'articleTitle'", TextView.class);
    target.articleDate = Utils.findRequiredViewAsType(source, R.id.articleDate1, "field 'articleDate'", TextView.class);
    target.articleCity = Utils.findRequiredViewAsType(source, R.id.articleCity1, "field 'articleCity'", TextView.class);
    target.articleType = Utils.findRequiredViewAsType(source, R.id.articleType1, "field 'articleType'", TextView.class);
    target.parentLayout = Utils.findRequiredViewAsType(source, R.id.parentLayout, "field 'parentLayout'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.articleImage = null;
    target.progressBar = null;
    target.articleTitle = null;
    target.articleDate = null;
    target.articleCity = null;
    target.articleType = null;
    target.parentLayout = null;
  }
}
