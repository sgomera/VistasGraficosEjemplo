package com.example.vistasgraficosejemplo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MiPropiaVista(this));
    }

    public class MiPropiaVista extends View {

        public MiPropiaVista(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint miPincel = new Paint();
            miPincel.setColor(getResources().getColor(android.R.color.holo_green_dark));
            miPincel.setStrokeWidth(8);
            miPincel.setStyle(Paint.Style.FILL);

            canvas.drawCircle(250, 500,200,miPincel);
        }
    }
}
