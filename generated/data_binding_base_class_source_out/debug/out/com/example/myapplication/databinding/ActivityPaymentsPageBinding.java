// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPaymentsPageBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText cvv;

  @NonNull
  public final EditText firstname;

  @NonNull
  public final EditText monthAndYear;

  @NonNull
  public final MaterialButton paybtn;

  @NonNull
  public final TextView payment;

  private ActivityPaymentsPageBinding(@NonNull RelativeLayout rootView, @NonNull EditText cvv,
      @NonNull EditText firstname, @NonNull EditText monthAndYear, @NonNull MaterialButton paybtn,
      @NonNull TextView payment) {
    this.rootView = rootView;
    this.cvv = cvv;
    this.firstname = firstname;
    this.monthAndYear = monthAndYear;
    this.paybtn = paybtn;
    this.payment = payment;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPaymentsPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPaymentsPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_payments_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPaymentsPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cvv;
      EditText cvv = ViewBindings.findChildViewById(rootView, id);
      if (cvv == null) {
        break missingId;
      }

      id = R.id.firstname;
      EditText firstname = ViewBindings.findChildViewById(rootView, id);
      if (firstname == null) {
        break missingId;
      }

      id = R.id.month_and_year;
      EditText monthAndYear = ViewBindings.findChildViewById(rootView, id);
      if (monthAndYear == null) {
        break missingId;
      }

      id = R.id.paybtn;
      MaterialButton paybtn = ViewBindings.findChildViewById(rootView, id);
      if (paybtn == null) {
        break missingId;
      }

      id = R.id.payment;
      TextView payment = ViewBindings.findChildViewById(rootView, id);
      if (payment == null) {
        break missingId;
      }

      return new ActivityPaymentsPageBinding((RelativeLayout) rootView, cvv, firstname,
          monthAndYear, paybtn, payment);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
