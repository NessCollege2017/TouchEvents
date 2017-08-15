package ness.edu.touchevents;

import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by Android2017 on 8/15/2017.
 */

public class MyListener extends GestureDetector.SimpleOnGestureListener{
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return super.onScroll(e1, e2, distanceX, distanceY);
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return onSwipe(e1, e2, velocityX, velocityY);
    }

    public boolean onSwipe(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return super.onFling(e1, e2, velocityX, velocityY);
    }
}
