package net.manish.calculater;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double v1,v2;
    Boolean addb,subb,mulb,divb;
Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,div,equal,multiply,dot,clear,backspace;

TextView disc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        add=findViewById(R.id.plus);
        sub=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        div=findViewById(R.id.division);
        equal=findViewById(R.id.equal);
        dot=findViewById(R.id.dot);
        clear=findViewById(R.id.clr);




        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    disc.setText(disc.getText()+"2");
                }
            });

        three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    disc.setText(disc.getText()+"3");
                }
            });
        four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    disc.setText(disc.getText()+"4");
                }
            });
        five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    disc.setText(disc.getText()+"5");
                }
            });
        six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    disc.setText(disc.getText()+"six");
                }
            });
        seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    disc.setText(disc.getText()+"7");
                }
            });
        eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    disc.setText(disc.getText()+"8");
                }
            });
        zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    disc.setText(disc.getText()+"0");
                }
            });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()+".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText("");
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(!disc.getText().toString().equals(" "))
              {
                  String val = disc.getText().toString();
                  val = val.substring(0,val.length()-1);
                  disc.setText(val);
              }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.valueOf(disc.getText().toString());
                disc.setText(null);
                add.equals(true);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.valueOf(disc.getText().toString());
                disc.setText(null);
                sub.equals(true);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2 = Double.valueOf(disc.getText().toString());
                if (addb==true)
                {
                    disc.setText(v1+v2+"");
                    addb=null;

                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()-"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()-"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()-"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()-"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()-"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()+"six");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()+"8");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disc.setText(disc.getText()+"0");
            }
        });




    }
}