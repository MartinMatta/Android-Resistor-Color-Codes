package com.example.resistorcalculator;

import android.graphics.Color;
import android.widget.ImageView;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;

public class Resistor extends Utils {

    private int loadResistorImage() {
        int path = R.drawable.resistor;
        return path;
    }

    public void drawBand(ImageView image, int band, int colorCode) {
        int [] rgb = hexToRgb(colorCode);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10f);
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);

        Canvas canvas = new Canvas();
        canvas.drawLine(0, 0, 80, 80, paint);

        image.draw(canvas);
    }
}
