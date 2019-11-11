package assignment1_411.table_graph;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

/**
 * Created by Zarco on 10/3/2019.
 */



public class tabletest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabletest);

        HorizontalScrollView hsv = new HorizontalScrollView(this);
        ViewGroup.LayoutParams hsvParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT

        );
        hsv.setLayoutDirection(View.LAYOUT_DIRECTION_INHERIT);
        hsv.setLayoutParams(hsvParams);
        hsv.setFillViewport(true);

        LinearLayout root = new LinearLayout(this);
        LinearLayout.LayoutParams vParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT

        );
        vParams.setMargins(1, 1, 1, 1);
        vParams.weight = 1.0f;

        root.setBackgroundColor(Color.BLACK);
        root.setOrientation(LinearLayout.HORIZONTAL);
        root.setLayoutParams(vParams);

        LinearLayout ll = new LinearLayout(this);
        LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT

        );
        lParams.setMargins(1, 1, 1, 1);
        lParams.weight = 1.0f;
        ll.setOrientation(LinearLayout.VERTICAL);

        GridLayout gl = new GridLayout(this);
        ViewGroup.LayoutParams gParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        gl.setLayoutParams(gParams);
        gl.setOrientation(GridLayout.VERTICAL);
        gl.setBackgroundColor(Color.WHITE);
        gl.setColumnCount(11);
        gl.setRowCount(11);


        TextView tv = new TextView(this);
        ViewGroup.LayoutParams tvParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        GridLayout gl2 = new GridLayout(this);
        gl2.setLayoutParams(gParams);
        gl2.setOrientation(GridLayout.VERTICAL);
        gl2.setBackgroundColor(Color.WHITE);
        gl2.setColumnCount(4);
        gl2.setRowCount(5);


        View v = null;
        for (int i = 1; i < 7; i++) {
            tv = new TextView(this);
            if (i == 1) {
                tv.setText(" " + i + " ");

                GridLayout.Spec row_spec = GridLayout.spec(0, 1f);
                GridLayout.Spec col_spec = GridLayout.spec(0, 1f);
                GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                GridLayout.Spec row_spec2 = GridLayout.spec(1, 1f);
                GridLayout.Spec col_spec2 = GridLayout.spec(0, 1f);
                GridLayout.LayoutParams c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                tv.setLayoutParams(tvParams);
                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));
                //gl2.addView(tv, c2Params);

                tv = new TextView(this);
                tv.setText("Rules void hello1(int hour)");
                tv.setTextSize(16);
                tv.setTextColor(Color.WHITE);
                tv.setBackgroundColor(Color.BLACK);
                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                tv.setLayoutParams(c2Params);
                gl2.addView(tv, c2Params);

                row_spec = GridLayout.spec(0, 1f);
                col_spec = GridLayout.spec(1, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                gl.addView(gl2, cParams);


            }
            if (i == 2) {
                tv = new TextView(this);
                gl2 = new GridLayout(this);
                tv.setText(" " + i + " ");


                GridLayout.Spec row_spec = GridLayout.spec(1, 1f);
                GridLayout.Spec col_spec = GridLayout.spec(0, 1f);
                GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                GridLayout.Spec row_spec2 = GridLayout.spec(0, 1f);
                GridLayout.Spec col_spec2 = GridLayout.spec(0, 1f);
                GridLayout.LayoutParams c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                tv.setLayoutParams(tvParams);

                gl2.addView(tv, c2Params);

                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));

                tv = new TextView(this);
                tv.setText("properties");
                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setTextSize(16);
                tv.setBackgroundColor(Color.WHITE);
                tv.setTextColor(Color.BLACK);
                row_spec = GridLayout.spec(1, 1f);
                col_spec = GridLayout.spec(1, 1f);
                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                gl2.addView(tv, c2Params);

                for (int z = 0; z < 2; z++) {
                    for (int r = 0; r < 3; r++) {
                        tv = new TextView(this);
                        tv.setTextSize(16);
                        tv.setBackgroundColor(Color.WHITE);
                        tv.setTextColor(Color.BLACK);
                        if (z == 0 && r == 1) {
                            tv.setText("name");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            tv.setPadding(10, 0, 0, 0);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);

                        }
                        if (z == 0 && r == 2) {
                            tv.setText("Day Hour Classification");
                            //tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            tv.setPadding(20, 0, 0, 0);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }

                    }
                }



                tv = new TextView(this);
                tv.setText(" " + 3 + " ");


                row_spec = GridLayout.spec(1, 1f);
                col_spec = GridLayout.spec(0, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);

                row_spec2 = GridLayout.spec(1, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);


                tv.setLayoutParams(tvParams);
                gl2.addView(tv, c2Params);
                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));


                row_spec2 = GridLayout.spec(1, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                for (int z = 0; z < 2; z++) {
                    for (int r = 0; r < 3; r++) {
                        tv = new TextView(this);
                        tv.setTextSize(16);
                        tv.setBackgroundColor(Color.WHITE);
                        tv.setTextColor(Color.BLACK);
                        if (z == 1 && r == 0) {
                            tv.setText("");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            tv.setPadding(10, 0, 10, 0);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 1 && r == 1) {
                            tv.setText("category");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            tv.setPadding(10, 0, 0, 0);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 1 && r == 2) {
                            tv.setText("Day and Time");
                            //tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            tv.setPadding(20, 0, 0, 0);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }

                    }
                }
                row_spec = GridLayout.spec(1, 1f);
                col_spec = GridLayout.spec(1, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);


                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);


                tv = new TextView(this);
                tv.setText(" " + 4 + " ");

                row_spec = GridLayout.spec(1, 1f);
                col_spec = GridLayout.spec(0, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);

                row_spec2 = GridLayout.spec(2, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);


                tv.setLayoutParams(tvParams);
                gl2.addView(tv, c2Params);


                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));


                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                for (int z = 0; z < 4; z++) {
                    for (int r = 0; r < 4; r++) {
                        tv = new TextView(this);
                        tv.setTypeface(Typeface.DEFAULT_BOLD);
                        tv.setTextSize(16);
                        tv.setBackgroundColor(Color.CYAN);
                        tv.setTextColor(Color.BLACK);
                        if (z == 2 && r == 0) {
                            tv.setText("Rule");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            tv.setPadding(100, 0, 170, 0);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 2 && r == 1) {
                            tv.setText("C1");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 2 && r == 2) {
                            tv.setText("A1");

                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }

                    }
                }


                tv = new TextView(this);
                tv.setText(" " + 5 + " ");

                row_spec = GridLayout.spec(2, 1f);
                col_spec = GridLayout.spec(0, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);

                row_spec2 = GridLayout.spec(3, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);


                tv.setLayoutParams(tvParams);
                gl2.addView(tv, c2Params);


                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));


                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                for (int z = 0; z < 4; z++) {
                    for (int r = 0; r < 4; r++) {
                        tv = new TextView(this);
                        tv.setTextSize(16);
                        tv.setBackgroundColor(Color.CYAN);
                        tv.setTextColor(Color.BLACK);
                        if (z == 3 && r == 0) {
                            tv.setText("");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 3 && r == 1) {
                            tv.setText("min <= hour && hour <= max");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            tv.setPadding(75, 0, 75, 0);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 3 && r == 2) {
                            tv.setText("System.out.println(greeting + \",World!\")");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            tv.setPadding(50, 0, 50, 0);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }

                    }
                }
                row_spec = GridLayout.spec(1, 1f);
                col_spec = GridLayout.spec(1, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                gl.addView(gl2, cParams);

            }


            if (i == 6) {
                gl2 = new GridLayout(this);
                tv = new TextView(this);
                tv.setText(" " + i + " ");

                GridLayout.Spec row_spec = GridLayout.spec(3, 1f);
                GridLayout.Spec col_spec = GridLayout.spec(0, 1f);
                GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);

                GridLayout.Spec row_spec2 = GridLayout.spec(0, 1f);
                GridLayout.Spec col_spec2 = GridLayout.spec(0, 1f);
                GridLayout.LayoutParams c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);


                tv.setLayoutParams(tvParams);
                gl2.addView(tv, c2Params);

                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));


                gl2 = new GridLayout(this);
                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                for (int z = 0; z < 6; z++) {
                    for (int r = 0; r < 5; r++) {
                        tv = new TextView(this);
                        tv.setTextSize(16);
                        tv.setBackgroundColor(Color.CYAN);
                        tv.setTextColor(Color.BLACK);
                        if (z == 0 && r == 0) {
                            tv.setText("");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 0 && r == 1) {
                            tv.setText("int min");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 0 && r == 2) {
                            tv.setText("int max");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 0 && r == 3) {
                            tv.setText("String greeting");
                            tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                            tv.setPadding(100, 0, 100, 0);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }

                    }
                }


                tv = new TextView(this);
                tv.setText(" " + 7 + " ");

                row_spec = GridLayout.spec(3, 1f);
                col_spec = GridLayout.spec(0, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                row_spec2 = GridLayout.spec(1, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);


                tv.setLayoutParams(tvParams);
                gl2.addView(tv, c2Params);

                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));


                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                for (int z = 0; z < 6; z++) {
                    for (int r = 0; r < 5; r++) {
                        tv = new TextView(this);
                        tv.setTypeface(Typeface.DEFAULT_BOLD);
                        tv.setTextSize(9);
                        tv.setTextColor(Color.BLACK);
                        if (z == 1 && r == 0) {
                            tv.setText("Rule");
                            tv.setBackgroundColor(Color.WHITE);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 1 && r == 1) {
                            tv.setText("From");
                            tv.setBackgroundColor(Color.YELLOW);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 1 && r == 2) {
                            tv.setText("To");
                            tv.setBackgroundColor(Color.YELLOW);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 1 && r == 3) {
                            tv.setText("Greeting");
                            tv.setBackgroundColor(Color.parseColor("#f6b845"));
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }

                    }
                }

                tv = new TextView(this);
                tv.setText(" " + 8 + " ");

                row_spec = GridLayout.spec(3, 1f);
                col_spec = GridLayout.spec(0, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                row_spec2 = GridLayout.spec(2, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);


                tv.setLayoutParams(tvParams);
                gl2.addView(tv, c2Params);

                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));


                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                for (int z = 0; z < 6; z++) {
                    for (int r = 0; r < 4; r++) {
                        tv = new TextView(this);
                        tv.setTextSize(9);
                        tv.setTextColor(Color.BLACK);
                        if (z == 2 && r == 0) {
                            tv.setText("R10");
                            tv.setBackgroundColor(Color.WHITE);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 2 && r == 1) {
                            tv.setText(" 0");
                            tv.setBackgroundColor(Color.YELLOW);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 2 && r == 2) {
                            tv.setText("11");
                            tv.setBackgroundColor(Color.YELLOW);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 2 && r == 3) {
                            tv.setText("Good Morning");
                            tv.setBackgroundColor(Color.parseColor("#f6b845"));
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }

                    }
                }


                tv = new TextView(this);
                tv.setText(" " + 9 + " ");

                row_spec = GridLayout.spec(3, 1f);
                col_spec = GridLayout.spec(0, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                row_spec2 = GridLayout.spec(3, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);


                tv.setLayoutParams(tvParams);
                gl2.addView(tv, c2Params);

                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));


                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                for (int z = 0; z < 6; z++) {
                    for (int r = 0; r < 5; r++) {
                        tv = new TextView(this);
                        tv.setTextSize(9);
                        tv.setTextColor(Color.BLACK);
                        if (z == 3 && r == 0) {
                            tv.setText("R20");
                            tv.setBackgroundColor(Color.WHITE);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 3 && r == 1) {
                            tv.setText("12");
                            tv.setBackgroundColor(Color.YELLOW);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 3 && r == 2) {
                            tv.setText("17");
                            tv.setBackgroundColor(Color.YELLOW);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 3 && r == 3) {
                            tv.setText("Good Afternoon");
                            tv.setBackgroundColor(Color.parseColor("#f6b845"));
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }

                    }
                }

                tv = new TextView(this);
                tv.setText(" " + 10 + " ");

                row_spec = GridLayout.spec(3, 1f);
                col_spec = GridLayout.spec(0, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                row_spec2 = GridLayout.spec(4, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);


                tv.setLayoutParams(tvParams);
                gl2.addView(tv, c2Params);


                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));


                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                for (int z = 0; z < 6; z++) {
                    for (int r = 0; r < 5; r++) {
                        tv = new TextView(this);
                        tv.setTextSize(9);
                        tv.setTextColor(Color.BLACK);
                        if (z == 4 && r == 0) {
                            tv.setText("R30");
                            tv.setBackgroundColor(Color.WHITE);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 4 && r == 1) {
                            tv.setText("18");
                            tv.setBackgroundColor(Color.YELLOW);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 4 && r == 2) {
                            tv.setText("21");
                            tv.setBackgroundColor(Color.YELLOW);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 4 && r == 3) {
                            tv.setText("Good Evening");
                            tv.setBackgroundColor(Color.parseColor("#f6b845"));
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }

                    }
                }


                tv = new TextView(this);
                tv.setText(" " + 11 + " ");

                row_spec = GridLayout.spec(3, 1f);
                col_spec = GridLayout.spec(0, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                row_spec2 = GridLayout.spec(5, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);


                tv.setLayoutParams(tvParams);
                gl2.addView(tv, c2Params);
                tv.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));


                row_spec2 = GridLayout.spec(0, 1f);
                col_spec2 = GridLayout.spec(0, 1f);
                for (int z = 0; z < 6; z++) {
                    for (int r = 0; r < 5; r++) {
                        tv = new TextView(this);
                        tv.setTextSize(9);
                        tv.setTextColor(Color.BLACK);
                        if (z == 5 && r == 0) {
                            tv.setText("R40");
                            tv.setBackgroundColor(Color.WHITE);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 5 && r == 1) {
                            tv.setText("22");
                            tv.setBackgroundColor(Color.YELLOW);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 5 && r == 2) {
                            tv.setText("23");
                            tv.setBackgroundColor(Color.YELLOW);
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }
                        if (z == 5 && r == 3) {
                            tv.setText("Good Night");
                            tv.setBackgroundColor(Color.parseColor("#f6b845"));
                            row_spec2 = GridLayout.spec(z, 1f);
                            col_spec2 = GridLayout.spec(r, 1f);
                            c2Params = new GridLayout.LayoutParams(row_spec2, col_spec2);
                            gl2.addView(tv, c2Params);
                        }

                    }
                }
                row_spec = GridLayout.spec(4, 1f);
                col_spec = GridLayout.spec(1, 1f);
                cParams = new GridLayout.LayoutParams(row_spec, col_spec);

                gl.addView(gl2, cParams);


            }

        }

        root.addView(gl, vParams);
        hsv.addView(root, hsvParams);
        setContentView(hsv);
    }
}