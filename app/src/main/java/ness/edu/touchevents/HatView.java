package ness.edu.touchevents;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * A Custom View sub class
 */

public class HatView extends View {

    //Constructor overloading may lead to duplicate code.
    //Use one constructor as a funnel point through which all constructors call.
    public HatView(Context context) {
        this(context, null);
    }
    public HatView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public HatView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    Paint p = new Paint();
    Bitmap hat;
    Bitmap face;

    //initialize your properties here.
    private void init() {
        p.setColor(0x00dd00);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(20);
        p.setStrokeCap(Paint.Cap.ROUND);
        p.setDither(true);
        p.setAntiAlias(true);

        hat = BitmapFactory.decodeResource(
                getResources(),
                R.drawable.cylinder
        );

        face = BitmapFactory.decodeResource(
                getResources(),
                R.drawable.head
        );
    }

    //Interesting view methods:
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(face, 100, 300, null);
        canvas.drawBitmap(hat, 300, 500, null);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        return super.onTouchEvent(event);
    }


}
