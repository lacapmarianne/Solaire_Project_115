package sample.com.solaire_project_115;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_activity);
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }
    public void LoginUser(View v)
    {
        EditText userName;
        EditText pass;

        userName = (EditText)findViewById(R.id.reservationName);
        pass = (EditText)findViewById(R.id.bookingNum);

        String username = userName.getText().toString();
        String concat;
        concat = "@gmail.com";

        String finalString =  username + concat;

        String password = pass.getText().toString();
        mAuth.signInWithEmailAndPassword(finalString, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in Success
                            Log.d("4ITF", "signInWithUserName:success");

                            Intent i = new Intent(getBaseContext(), WelcomeActivity.class);
                            startActivity(i);
                        } else {
                            // Sign in Fails
                            Log.w("4ITF", "signInWithUserName:failure", task.getException());
                            Toast.makeText(LogInActivity.this, "Authentication Failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }

                });
    }
}