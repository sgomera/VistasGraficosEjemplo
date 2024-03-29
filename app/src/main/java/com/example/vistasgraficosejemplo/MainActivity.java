package com.example.vistasgraficosejemplo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
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
            /*super.onDraw(canvas);
            Paint miPincel = new Paint();

           // miPincel.setColor(getResources().getColor(android.R.color.holo_green_dark));
            miPincel.setColor(Color.argb(200, 100,10,255));
            miPincel.setStrokeWidth(8);
            miPincel.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(250, 500,200,miPincel);

            //relleno
            int miColor;
            miColor = ContextCompat.getColor(getContext(), R.color.rellenoCirculo);
            miPincel.setColor(miColor);
            miPincel.setStyle(Paint.Style.FILL);
            canvas.drawCircle(250,500,200,miPincel);*/

            Path miTrazo = new Path();
            miTrazo.addCircle(350,350,200,Path.Direction.CCW);
            Paint miPincel = new Paint();
            miPincel.setColor(Color.RED);
            miPincel.setStrokeWidth(8);
            miPincel.setStyle(Paint.Style.STROKE);
            canvas.drawPath(miTrazo, miPincel);

            miPincel.setStrokeWidth(1);
            miPincel.setStyle(Paint.Style.FILL);
            miPincel.setTextSize(40);
            miPincel.setTypeface(Typeface.SANS_SERIF);
            canvas.drawTextOnPath("Curso Android Píldoras Informáticas",miTrazo, 40, 60, miPincel );
        }
    }
}
