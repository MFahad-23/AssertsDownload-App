package com.example.assertsdownloadproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import java.util.ArrayList;

public class SubscriptionActivity extends AppCompatActivity {
    ImageView imageView;
    ImageSlider imageSlider;
    TextView textView1,textView2,textView3,textView4,textView5;
    CardView cardView1,cardView2,cardView3;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);
        imageView=(ImageView) findViewById(R.id.back);
        imageSlider=(ImageSlider) findViewById(R.id.slider);
        textView1=(TextView) findViewById(R.id.privacy_policy);
        textView2=(TextView) findViewById(R.id.terms_conditions);
        textView3=(TextView) findViewById(R.id.text1);
        textView4=(TextView) findViewById(R.id.text2);
        textView5=(TextView) findViewById(R.id.text3);
        cardView1=(CardView) findViewById(R.id.card1);
        cardView2=(CardView) findViewById(R.id.card2);
        cardView3=(CardView) findViewById(R.id.card3);
        button=(Button) findViewById(R.id.subscribe_now);

        ArrayList<SlideModel> slideModel=new ArrayList<>();
        slideModel.add(new SlideModel(R.drawable.man_image, ScaleTypes.FIT));
        slideModel.add(new SlideModel(R.drawable.man_image, ScaleTypes.FIT));
        slideModel.add(new SlideModel(R.drawable.man_image, ScaleTypes.FIT));

        imageSlider.setImageList(slideModel,ScaleTypes.CENTER_INSIDE);
        imageSlider.startSliding(1000);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://support.docusign.com//");
            }
            private void gotourl(String s) {
                Uri link = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, link));
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://support.docusign.com//");
            }
            private void gotourl(String s) {
                Uri link = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, link));
            }
        });

        if (cardView1.isEnabled()){
            cardView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        button.setBackground(getDrawable(R.drawable.back_button_design));
                        textView3.setBackgroundColor(getColor(R.color.self_green));
                        textView3.setTextColor(getColor(R.color.white));

                        textView4.setBackgroundColor(getColor(R.color.white));
                        textView4.setTextColor(getColor(R.color.self_green));

                        textView5.setBackgroundColor(getColor(R.color.white));
                        textView5.setTextColor(getColor(R.color.self_green));


                        Toast.makeText(getApplicationContext(),"Basic Selected",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        button.setBackground(getDrawable(R.drawable.pro_button_design));
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            textView3.setBackgroundColor(getColor(R.color.white));
                            textView3.setTextColor(getColor(R.color.self_green));
                        }
                    }
                }
            });

        }
            cardView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        button.setBackground(getDrawable(R.drawable.back_button_design));
                        textView4.setBackgroundColor(getColor(R.color.self_green));
                        textView4.setTextColor(getColor(R.color.white));

                        textView3.setBackgroundColor(getColor(R.color.white));
                        textView3.setTextColor(getColor(R.color.self_green));

                        textView5.setBackgroundColor(getColor(R.color.white));
                        textView5.setTextColor(getColor(R.color.self_green));

                        Toast.makeText(getApplicationContext(),"Plus Selected",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        button.setBackground(getDrawable(R.drawable.pro_button_design));
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            textView4.setBackgroundColor(getColor(R.color.white));
                            textView4.setTextColor(getColor(R.color.self_green));
                        }
                    }
                }
            });

            cardView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        button.setBackground(getDrawable(R.drawable.back_button_design));
                        textView5.setBackgroundColor(getColor(R.color.self_green));
                        textView5.setTextColor(getColor(R.color.white));

                        textView3.setBackgroundColor(getColor(R.color.white));
                        textView3.setTextColor(getColor(R.color.self_green));

                        textView4.setBackgroundColor(getColor(R.color.white));
                        textView4.setTextColor(getColor(R.color.self_green));

                        Toast.makeText(getApplicationContext(),"Gold Selected",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        button.setBackground(getDrawable(R.drawable.pro_button_design));
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            textView5.setBackgroundColor(getColor(R.color.white));
                            textView5.setTextColor(getColor(R.color.self_green));
                        }
                    }
                }
            });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
    });

    }
}