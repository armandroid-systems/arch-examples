package com.globant.earthmonitor;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.globant.earthmonitor.activities.FirstActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by zadtankus on 21/02/16.
 */
@RunWith(AndroidJUnit4.class)
public class SimpleTest {

    @Rule
    public ActivityTestRule<FirstActivity> mRule = new ActivityTestRule<>(FirstActivity.class);

    @Test
    public void ensureClick(){
        onView(withId(R.id.recyclerSummary)).perform(
                RecyclerViewActions.actionOnItemAtPosition(0,click()));
        /*onView(withId(R.id.textViewMore)).perform(click());
        onView(withId(R.id.textViewMore)).check(matches(withText("Detail")));*/
        //onView(withId(R.id.recyclerSummary)).check(matches(withText("Detail")));
    }
}
