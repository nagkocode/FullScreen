
// custom view

package com.example.snippet.fullscreen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class CustomView extends View {

    private Paint paint;

    // constructor
    public CustomView(Context context) {
        super(context);

        paint = new Paint();
    }

    // render screen
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float y, d;

        // save current matrix
        canvas.save();

        y = 0.0f;
        d = 25.0f;

        // draw text
        paint.setTextSize(d);
        paint.setColor(0xff0000ff);
        canvas.drawText("To display a hidden navigation bar,", 0, y+=d, paint);
        canvas.drawText("swipe from the bottom or upper edge of the screen,", 0, y+=d, paint);
        canvas.drawText("the bars show for few seconds then hide.", 0, y+=d, paint);

        // restore the matrix saved above
        canvas.restore();
    }

}
