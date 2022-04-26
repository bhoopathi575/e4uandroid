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

public final class ActivitySignupScreenBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView backtosignin;

  @NonNull
  public final EditText emailid;

  @NonNull
  public final EditText firstname;

  @NonNull
  public final EditText lastname;

  @NonNull
  public final EditText mobilenumber;

  @NonNull
  public final EditText password;

  @NonNull
  public final EditText reEnterPassword;

  @NonNull
  public final TextView signup;

  @NonNull
  public final MaterialButton signupbtn;

  private ActivitySignupScreenBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView backtosignin, @NonNull EditText emailid, @NonNull EditText firstname,
      @NonNull EditText lastname, @NonNull EditText mobilenumber, @NonNull EditText password,
      @NonNull EditText reEnterPassword, @NonNull TextView signup,
      @NonNull MaterialButton signupbtn) {
    this.rootView = rootView;
    this.backtosignin = backtosignin;
    this.emailid = emailid;
    this.firstname = firstname;
    this.lastname = lastname;
    this.mobilenumber = mobilenumber;
    this.password = password;
    this.reEnterPassword = reEnterPassword;
    this.signup = signup;
    this.signupbtn = signupbtn;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backtosignin;
      TextView backtosignin = ViewBindings.findChildViewById(rootView, id);
      if (backtosignin == null) {
        break missingId;
      }

      id = R.id.emailid;
      EditText emailid = ViewBindings.findChildViewById(rootView, id);
      if (emailid == null) {
        break missingId;
      }

      id = R.id.firstname;
      EditText firstname = ViewBindings.findChildViewById(rootView, id);
      if (firstname == null) {
        break missingId;
      }

      id = R.id.lastname;
      EditText lastname = ViewBindings.findChildViewById(rootView, id);
      if (lastname == null) {
        break missingId;
      }

      id = R.id.mobilenumber;
      EditText mobilenumber = ViewBindings.findChildViewById(rootView, id);
      if (mobilenumber == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.re_enter_password;
      EditText reEnterPassword = ViewBindings.findChildViewById(rootView, id);
      if (reEnterPassword == null) {
        break missingId;
      }

      id = R.id.signup;
      TextView signup = ViewBindings.findChildViewById(rootView, id);
      if (signup == null) {
        break missingId;
      }

      id = R.id.signupbtn;
      MaterialButton signupbtn = ViewBindings.findChildViewById(rootView, id);
      if (signupbtn == null) {
        break missingId;
      }

      return new ActivitySignupScreenBinding((RelativeLayout) rootView, backtosignin, emailid,
          firstname, lastname, mobilenumber, password, reEnterPassword, signup, signupbtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
