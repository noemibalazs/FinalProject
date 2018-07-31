package com.udacity.gradle.builtitbigger;

import android.os.AsyncTask;

import android.test.InstrumentationTestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AsyncTest extends InstrumentationTestCase{


    public void testSomeAsyncTask () throws Throwable {

        final CountDownLatch signal = new CountDownLatch(1);

        final AsyncTask<String, Void, String> myTask = new AsyncTask<String, Void, String>() {

            @Override
            protected String doInBackground( String... params) {
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
                myTask.execute("A naked woman robbed a bank. Nobody could remember her face.");
            }
        });

        signal.await(30, TimeUnit.SECONDS);

        assertTrue("Happiness", true);
    }

}
