// Generated by view binder compiler. Do not edit!
package agenor.houessou.projetcovoiture_houessou_monvoisin.databinding;

import agenor.houessou.projetcovoiture_houessou_monvoisin.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final Button connexion;

  @NonNull
  public final Button effacer;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final Button inscription;

  @NonNull
  public final TextView loginConnexion;

  @NonNull
  public final EditText loginEmail;

  @NonNull
  public final TextInputLayout loginEmailLayout;

  @NonNull
  public final TextInputEditText loginPass;

  @NonNull
  public final TextInputLayout loginPassLayout;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull Button connexion, @NonNull Button effacer, @NonNull ImageView imageView2,
      @NonNull Button inscription, @NonNull TextView loginConnexion, @NonNull EditText loginEmail,
      @NonNull TextInputLayout loginEmailLayout, @NonNull TextInputEditText loginPass,
      @NonNull TextInputLayout loginPassLayout) {
    this.rootView = rootView;
    this.button = button;
    this.connexion = connexion;
    this.effacer = effacer;
    this.imageView2 = imageView2;
    this.inscription = inscription;
    this.loginConnexion = loginConnexion;
    this.loginEmail = loginEmail;
    this.loginEmailLayout = loginEmailLayout;
    this.loginPass = loginPass;
    this.loginPassLayout = loginPassLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.connexion;
      Button connexion = ViewBindings.findChildViewById(rootView, id);
      if (connexion == null) {
        break missingId;
      }

      id = R.id.effacer;
      Button effacer = ViewBindings.findChildViewById(rootView, id);
      if (effacer == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.inscription;
      Button inscription = ViewBindings.findChildViewById(rootView, id);
      if (inscription == null) {
        break missingId;
      }

      id = R.id.loginConnexion;
      TextView loginConnexion = ViewBindings.findChildViewById(rootView, id);
      if (loginConnexion == null) {
        break missingId;
      }

      id = R.id.loginEmail;
      EditText loginEmail = ViewBindings.findChildViewById(rootView, id);
      if (loginEmail == null) {
        break missingId;
      }

      id = R.id.loginEmailLayout;
      TextInputLayout loginEmailLayout = ViewBindings.findChildViewById(rootView, id);
      if (loginEmailLayout == null) {
        break missingId;
      }

      id = R.id.loginPass;
      TextInputEditText loginPass = ViewBindings.findChildViewById(rootView, id);
      if (loginPass == null) {
        break missingId;
      }

      id = R.id.loginPassLayout;
      TextInputLayout loginPassLayout = ViewBindings.findChildViewById(rootView, id);
      if (loginPassLayout == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, button, connexion, effacer,
          imageView2, inscription, loginConnexion, loginEmail, loginEmailLayout, loginPass,
          loginPassLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
