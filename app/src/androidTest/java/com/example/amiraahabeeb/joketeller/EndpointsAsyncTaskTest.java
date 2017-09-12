package com.example.amiraahabeeb.joketeller;

import android.util.Log;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Mahmoud Sadek on 9/12/2017.
 */

public class EndpointsAsyncTaskTest {
    @Test
    public void testDoInBackground() throws Exception{
        try {
            MainActivity mainActivity = new MainActivity();
            EndpointAsyncTask endpointsAsyncTask = new EndpointAsyncTask(mainActivity);
            endpointsAsyncTask.execute();
            String result = endpointsAsyncTask.get(30, TimeUnit.SECONDS);

            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (Exception e){
            Log.e("EndpointsAsyncTaskTest", "testDoInBackground: Timed out");
        }
    }

}
