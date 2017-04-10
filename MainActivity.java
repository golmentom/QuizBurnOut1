package com.example.android.amiburnout;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.name;
import static android.R.id.message;
import static android.R.string.no;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    //Question 1 Option A
    public void oneRadioButtonClicked1(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_1_AllTime:
                if (checked)
                    score = score + 1;
                break;
            case R.id.radio_1_Often:
                if (checked)
                    score = score + 2;
                break;
            case R.id.radio_1_Sometimes:
                if (checked)
                    score = score + 3;
                break;
            case R.id.radio_1_Never:
                if (checked)
                    score = score + 4;
                break;
            default:
                System.out.println("default");

        }

    }


    // Question 2
    public void oneRadioButtonClicked2(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_2_AllTime:
                if (checked)
                    score = score + 1;

                break;
            case R.id.radio_2_Often:
                if (checked)
                    score = score + 2;

                break;
            case R.id.radio_2_Sometimes:
                if (checked)
                    score = score + 3;

                break;
            case R.id.radio_2_Never:
                if (checked)
                    score = score + 4;

                break;
            default:
                System.out.println("default");

        }

    }


    //Question 3
    public void oneRadioButtonClicked3(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_3_AllTime:
                if (checked)
                    score = score + 1;

                break;
            case R.id.radio_3_Often:
                if (checked)
                    score = score + 2;

                break;
            case R.id.radio_3_Sometimes:
                if (checked)
                    score = score + 3;

                break;
            case R.id.radio_3_Never:
                if (checked)
                    score = score + 4;

                break;
            default:
                System.out.println("default");

        }

    }

    //Question 4
    public void oneRadioButtonClicked4(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_4_AllTime:
                if (checked)
                    score = score + 1;

                break;
            case R.id.radio_4_Often:
                if (checked)
                    score = score + 2;

                break;
            case R.id.radio_4_Sometimes:
                if (checked)
                    score = score + 3;

                break;
            case R.id.radio_4_Never:
                if (checked)
                    score = score + 4;

                break;
            default:
                System.out.println("default");

        }

    }


    //Question 5
    public void oneRadioButtonClicked5(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_5_AllTime:
                if (checked)
                    score = score + 1;

                break;
            case R.id.radio_5_Often:
                if (checked)
                    score = score + 2;

                break;
            case R.id.radio_5_Sometimes:
                if (checked)
                    score = score + 3;

                break;
            case R.id.radio_5_Never:
                if (checked)
                    score = score + 4;

                break;
            default:
                System.out.println("default");

        }

    }


    //Question 6
    public void oneRadioButtonClicked6(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_6_AllTime:
                if (checked)
                    score = score + 4;

                break;
            case R.id.radio_6_Often:
                if (checked)
                    score = score + 3;

                break;
            case R.id.radio_6_Sometimes:
                if (checked)
                    score = score + 2;

                break;
            case R.id.radio_6_Never:
                if (checked)
                    score = score + 1;

                break;
            default:
                System.out.println("default");

        }

    }


    //Question 7
    public void oneRadioButtonClicked7(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_7_AllTime:
                if (checked)
                    score = score + 4;

                break;
            case R.id.radio_7_Often:
                if (checked)
                    score = score + 3;

                break;
            case R.id.radio_7_Sometimes:
                if (checked)
                    score = score + 2;

                break;
            case R.id.radio_7_Never:
                if (checked)
                    score = score + 1;

                break;
            default:
                System.out.println("default");

        }

    }


    //Question 8
    public void oneRadioButtonClicked8(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_8_AllTime:
                if (checked)
                    score = score + 4;

                break;
            case R.id.radio_8_Often:
                if (checked)
                    score = score + 3;

                break;
            case R.id.radio_8_Sometimes:
                if (checked)
                    score = score + 2;

                break;
            case R.id.radio_8_Never:
                if (checked)
                    score = score + 1;

                break;
            default:
                System.out.println("default");

        }

    }

    // Question 9
    public void oneRadioButtonClicked9(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_9_AllTime:
                if (checked)
                    score = score + 1;

            case R.id.radio_9_Often:
                if (checked)
                    score = score + 2;

                break;
            case R.id.radio_9_Sometimes:
                if (checked)
                    score = score + 3;

                break;
            case R.id.radio_9_Never:
                if (checked)
                    score = score + 4;

                break;
            default:
                System.out.println("default");

        }

    }

    //Create final message
    public String createMessage(int score) {
        String finalMesaage = "";

        if (score <= 15) {
            finalMesaage = getString(R.string.YouGot) + score + getString(R.string.Points1);
            finalMesaage += getString(R.string.Points1Final);
        }
        if (score >= 16 && score < 29) {
            finalMesaage = getString(R.string.YouGot) + score + getString(R.string.Points2);
            finalMesaage += getString(R.string.Points2Final);
        }
        if (score >= 30 && score <= 40) {
            finalMesaage = getString(R.string.YouGot) + score + getString(R.string.Points3);
        }
        return finalMesaage;
    }

    //Gives the answer
    public void submitAnswer(View view) {
        TextView message = (TextView) findViewById(R.id.Message);
        message.setText(createMessage(score));

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}

