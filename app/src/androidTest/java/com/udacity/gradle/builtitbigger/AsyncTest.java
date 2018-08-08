package com.udacity.gradle.builtitbigger;


import android.os.AsyncTask;
import android.test.InstrumentationTestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AsyncTest extends InstrumentationTestCase {


    public void testSomeAsyncTask () throws Throwable {

        final CountDownLatch signal = new CountDownLatch(1);

        final AsyncTask<Void, Void, String> myTask = new AsyncTask<Void, Void, String>() {

            @Override
            protected String doInBackground( Void... params) {
                return "A naked woman robbed a bank. Nobody could remember her face.";
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);

                signal.countDown();
            }
        };

        runTestOnUiThread(new Runnable() {

            @Override
            public void run() {
                myTask.execute();
            }
        });

        signal.await(30, TimeUnit.SECONDS);

        assertTrue("Happiness", true);
    }


}
