package com.bwie.asus.lottery;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CircleView extends View {

    Paint mPaint;
    int mCircleCount=6;
    int mStartAngle=0;

    private String[] mStr = new String[]{"优惠券","十元话费","恭喜发财","恭喜发财","英雄皮肤","50M流量"};
    int[] colors=new int[]{Color.YELLOW,Color.DKGRAY,Color.CYAN,Color.GRAY,Color.GREEN,Color.RED};
    RectF rectF;
    int textdegress=15;


    public CircleView(Context context) {
        super(context);
        brush();
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        brush();
    }

    private void brush() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(10);
        mPaint.setTextSize(60);
        mPaint.setStyle(Paint.Style.FILL);

        rectF = new RectF();
        rectF.top = 100;
        rectF.left = 100;
        rectF.right = 600;
        rectF.bottom = 600;
    }
    @Override

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (int i=0;i<mCircleCount;i++){
            mPaint.setColor(colors[i]);
            Path path=new Path();
            mPaint.setTextSize(24);
            canvas.drawArc(rectF,mStartAngle,60,true,mPaint);
            path.addArc(rectF,textdegress,60);
            mPaint.setColor(Color.BLACK);
            canvas.drawTextOnPath(mStr[i],path,30,80,mPaint);

           mStartAngle +=60;
           textdegress+=60;
        }
    }
    CircleView start;

    public void setStart(CircleView start) {
        this.start = start;
    };

    public void setStart(Click click) {
    }

    interface  Click{
        void Start(View view);

        void Stop(View view1);
    }

}
