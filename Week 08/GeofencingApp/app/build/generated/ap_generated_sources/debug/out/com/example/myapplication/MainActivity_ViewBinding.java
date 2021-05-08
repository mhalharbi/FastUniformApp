// Generated code from Butter Knife. Do not modify!
package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f08005b;

  private View view7f08005c;

  private View view7f08005a;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.txtLocationResult = Utils.findRequiredViewAsType(source, R.id.location_result, "field 'txtLocationResult'", TextView.class);
    target.txtUpdatedOn = Utils.findRequiredViewAsType(source, R.id.updated_on, "field 'txtUpdatedOn'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_start_location_updates, "field 'btnStartUpdates' and method 'startLocationButtonClick'");
    target.btnStartUpdates = Utils.castView(view, R.id.btn_start_location_updates, "field 'btnStartUpdates'", Button.class);
    view7f08005b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startLocationButtonClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_stop_location_updates, "field 'btnStopUpdates' and method 'stopLocationButtonClick'");
    target.btnStopUpdates = Utils.castView(view, R.id.btn_stop_location_updates, "field 'btnStopUpdates'", Button.class);
    view7f08005c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.stopLocationButtonClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_get_last_location, "method 'showLastKnownLocation'");
    view7f08005a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showLastKnownLocation();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtLocationResult = null;
    target.txtUpdatedOn = null;
    target.btnStartUpdates = null;
    target.btnStopUpdates = null;

    view7f08005b.setOnClickListener(null);
    view7f08005b = null;
    view7f08005c.setOnClickListener(null);
    view7f08005c = null;
    view7f08005a.setOnClickListener(null);
    view7f08005a = null;
  }
}
