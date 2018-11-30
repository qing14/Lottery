package com.bwie.asus.lottery;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
//中间的小圆
public class ZZView extends View {
    Paint mPaint;
    String mStr;
    RectF rectF;

    public ZZView(Context context) {
        super(context);
        brush();
    }



    public ZZView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);


        brush();
    }
    private void brush() {
mPaint=new Paint();
mPaint.setColor(Color.RED);
mPaint.setStrokeWidth(10);
mPaint.setTextSize(60);
mPaint.setStyle(Paint.Style.FILL);

rectF=new RectF();
rectF.top=100;
        rectF.bottom = 350;
        rectF.right = 450;
        rectF.left = 250;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.BLACK);
        canvas.drawArc(rectF,60,60,true,mPaint);
        mPaint.setColor(Color.RED);
        canvas.drawCircle(350,350,90,mPaint);

        mPaint.setColor(Color.BLACK);
      canvas.drawText("start",290,370,mPaint);
     

    }

}
