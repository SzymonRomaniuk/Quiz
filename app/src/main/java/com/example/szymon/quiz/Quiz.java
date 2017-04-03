package com.example.szymon.quiz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;



    public class Quiz extends AppCompatActivity
    {
        int score = 0;
        String tekst = "Ilość punktów: " + score;
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.quiz);




            final RadioGroup radioGroup1 = (RadioGroup)findViewById (R.id.oneq);
            final RadioGroup radioGroup2 = (RadioGroup)findViewById (R.id.twoq);
            final RadioGroup radioGroup3 = (RadioGroup)findViewById (R.id.threeq);
            final RadioGroup radioGroup4 = (RadioGroup)findViewById (R.id.fourq);
            final RadioGroup radioGroup5 = (RadioGroup)findViewById (R.id.fiveq);

            radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
            {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId)
                {
                    if (checkedId == R.id.oneqt)
                        score++;
                    tekst = "Ilość punktów: " + score;
                    Toast.makeText(getApplicationContext(),tekst, Toast.LENGTH_LONG).show();
                    if (checkedId == R.id.oneqt || checkedId == R.id.oneqf)
                        for(int i = 0; i < group.getChildCount(); i++)
                        {
                            (radioGroup1.getChildAt(i)).setEnabled(false);
                        }
                }
            });

            radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
            {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId)
                {
                    if (checkedId == R.id.twoqt)
                        score++;
                    tekst = "Ilość punktów: " + score;
                    Toast.makeText(getApplicationContext(),tekst, Toast.LENGTH_LONG).show();
                    if (checkedId == R.id.twoqt || checkedId == R.id.twoqf)
                        for(int i = 0; i < group.getChildCount(); i++)
                        {
                            (radioGroup2.getChildAt(i)).setEnabled(false);
                        }
                }
            });

            radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
            {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId)
                {
                    if (checkedId == R.id.threeqt)
                        score++;
                    tekst = "Ilość punktów: " + score;
                    Toast.makeText(getApplicationContext(),tekst, Toast.LENGTH_LONG).show();
                    if (checkedId == R.id.threeqt || checkedId == R.id.threeqf)
                        for(int i = 0; i < group.getChildCount(); i++)
                        {
                            (radioGroup3.getChildAt(i)).setEnabled(false);
                        }
                }
            });

            radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
            {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId)
                {
                    if (checkedId == R.id.fourqt)
                        score++;
                    tekst = "Ilość punktów: " + score;
                    Toast.makeText(getApplicationContext(),tekst, Toast.LENGTH_LONG).show();
                    if (checkedId == R.id.fourqt || checkedId == R.id.fourqf)
                        for(int i = 0; i < group.getChildCount(); i++)
                        {
                            (radioGroup4.getChildAt(i)).setEnabled(false);
                        }
                }
            });

            radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
            {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId)
                {
                    if (checkedId == R.id.fiveqt)
                        score++;
                    tekst = "Ilość punktów: " + score;
                    Toast.makeText(getApplicationContext(),tekst, Toast.LENGTH_LONG).show();
                    if (checkedId == R.id.fiveqt || checkedId == R.id.fiveqf)
                        for(int i = 0; i < group.getChildCount(); i++)
                        {
                            (radioGroup5.getChildAt(i)).setEnabled(false);
                        }
                }
            });
        }

}
