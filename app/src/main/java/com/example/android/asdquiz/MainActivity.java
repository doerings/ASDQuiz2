package com.example.android.asdquiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int numCorrect = 0;
    String userName = "N/A";
    String q1a = "N/A";
    String q2a = "N/A";
    String q3a = "N/A";
    String q4a = "N/A";
    String q5a = "N/A";
    String q6a = "N/A";
    String q7a = "N/A";
    String q8a = "N/A";
    String q9a = "N/A";
    String q10a = "N/A";

    EditText eText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            }

    /**
     * This method is called when the first option is chosen for question 1.
     */
        public void q1a1 (View view) {
            q1a = "Yes";
        }
    /**
     * This method is called when the second option is chosen for question 1.
     */
        public void q1a2 (View view) {
            q1a = "No";
        }



    /**
     * This method is called when the first option is chosen for question 2.
     */
        public void q2a1 (View view) {
            q2a = "Genetics";
        }
    /**
     * This method is called when the second option is chosen for question 2.
     */
        public void q2a2 (View view) {
            q2a = "Environment";
        }
    /**
     * This method is called when the third option is chosen for question 2.
     */
        public void q2a3 (View view) {
            q2a = "The cause is unknown";
        }



    /**
     * This method is called when the first option is chosen for question 3.
     */
        public void q3a1 (View view) {
            q3a = "Boys";
        }
    /**
     * This method is called when the second option is chosen for question 3.
     */
        public void q3a2 (View view) {
            q3a = "Girls";
        }


    /**
     * This method is called when the first option is chosen for question 4.
     */
        public void q4a1 (View view) {
            q4a = "8%";
        }
    /**
     * This method is called when the second option is chosen for question 4.
     */
        public void q4a2 (View view) {
            q4a = "14%";
        }
    /**
     * This method is called when the third option is chosen for question 4.
     */
        public void q4a3 (View view) {
            q4a = "23%";
        }



    /**
     * This method is called when the first option is chosen for question 5.
     */
        public void q5a1 (View view) {
            q5a = "Diabetes";
        }
    /**
     * This method is called when the second option is chosen for question 5.
     */
        public void q5a2 (View view) {
            q5a = "AIDS";
        }
    /**
     * This method is called when the third option is chosen for question 5.
     */
        public void q5a3 (View view) {
            q5a = "Autism";
        }


    /**
     * This method is called when the first option is chosen for question 6.
     */
        public void q6a1 (View view) {
            q6a = "Yes";
        }
    /**
     * This method is called when the second option is chosen for question 6.
     */
        public void q6a2 (View view) {
            q6a = "No";
        }


    /**
     * This method is called when the first option is chosen for question 7.
     */
        public void q7a1 (View view) {
            q7a = "50%";
        }
    /**
     * This method is called when the second option is chosen for question 7.
     */
        public void q7a2 (View view) {
            q7a = "90%";
        }
    /**
     * This method is called when the third option is chosen for question 7.
     */
        public void q7a3 (View view) {
            q7a = "There is no correlation";
        }


    /**
     * This method is called when the first option is chosen for question 8.
     */
        public void q8a1 (View view) {
            q8a = "Yes";
        }
    /**
     * This method is called when the second option is chosen for question 8.
     */
        public void q8a2 (View view) {
            q8a = "No";
        }


    /**
     * This method is called when the first option is chosen for question 9.
     */
        public void q9a1 (View view) {
            q9a = "January";
        }
    /**
     * This method is called when the second option is chosen for question 9.
     */
        public void q9a2 (View view) {
            q9a = "April";
        }
    /**
     * This method is called when the third option is chosen for question 9.
     */
        public void q9a3 (View view) {
            q9a = "September";
        }



    /**
     * This method is called when the first option is chosen for question 10.
     */
        public void q10a1 (View view) {
            q10a = "1 in 46";
        }
    /**
     * This method is called when the second option is chosen for question 10.
     */
        public void q10a2 (View view) {
            q10a = "1 in 68";
        }
    /**
     * This method is called when the third option is chosen for question 10.
     */
        public void q10a3 (View view) {
            q10a = "1 in 84";
        }








    public void composeEmail() {
        String emailString = "Results for ASD Quiz:\n";

        emailString += "\nUser's Name: ";
        emailString += userName;

        emailString += "\n\nQuestion 1 Selected Answer: ";
        if (q1a == "No") {
            numCorrect += 1;
        }
        emailString += q1a;

        emailString += "\nQuestion 2 Selected Answer: ";
        if (q2a == "The cause is unknown") {
            numCorrect += 1;
        }
        emailString += q2a;

        emailString += "\nQuestion 3 Selected Answer: ";
        if (q3a == "Boys") {
            numCorrect += 1;
        }
        emailString += q3a;

        emailString += "\nQuestion 4 Selected Answer: ";
        if (q4a == "14%") {
            numCorrect += 1;
        }
        emailString += q4a;

        emailString += "\nQuestion 5 Selected Answer: ";
        if (q5a == "Autism") {
            numCorrect += 1;
        }
        emailString += q5a;

        emailString += "\nQuestion 6 Selected Answer: ";
        if (q6a == "No") {
            numCorrect += 1;
        }
        emailString += q6a;

        emailString += "\nQuestion 7 Selected Answer: ";
        if (q7a == "90%") {
            numCorrect += 1;
        }
        emailString += q7a;

        emailString += "\nQuestion 8 Selected Answer: ";
        if (q8a == "No") {
            numCorrect += 1;
        }
        emailString += q8a;

        emailString += "\nQuestion 9 Selected Answer: ";
        if (q9a == "April") {
            numCorrect += 1;
        }
        emailString += q9a;

        emailString += "\nQuestion 10 Selected Answer: ";
        if (q10a == "1 in 68") {
            numCorrect += 1;
        }
        emailString += q10a;

        emailString += "\n\nTotal Correct: ";
        emailString += numCorrect;


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:doerings@uci.edu")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "doerings@uci.edu");
        intent.putExtra(Intent.EXTRA_SUBJECT, "ASD Quiz Results");
        intent.putExtra(Intent.EXTRA_TEXT, emailString);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }




    /**
     * This method is called when the third option is chosen for question 10.
     */
    public void sendResults (View view) {
        eText = (EditText) findViewById(R.id.edittext);
        userName = eText.getText().toString();
        Intent intent = new Intent(this, DisplayResultsActivity.class);
        this.startActivity ( intent );
        composeEmail();

    }
}
