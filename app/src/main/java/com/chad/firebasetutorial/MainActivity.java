package com.chad.firebasetutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button mSelectImage;

    /*
    //Firebase UI-List View
    private ListView mListView;
     */


    /*
    //Authentication Part 1
    private EditText mEmailField;
    private EditText mPasswordField;

    private Button mLoginBtn;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
*/


     /*
     //Retrieve data from Firebase to  a list view
    private ListView mListView;

    private ArrayList<String> mUsername = new ArrayList<>();

    private Firebase mRef;
*/


    //Retrieving a single data and multiple from firebase
/*
    private TextView mValueView;

    private Firebase mRef;
*/

/*
    //Firebase Realtime Database intermediate Tutorial
    private Button mAddBtn;
    private EditText mValueField;
    private EditText mKeyValue;
    private Firebase mRootRef;
*/

/*
     //Firebase Realtime Database Basic Tutorial
    private Button mSendData;
    private Firebase mRef;
*/




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Store images to firebase storage

        mSelectImage = (Button) findViewById(R.id.selectImage);


        /*
        //Firebase UI-List View
        mListView = (ListView) findViewById(R.id.listView);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://fir-tutorial-e31bf.firebaseio.com/Users");

        FirebaseListAdapter<String> firebaseListAdapter = new FirebaseListAdapter<String>(
                this,
                String.class,
                android.R.layout.simple_list_item_1,
                databaseReference
        ) {
            @Override
            protected void populateView(View v, String model, int position) {
                TextView textView = (TextView) v.findViewById(android.R.id.text1);
                textView.setText(model);
            }
        };

        mListView.setAdapter(firebaseListAdapter);

        //Ends Here
         */

        /*
        //Authentication Part 1

        mAuth = FirebaseAuth.getInstance();

        mEmailField = (EditText) findViewById(R.id.emailField);
        mPasswordField = (EditText) findViewById(R.id.passwordField);

        mLoginBtn = (Button) findViewById(R.id.loginBtn);

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                if(firebaseAuth.getCurrentUser() != null) {

                    startActivity(new Intent(MainActivity.this, AccountActivity.class));

                }

            }
        };

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startSignIn();

            }
        });
             //Ends Here

 */

        /*
        //Retrieve data from Firebase to  a list view

        //TODO:Add Firebase Database Link
        mRef = new Firebase("Firebase Database link");

        mListView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mUsername);

        mListView.setAdapter(arrayAdapter);

        mRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                String value = dataSnapshot.getValue(String.class);

                mUsername.add(value);

                arrayAdapter.notifyDataSetChanged();

            }
            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }
            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }
            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }
            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }


        });
          //Ends Here
         */

        /*
        //Retrieving a single data and multiple from firebase

        mValueView = (TextView) findViewById(R.id.valueView);

        //TODO:Add Firebase Database Link
        mRef = new Firebase("https://fir-tutorial-e31bf.firebaseio.com/Name");

        mRef.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);

                mValueView.setText(value);

                Map<String, String> map = dataSnapshot.getValue(Map.class);

                String name = map.get("Name");
                String age = map.get("Age");
                String profession = map.get("Profession");



                //Display Data in LogCat 1
                Log.v("E_VALUE, "Data : " + dataSnapshot.getValue());


            }
            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
          //Ends here
*/

/*
            //Firebase Realtime Database intermediate Tutorial
        //TODO:Add Firebase Database Link
        mRootRef = new Firebase("https://fir-tutorial-e31bf.firebaseio.com/Users");

        mValueField = (EditText) findViewById(R.id.valueField);
        mAddBtn = (Button) findViewById(R.id.addBtn);
        mKeyValue = (EditText) findViewById(R.id.keyValue);

        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String value = mValueField.getText().toString();
               String key = mKeyValue.getText().toString();


               //By using one child it keeps replacing the data in the Database so...
                 //Firebase childRef = mRootRef.child("Profession or Name");
                //childRef.setValue(value);
                //So you use a push which will bring a unique id but you need to use the id entered by user so....
                 // mRootRef.push().setValue(value); //Remember to remove push


                Firebase childRef = mRootRef.child(key);

                childRef.setValue(value);



            }
        });
             //Ends Here
*/

/*
        //Firebase Realtime Database Basic Tutorial

        Firebase.setAndroidContext(this);

        //TODO:Add Firebase Database Link
        mRef = new Firebase("https://fir-tutorial-e31bf.firebaseio.com/");
        mSendData = (Button) findViewById(R.id.sendData);

        mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Firebase mRefChild = mRef.child("Name");

                mRefChild.setValue("Chad");

            }
        });

        //Basic Tutorial Ends Here
*/

    }

    /*
    //Authentication Part 1

    @Override
    protected void onStart() {
        super.onStart();

        mAuth.addAuthStateListener(mAuthListener);
    }

    private void startSignIn() {

        String email = mEmailField.getText().toString();
        String password = mPasswordField.getText().toString();

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {

            Toast.makeText(MainActivity.this,"Fields are Empty", Toast.LENGTH_LONG).show();

        }else {

            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if(!task.isSuccessful()) {

                        Toast.makeText(MainActivity.this,"User not Found!", Toast.LENGTH_LONG).show();

                    }


                }
            });

        }

    }
    //Ends Here
     */
}