package jp.co.nichiwa_system.nakayamanobuo.test123;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.util.Calendar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;



public class MainActivity extends Activity {
    int MAX_HIJOUSYOKU=12;

    //テスト用カレンダー
    final Calendar calendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int mYear = calendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int mMonth = calendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int mDay = calendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog datePickerDialog;

    //レトルトごはんの賞味期限
    final Calendar rcalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int rYear = rcalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int rMonth = rcalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int rDay = rcalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog retorutgohan_datepickerdialog;

    //缶詰の賞味期限
    final Calendar kcalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int kYear = kcalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int kMonth = kcalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int kday = kcalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog kdatepickerdialog;

    //乾麺の賞味期限
    final Calendar kancalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int kanYear = kancalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int kanMonth = kancalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int kanday = kancalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog kandatepickerdialog;

    //乾板の賞味期限
    final Calendar kanpancalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int kanpanYear = kanpancalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int kanpanMonth = kanpancalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int kanpanday = kanpancalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog kanpandatepickerdialog;

    //缶詰(主菜）の賞味期限
    final Calendar k2calendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int k2Year = k2calendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int k2Month = k2calendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int k2Day = k2calendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog k2datepickerdialog;

    //レトルト(主菜）の賞味期限
    final Calendar r2calendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int r2Year = r2calendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int r2Month = r2calendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int r2Day = r2calendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog r2datepickerdialog;

    //フリーズドライの賞味期限
    final Calendar fcalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int fYear = fcalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int fMonth = fcalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int fDay = fcalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog fdatepickerdialog;

    //水の賞味期限
    final Calendar wcalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int wYear = wcalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int wMonth = wcalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int wDay = wcalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog wdatepickerdialog;

    //スポーツ飲料の賞味期限
    final Calendar pcalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int pYear = pcalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int pMonth = pcalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int pDay = pcalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog pdatepickerdialog;

    //カロリーメイトの賞味期限
    final Calendar karocalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int karoYear = karocalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int karoMonth = karocalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int karoDay = karocalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog karodatepickerdialog;

    //お菓子の賞味期限
    final Calendar okacalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int okaYear = okacalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int okaMonth = okacalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int okaDay = okacalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog okadatepickerdialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        //getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
        SharedPreferences baby = getSharedPreferences("baby", MODE_PRIVATE);
        if(adult.getInt("adult",0)==0&&child.getInt("child",0)==0&&baby.getInt("baby",0)==0) {

                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("警告");
                alert.setMessage("初期設定を行ってください。");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent();
                        intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123", "jp.co.nichiwa_system.nakayamanobuo.test123.setting");
                        startActivity(intent);
                    }
                });
                alert.show();

        }


        Calendar cale = Calendar.getInstance();

        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
        int g = pref.getInt("ga", 0);
        int m = pref.getInt("matti", 0);
        int b = pref.getInt("bomb", 0);
        int h = pref.getInt("hue", 0);
        int otona = pref.getInt("sitagi", 0);
        int t = pref.getInt("thissyu", 0);
        int a = pref.getInt("almi", 0);
        int gun = pref.getInt("gunnte", 0);
        int nebukuro = pref.getInt("nebukuro",0);

        int r = pref.getInt("retoruto_gohan", 0);
        int k = pref.getInt("kandume", 0);
        int kan = pref.getInt("kanmen", 0);
        int kanpan = pref.getInt("kanpan", 0);
        int kan2 = pref.getInt("kandumes", 0);
        int reto = pref.getInt("retoruto", 0);
        int f = pref.getInt("freaze", 0);
        double mizu = pref.getInt("mizu", 0);
        int rinyu = pref.getInt("rinyuu", 0);
        int konamilk = pref.getInt("konamilk", 0);
        int karori = pref.getInt("karori", 0);
        int okasi = pref.getInt("okasi", 0);

        String today_last = pref.getString("today", "まだ入力されていません。");
        String today_last_s = pref.getString("today_s", "まだ入力されていません。");


        int sum = g + m + b + h + otona + t + a + gun;
        int sum2 = r + k + kan + kanpan + kan2 + reto + f + karori + okasi;
        int hoge = setting.getInt("setting_sp", 0);
        int adult_n = adult.getInt("adult", 0);
        int child_n = child.getInt("child", 0);
        int baby_n = baby.getInt("baby", 0);
        double mizu_a=0.0, mizu_c=0.0, mizu_b=0.0;

        double food_a=0.0, food_c=0.0, food_b=0.0;
        //大人小人幼児の必要数格納用
        double MAX=0.0;
        //水の備蓄の％格納用
        double s_w = 0;
        //非常食の備蓄の％格納用
        double p=0.0;
        //非常食（大人用）の栄養価合計値
        double v=0.0;
        double p_b=0.0;
        int x;
        int poi;

        String str_fp = "備蓄" + hoge;
        switch (hoge) {
            case 0:
                //栄養価の計算。乾パンとカロリーメイトを抜いたものは栄養価１．乾パン、カロリーメイトは３。
                v = ((sum2 - kanpan - karori) * 1) + (kanpan + karori) * 3;
                //大人の必要数計算
                if(baby_n>=1) {
                    food_a = v;
                    if (food_a >= 21 * adult_n) {
                        food_a = 21 * adult_n;
                    }
                    v = v - food_a;
                    //小人の必要数計算
                    food_c = v;
                    if (food_c >= 14 * child_n) {
                        food_c = 14 * child_n;
                    }
                    MAX = (adult_n * 21) + (child_n * 14);
                    p = ((food_a + food_c) / MAX) * 25;

                    //幼児の必要数計算
                    //幼児の栄養価の計算。離乳食１、粉ミルク３．
                    food_b = rinyu + konamilk * 3;
                    if (food_b >= 21 * baby_n) {
                        food_b = 21 * baby_n;
                    }
                    //大人、小人、幼児の必要数を計算。
                    //備蓄は何％あるか計算。最大50％
                    p_b = (food_b  / (baby_n * 21)) * 25;
                    p=p+p_b;
                }
                else {
                    food_a = v;
                    if (food_a >= 21 * adult_n) {
                        food_a = 21 * adult_n;
                    }
                    v = v - food_a;
                    //小人の必要数計算
                    food_c = v;
                    if (food_c >= 14 * child_n) {
                        food_c = 14 * child_n;
                    }
                    MAX = (adult_n * 21) + (child_n * 14);
                    p = ((food_a + food_c) / MAX) * 50;
                }

                //水の必要数の計算
                //大人の必要数
                MAX = (adult_n * 21) + (child_n * 14) + (baby_n * 14);
                mizu_a = mizu;
                if (mizu_a > 21 * adult_n) {
                    mizu_a = 21 * adult_n;
                }
                mizu = mizu  - mizu_a;
                //小人の必要数
                mizu_c = mizu;
                if (mizu_c > 14 * child_n) {
                    mizu_c = 14 * child_n;
                }
                mizu = mizu - mizu_c;
                //幼児の必要数
                mizu_b = mizu;
                if (mizu_b > 14 * baby_n) {
                    mizu_b = 14 * baby_n;
                }
                //備蓄は何％あるか計算。最大50％
                s_w = ((mizu_a + mizu_c + mizu_b) / MAX) * 50;
                //非常食と水の備蓄を合計。最大100％
                s_w = s_w + p;

                x = (int) s_w;
                str_fp = "備蓄は" + x + "%です。";
                if (s_w >= 10 && s_w < 20) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph1);

                } else if (s_w >= 20 && s_w < 30) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph2);
                } else if (s_w >= 30 && s_w < 40) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph3);
                } else if (s_w >= 40 && s_w < 50) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph4);
                } else if (s_w >= 50 && s_w < 60) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph5);
                } else if (s_w >= 60 && s_w < 70) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph6);
                } else if (s_w >= 70 && s_w < 80) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph7);
                } else if (s_w >= 80 && s_w < 90) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph8);
                } else if (s_w >= 90 && s_w < 100) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph9);
                } else if (s_w == 100) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph10);
                }

                break;

            case 1:
                //栄養価の計算。乾パンとカロリーメイトを抜いたものは栄養価１．乾パン、カロリーメイトは３。
                v = ((sum2 - kanpan - karori) * 1) + (kanpan + karori) * 3;
                //大人の必要数計算
                if(baby_n>=1) {
                    food_a = v;
                    if (food_a >= 9 * adult_n) {
                        food_a = 9 * adult_n;
                    }
                    v = v - food_a;
                    //小人の必要数計算
                    food_c = v;
                    if (food_c >= 6 * child_n) {
                        food_c = 6 * child_n;
                    }
                    MAX = (adult_n * 9) + (child_n * 6);
                    p = ((food_a + food_c) / MAX) * 25;

                    //幼児の必要数計算
                    //幼児の栄養価の計算。離乳食１、粉ミルク３．
                    food_b = rinyu + konamilk * 3;
                    if (food_b >= 9 * baby_n) {
                        food_b = 9 * baby_n;
                    }
                    //大人、小人、幼児の必要数を計算。
                    //備蓄は何％あるか計算。最大50％
                    p_b = (food_b  / (baby_n * 9)) * 25;
                    p=p+p_b;
                }
                else {
                    food_a = v;
                    if (food_a >= 9 * adult_n) {
                        food_a = 9 * adult_n;
                    }
                    v = v - food_a;
                    //小人の必要数計算
                    food_c = v;
                    if (food_c >= 6 * child_n) {
                        food_c = 6 * child_n;
                    }
                    MAX = (adult_n * 9) + (child_n * 6);
                    p = ((food_a + food_c) / MAX) * 50;
                }

                //水の必要数の計算
                //大人の必要数
                MAX = (adult_n * 9) + (child_n * 6) + (baby_n * 9);
                mizu_a = mizu;
                if (mizu_a > 9 * adult_n) {
                    mizu_a = 9 * adult_n;
                }
                mizu = mizu  - mizu_a;
                //小人の必要数
                mizu_c = mizu;
                if (mizu_c > 6 * child_n) {
                    mizu_c = 6 * child_n;
                }
                mizu = mizu - mizu_c;
                //幼児の必要数
                mizu_b = mizu;
                if (mizu_b > 6 * baby_n) {
                    mizu_b = 6 * baby_n;
                }
                //備蓄は何％あるか計算。最大50％
                s_w = ((mizu_a + mizu_c + mizu_b) / MAX) * 50;
                //非常食と水の備蓄を合計。最大100％
                s_w = s_w + p;
                x = (int) s_w;
                str_fp = "備蓄は" + x + "%です。";
                if (s_w >= 10 && s_w < 20) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph1);

                } else if (s_w >= 20 && s_w < 30) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph2);
                } else if (s_w >= 30 && s_w < 40) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph3);
                } else if (s_w >= 40 && s_w < 50) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph4);
                } else if (s_w >= 50 && s_w < 60) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph5);
                } else if (s_w >= 60 && s_w < 70) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph6);
                } else if (s_w >= 70 && s_w < 80) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph7);
                } else if (s_w >= 80 && s_w < 90) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph8);
                } else if (s_w >= 90 && s_w < 100) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph9);
                } else if (s_w == 100) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph10);
                }

                break;
            case 2:

                v = ((sum2 - kanpan - karori) * 1) + (kanpan + karori) * 3;
                //大人の必要数計算
                if(baby_n!=0) {
                    food_a = v;
                    if (food_a >= 3 * adult_n) {
                        food_a = 3 * adult_n;
                    }
                    v = v - food_a;
                    //小人の必要数計算
                    food_c = v;
                    if (food_c >= 2 * child_n) {
                        food_c = 2 * child_n;
                    }
                    MAX = (adult_n * 3) + (child_n * 2);
                    p = ((food_a + food_c) / MAX)*25;

                    //幼児の必要数計算
                    //幼児の栄養価の計算。離乳食１、粉ミルク３．
                    food_b = rinyu + (konamilk * 3);
                    if (food_b >= 3 * baby_n) {
                        food_b = 3 * baby_n;
                    }
                    //大人、小人、幼児の必要数を計算。
                    //備蓄は何％あるか計算。最大50％
                    p_b = (food_b  / (baby_n * 3))*25;
                    p=p+p_b;
                }
                else{
                    food_a = v;
                    if (food_a >= 3 * adult_n) {
                        food_a = 3 * adult_n;
                    }
                    v = v - food_a;
                    //小人の必要数計算
                    food_c = v;
                    if (food_c >= 2 * child_n) {
                        food_c = 2 * child_n;
                    }
                    MAX = (adult_n * 3) + (child_n * 2);
                    p = ((food_a + food_c) / MAX) * 50;
                }

                //水の必要数の計算
                //大人の必要数
                mizu_a = mizu;
                if (mizu_a > 3 * adult_n) {
                    mizu_a = 3 * adult_n;
                }
                mizu = mizu - mizu_a;
                //小人の必要数
                mizu_c = mizu;
                if (mizu_c > 2 * child_n) {
                    mizu_c = 2 * child_n;
                }
                mizu = mizu  - mizu_c;
                //幼児の必要数
                mizu_b = mizu;
                if (mizu_b > 2 * baby_n) {
                    mizu_b = 2 * baby_n;
                }
                //備蓄は何％あるか計算。最大50％
                s_w = ((mizu_a + mizu_c + mizu_b) / MAX) * 50;
                //非常食と水の備蓄を合計。最大100％
                s_w = s_w + p;
                x = (int) s_w;

                str_fp = "備蓄は" + x + "%です。";
                if (s_w >= 10 && s_w < 20) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph1);

                } else if (s_w >= 20 && s_w < 30) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph2);
                } else if (s_w >= 30 && s_w < 40) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph3);
                } else if (s_w >= 40 && s_w < 50) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph4);
                } else if (s_w >= 50 && s_w < 60) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph5);
                } else if (s_w >= 60 && s_w < 70) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph6);
                } else if (s_w >= 70 && s_w < 80) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph7);
                } else if (s_w >= 80 && s_w < 90) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph8);
                } else if (s_w >= 90 && s_w < 100) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph9);
                } else if (s_w == 100) {
                    ImageView imageView = (ImageView) findViewById(R.id.hijouImage);
                    imageView.setImageResource(R.drawable.rightgraph10);
                }

                break;
            default:
                break;
        }

        if(s_w<60) {

            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("非常食の備蓄が６０％未満です！\n非常食の備蓄を行ってください");
            alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent();
                    intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123", "jp.co.nichiwa_system.nakayamanobuo.test123.food");
                    startActivity(intent);
                }
            });
            alert.show();

        }

        TextView et4 = (TextView) findViewById(R.id.food_p);
        et4.setText(str_fp);


        //必ずView変数で生成したデータを使うこと
        TextView et3 = (TextView) findViewById(R.id.stock_p);

        TextView today_f = (TextView) findViewById(R.id.food_cal);
        TextView today_s = (TextView) findViewById(R.id.stock_cal);

        //はいっちゃう

        // et3.setText(str_sp);

        today_f.setText(today_last);
        today_s.setText(today_last_s);

        //レトルトごはんの期日が迫るとダイアログを表示する
        Calendar today = Calendar.getInstance();
        SharedPreferences limit = getSharedPreferences("limit", MODE_PRIVATE);
        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
        int lim = limit.getInt("limit", 0);
        int ry = cal.getInt("ryear", cale.get(Calendar.YEAR));
        int rm = cal.getInt("rmonth", cale.get(Calendar.MONTH));
        int rd = cal.getInt("rday", cale.get(Calendar.DATE));
        Calendar calretltgohan = Calendar.getInstance();
        String alart = "";

        switch (rm) {
            case 0:
                calretltgohan.set(ry, Calendar.JANUARY, rd, 0, 0, 0);
                break;
            case 1:
                calretltgohan.set(ry, Calendar.FEBRUARY, rd, 0, 0, 0);
                break;
            case 2:
                calretltgohan.set(ry, Calendar.MARCH, rd, 0, 0, 0);
                break;
            case 3:
                calretltgohan.set(ry, Calendar.APRIL, rd, 0, 0, 0);
                break;
            case 4:
                calretltgohan.set(ry, Calendar.MAY, rd, 0, 0, 0);
                break;
            case 5:
                calretltgohan.set(ry, Calendar.JUNE, rd, 0, 0, 0);
                break;
            case 6:
                calretltgohan.set(ry, Calendar.JULY, rd, 0, 0, 0);
                break;
            case 7:
                calretltgohan.set(ry, Calendar.AUGUST, rd, 0, 0, 0);
                break;
            case 8:
                calretltgohan.set(ry, Calendar.SEPTEMBER, rd, 0, 0, 0);
                break;
            case 9:
                calretltgohan.set(ry, Calendar.OCTOBER, rd, 0, 0, 0);
                break;
            case 10:
                calretltgohan.set(ry, Calendar.NOVEMBER, rd, 0, 0, 0);
                break;
            case 11:
                calretltgohan.set(ry, Calendar.DECEMBER, rd, 0, 0, 0);
                break;
            default:
                break;
        }

        long rdifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long ri = rdifference / 1000 / 60 / 60 / 24;

        if(baby_n>=1&&pref.getInt("konamilk",0)<=0&&pref.getInt("rinyuu",0)<=0){
            TextView alart_youji = (TextView)findViewById(R.id.alart_youji);
            alart_youji.setText("離乳食と粉ミルクが備蓄されていません！");
            ImageView imageView = (ImageView) findViewById(R.id.imageView15);
            imageView.setImageResource(R.drawable.batsu);

        }
        else{ TextView alart_youji = (TextView)findViewById(R.id.alart_youji);
            alart_youji.setText("");
            ImageView imageView = (ImageView) findViewById(R.id.imageView15);
            imageView.setImageResource(R.drawable.no);


        }

        if (lim >= ri && ri > 0) {

            alart = "レトルトごはんは賞味期限到達" + (ri + 1) + "日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_r", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView4);
            imageView.setImageResource(R.drawable.bikkuri);
        } else if (ri < 0) {
            alart = "レトルトごはんは賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_r", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView4);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_r", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView4);
            imageView.setImageResource(R.drawable.no);
        }


        //缶詰の期日が迫るとダイアログを表示する
        ry = cal.getInt("kyear", cale.get(Calendar.YEAR));
        rm = cal.getInt("kmonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("kday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long kandifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long kani = kandifference/1000/60/60/24;


        if (lim>=kani&&kani > 0) {
            alart="缶詰（主食）は賞味期限到達"+(ri+1)+"日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_k", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView5);
            imageView.setImageResource(R.drawable.bikkuri);
        }
        if(kani<0){
            alart="缶詰（主食）は賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_k", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView5);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_k", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView5);
            imageView.setImageResource(R.drawable.no);
        }


        //乾麺の期日が迫るとダイアログを表示する
        ry = cal.getInt("kanyear", cale.get(Calendar.YEAR));
        rm = cal.getInt("kanmonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("kanday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long kanmendifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long kanmeni = kanmendifference/1000/60/60/24;

        if(lim>=kanmeni&&kanmeni >0){
            alart="乾麺は賞味期限到達"+(kanmeni+1)+"日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kanmen", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView6);
            imageView.setImageResource(R.drawable.bikkuri);
        }
        else if(kanmeni<0){
            alart="乾麺は賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kanmen", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView6);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kanmenn", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView6);
            imageView.setImageResource(R.drawable.no);
        }



        //乾板の期日が迫るとダイアログを表示する
        ry = cal.getInt("kanpanyear", cale.get(Calendar.YEAR));
        rm = cal.getInt("kanpanmonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("kanpanday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long difference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long i = difference/1000/60/60/24;

        if(lim>=i&&i >0){
            alart="乾パンは賞味期限到達"+(kanpan+1)+"日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kanpan", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView7);
            imageView.setImageResource(R.drawable.bikkuri);
        }
        else if(i<0){
            alart="乾パンは賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kanpan", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView7);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kanpanr", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView7);
            imageView.setImageResource(R.drawable.no);
        }


        //缶詰主菜の期日が迫るとダイアログを表示する
        ry = cal.getInt("k2year", cale.get(Calendar.YEAR));
        rm = cal.getInt("k2month",cale.get(Calendar.MONTH));
        rd = cal.getInt("k2day", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long kan2difference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long kan2i = kan2difference/1000/60/60/24;

        if(lim>=kan2i&&kan2i >0){
            alart="缶詰（主菜）は賞味期限到達"+(kan2i+1)+"日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kan2", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView8);
            imageView.setImageResource(R.drawable.bikkuri);
        }
        else if(kan2i<0){
            alart="缶詰(主菜)は賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kan2", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView8);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kan2", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView8);
            imageView.setImageResource(R.drawable.no);
        }


        //retorutosyokuhinの期日が迫るとダイアログを表示する
        ry = cal.getInt("r2year", cale.get(Calendar.YEAR));
        rm = cal.getInt("r2month",cale.get(Calendar.MONTH));
        rd = cal.getInt("r2day", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long r2difference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long r2i = r2difference/1000/60/60/24;

        if(lim>=r2i&&r2i >0){
            alart="レトルト食品は賞味期限到達"+(r2i+1)+"日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_r2", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView9);
            imageView.setImageResource(R.drawable.bikkuri);
        }
        else if(r2i<0){
            alart="レトルト食品は賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_r2", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView9);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_r2", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView9);
            imageView.setImageResource(R.drawable.no);
        }

        //フリーズドライの期日が迫るとダイアログを表示する
        ry = cal.getInt("fyear", cale.get(Calendar.YEAR));
        rm = cal.getInt("fmonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("fday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long fdifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long fi = fdifference/1000/60/60/24;

        if(lim>=fi&&fi >0){
            alart="フリーズドライは賞味期限到達"+(fi+1)+"日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_f", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView10);
            imageView.setImageResource(R.drawable.bikkuri);
        }
        else if(fi<0){
            alart="フリーズドライは賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_f", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView10);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_rf", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView10);
            imageView.setImageResource(R.drawable.no);
        }

        //カロリーメイトの期日が迫るとダイアログを表示する
        ry = cal.getInt("kalyear", cale.get(Calendar.YEAR));
        rm = cal.getInt("kalmonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("kalday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long karodifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long karoi = karodifference/1000/60/60/24;

        if(lim>=fi&&fi >0){
            alart="カロリーメイトは賞味期限到達"+(karoi+1)+"日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_karo", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView11);
            imageView.setImageResource(R.drawable.bikkuri);
        }
        else if(fi<0){
            alart="カロリーメイトは賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_karo", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView11);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_karo", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView11);
            imageView.setImageResource(R.drawable.no);
        }

        //お菓子の期日が迫るとダイアログを表示する
        ry = cal.getInt("okayear", cale.get(Calendar.YEAR));
        rm = cal.getInt("okamonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("okaday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long okadifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long okai = okadifference/1000/60/60/24;

        if(lim>=okai&&okai >0){
            alart="お菓子は賞味期限到達"+(okai+1)+"日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_oka", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView12);
            imageView.setImageResource(R.drawable.bikkuri);
        }
        else if(okai<0){
            alart="お菓子は賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_oka", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView12);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_oka", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView12);
            imageView.setImageResource(R.drawable.no);
        }

        //離乳食の期日が迫るとダイアログを表示する
        ry = cal.getInt("pyear", cale.get(Calendar.YEAR));
        rm = cal.getInt("pmonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("pday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long pdifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long pi = pdifference/1000/60/60/24;

        if(lim>=pi&&pi >0){
            alart="離乳食は賞味期限到達"+(pi+1)+"日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_p", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView13);
            imageView.setImageResource(R.drawable.bikkuri);
        }
        else if(pi<0){
            alart="離乳食は賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_p", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView13);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_p", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView13);
            imageView.setImageResource(R.drawable.no);
        }

        //粉ミルクの期日が迫るとダイアログを表示する
        ry = cal.getInt("konayear", cale.get(Calendar.YEAR));
        rm = cal.getInt("konamonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("konaday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long konadifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long konai = konadifference/1000/60/60/24;

        if(lim>=konai&&konai >0){
            alart="粉ミルクは賞味期限到達"+(konai+1)+"日前です。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kona", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView14);
            imageView.setImageResource(R.drawable.bikkuri);
        }
        else if(konai<0){
            alart="粉ミルクは賞味期限が過ぎています。\n";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kona", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView14);
            imageView.setImageResource(R.drawable.batsu);
        } else {
            alart = "";
            SharedPreferences.Editor ep = pref.edit();
            ep.putString("alart_kona", alart);
            ep.commit();
            ImageView imageView = (ImageView) findViewById(R.id.imageView14);
            imageView.setImageResource(R.drawable.no);
        }


        //テキストに格納

        TextView alart_r = (TextView)findViewById(R.id.alart_r);
        alart_r.setText(pref.getString("alart_r",""));
        if(pref.getString("alart_r","")!=""){
            // テキスト画面遷移
        TextView testtext = (TextView)findViewById(R.id.alart_r);
        testtext.setClickable(true);
        testtext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.alart_r) { //アラートダイアログの出力
                    AlertDialog.Builder alert;
                    alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("レトルトごはん");

                    LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                    final View viw;
                    viw = inflater.inflate(R.layout.activity_retorutogohan, null);

                    //プリファレンスの生成
                    SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                    int i = 0;
                    i = pref.getInt("retoruto_gohan", i);
                    String str = String.valueOf(i);

                    //必ずView変数で生成したデータを使うこと
                    EditText et = (EditText) viw.findViewById(R.id.freazegohanText);

                    //はいっちゃう
                    et.setText(str);

                    //大人子供幼児
                    SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                    SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                    SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                    int a = adult.getInt("adult", 0);
                    int c = child.getInt("child",0);
                    int b = baby.getInt("baby",0);

                    String a_str = "大人"+String.valueOf(a)+"人";
                    String c_str = "子供"+String.valueOf(c)+"人";
                    String b_str = "幼児"+String.valueOf(b)+"人";


                    EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                    EditText child_et = (EditText)viw.findViewById(R.id.child);
                    EditText baby_et = (EditText)viw.findViewById(R.id.adult);

                    adult_et.setText(a_str);
                    child_et.setText(c_str);
                    baby_et.setText(b_str);




                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                            // 最終入力日取得
                            Calendar today =Calendar.getInstance();
                            String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                            SharedPreferences.Editor etoday = prefs.edit();
                            etoday.putString("today",today_last);
                            etoday.commit();

                            EditText et = (EditText) viw.findViewById(R.id.freazegohanText);
                            String str = et.getText().toString();

                            if(str.length() <= 0){
                                str = "0";
                            }

                            int i = Integer.parseInt(str);

                            SharedPreferences.Editor e = prefs.edit();

                            e.putInt("retoruto_gohan",i);

                            // e.putString("ga"," ");
                            e.commit();

                            // Sub 画面を起動
                            Intent intent = new Intent();
                            intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                            startActivity(intent);
                            dialog.dismiss();


                        }
                    });

                    //プレファレンスの呼び出し
                    SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                    rYear = cal.getInt("ryear",rYear);
                    rMonth = cal.getInt("rmonth",rMonth);
                    rDay = cal.getInt("rday",rDay);
                    alert.setMessage("賞味期限は"+rYear+"年"+(rMonth+1)+"月"+rDay+"日です。");
                    alert.setView(viw);
                    alert.show();

                    ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                    btnCal.setOnClickListener(new View.OnClickListener(){
                        public  void onClick(View v) {
                            //プレファレンスの呼び出し
                            SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                            rYear = cal.getInt("ryear",rYear);
                            rMonth = cal.getInt("rmonth",rMonth);
                            rDay = cal.getInt("rday",rDay);
                            DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                    rYear = year;
                                    rMonth = monthOfYear;
                                    rDay = dayOfMonth;
                                    //プリファレンスに保存
                                    SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                    SharedPreferences.Editor ryear = cal.edit();
                                    SharedPreferences.Editor rmonth = cal.edit();
                                    SharedPreferences.Editor rday = cal.edit();

                                    ryear.putInt("ryear",year);
                                    rmonth.putInt("rmonth",monthOfYear);
                                    rday.putInt("rday",dayOfMonth);

                                    ryear.commit();
                                    rmonth.commit();
                                    rday.commit();
                                }

                            };

                            retorutgohan_datepickerdialog = new DatePickerDialog(
                                    MainActivity.this,
                                    listener,
                                    rYear,
                                    rMonth,
                                    rDay
                            );

                            retorutgohan_datepickerdialog.show();

                        }

                    });
                }}
            });



        }

        //缶詰
        TextView alart_k = (TextView)findViewById(R.id.alart_k);
        alart_k.setText(pref.getString("alart_k",""));
        if(pref.getString("alart_k","")!=""){
            // テキスト画面遷移
        TextView testtext = (TextView)findViewById(R.id.alart_k);
        testtext.setClickable(true);
        testtext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.alart_k) {


            //アラートダイアログの出力
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("缶詰");
            LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
            final View viw;
            viw = inflater.inflate(R.layout.activity_kandume, null);

            //プリファレンスの生成
            SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
            int i = 0;
            i = pref.getInt("kandume", i);
            String str = String.valueOf(i);

            //必ずView変数で生成したデータを使うこと
            EditText et = (EditText) viw.findViewById(R.id.kandumeText);

            //はいっちゃう
            et.setText(str);

            //大人子供幼児
            SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
            SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
            SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


            int a = adult.getInt("adult", 0);
            int c = child.getInt("child",0);
            int b = baby.getInt("baby",0);

            String a_str = "大人"+String.valueOf(a)+"人";
            String c_str = "子供"+String.valueOf(c)+"人";
            String b_str = "幼児"+String.valueOf(b)+"人";


            EditText adult_et = (EditText)viw.findViewById(R.id.adult);
            EditText child_et = (EditText)viw.findViewById(R.id.child);
            EditText baby_et = (EditText)viw.findViewById(R.id.adult);

            adult_et.setText(a_str);
            child_et.setText(c_str);
            baby_et.setText(b_str);


            alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                    // 最終入力日取得
                    Calendar today =Calendar.getInstance();
                    String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                    SharedPreferences.Editor etoday = prefs.edit();
                    etoday.putString("today",today_last);
                    etoday.commit();

                    EditText et = (EditText) viw.findViewById(R.id.kandumeText);
                    String str = et.getText().toString();

                    if(str.length() <= 0){
                        str = "0";
                    }

                    int i = Integer.parseInt(str);

                    SharedPreferences.Editor e = prefs.edit();
                    e.putInt("kandume",i);
                    // e.putString("ga"," ");
                    e.commit();

                    // Sub 画面を起動
                    Intent intent = new Intent();
                    intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                    startActivity(intent);
                    dialog.dismiss();


                }
            });
            //プリファレンス呼び出し
            SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
            kYear = cal.getInt("kyear",kYear);
            kMonth = cal.getInt("kmonth",kMonth);
            kday = cal.getInt("kday",kday);
            alert.setMessage("賞味期限は"+kYear+"年"+(kMonth+1)+"月"+kday+"日です。");

            alert.setView(viw);
            alert.show();

            ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
            btnCal.setOnClickListener(new View.OnClickListener(){
                public  void onClick(View v) {
                    //プリファレンス呼び出し
                    SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                    kYear = cal.getInt("kyear",kYear);
                    kMonth = cal.getInt("kmonth",kMonth);
                    kday = cal.getInt("kday",kday);

                    DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {


                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                            kYear = year;
                            kMonth = monthOfYear;
                            kday = dayOfMonth;
                            //プリファレンスに保存
                            SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                            SharedPreferences.Editor kyear = cal.edit();
                            SharedPreferences.Editor kmonth = cal.edit();
                            SharedPreferences.Editor kday = cal.edit();

                            kyear.putInt("kyear",year);
                            kmonth.putInt("kmonth",monthOfYear);
                            kday.putInt("kday",dayOfMonth);

                            kyear.commit();
                            kmonth.commit();
                            kday.commit();
                        }
                    };

                    kdatepickerdialog = new DatePickerDialog(
                            MainActivity.this,
                            listener,
                            kYear,
                            kMonth,
                            kday
                    );
                    kdatepickerdialog.show();

                }

            });
                }
            }
        });
        }


        TextView alart_kanmen = (TextView)findViewById(R.id.alart_kanmen);
        alart_kanmen.setText(pref.getString("alart_kanmen",""));
        if(pref.getString("alart_kanmen","")!="") {
            TextView testtext = (TextView) findViewById(R.id.alart_kanmen);
            testtext.setClickable(true);
            testtext.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.alart_kanmen) {
                        //アラートダイアログの出力
                        AlertDialog.Builder alert;
                        alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("乾麺");
                        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                        final View viw;
                        viw = inflater.inflate(R.layout.activity_kanmen, null);

                        //プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("kanmen", i);
                        String str = String.valueOf(i);

                        //必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.kanmenText);

                        //はいっちゃう
                        et.setText(str);

                        //大人子供幼児
                        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                        SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                        int a = adult.getInt("adult", 0);
                        int c = child.getInt("child",0);
                        int b = baby.getInt("baby",0);

                        String a_str = "大人"+String.valueOf(a)+"人";
                        String c_str = "子供"+String.valueOf(c)+"人";
                        String b_str = "幼児"+String.valueOf(b)+"人";


                        EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                        EditText child_et = (EditText)viw.findViewById(R.id.child);
                        EditText baby_et = (EditText)viw.findViewById(R.id.adult);

                        adult_et.setText(a_str);
                        child_et.setText(c_str);
                        baby_et.setText(b_str);


                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                                // 最終入力日取得
                                Calendar today =Calendar.getInstance();
                                String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                                SharedPreferences.Editor etoday = prefs.edit();
                                etoday.putString("today",today_last);
                                etoday.commit();

                                EditText et = (EditText) viw.findViewById(R.id.kanmenText);
                                String str = et.getText().toString();

                                if(str.length() <= 0){
                                    str = "0";
                                }

                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = prefs.edit();
                                e.putInt("kanmen",i);
                                // e.putString("ga"," ");
                                e.commit();

                                // Sub 画面を起動
                                Intent intent = new Intent();
                                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                                startActivity(intent);
                                dialog.dismiss();


                            }
                        });
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        kanYear = cal.getInt("kanyear",kanYear);
                        kanMonth = cal.getInt("kanmonth",kanMonth);
                        kanday = cal.getInt("kanday",kanday);
                        alert.setMessage("賞味期限は"+kanYear+"年"+(kanMonth+1)+"月"+kanday+"日です。");

                        alert.setView(viw);
                        alert.show();

                        ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                        btnCal.setOnClickListener(new View.OnClickListener(){
                            public  void onClick(View v) {
                                //プリファレンス呼び出し
                                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                                kanYear = cal.getInt("kanyear",kanYear);
                                kanMonth = cal.getInt("kanmonth",kanMonth);
                                kanday = cal.getInt("kanday",kanday);
                                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                        kanYear = year;
                                        kanMonth = monthOfYear;
                                        kanday = dayOfMonth;

                                        //プリファレンスに保存
                                        SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                        SharedPreferences.Editor kanyear = cal.edit();
                                        SharedPreferences.Editor kanmonth = cal.edit();
                                        SharedPreferences.Editor kanday = cal.edit();

                                        kanyear.putInt("kanyear",year);
                                        kanmonth.putInt("kanmonth",monthOfYear);
                                        kanday.putInt("kanday",dayOfMonth);

                                        kanyear.commit();
                                        kanmonth.commit();
                                        kanday.commit();
                                    }
                                };

                                kandatepickerdialog = new DatePickerDialog(
                                        MainActivity.this,
                                        listener,
                                        kanYear,
                                        kanMonth,
                                        kanday
                                );
                                kandatepickerdialog.show();

                            }

                        });

                    }
                }
            });
        }


        TextView alart_kanpan = (TextView)findViewById(R.id.alart_kanpan);
        alart_kanpan.setText(pref.getString("alart_kanpan",""));
        if(pref.getString("alart_kanpan","")!=""){
            // テキスト画面遷移
            TextView testtext = (TextView)findViewById(R.id.alart_kanpan);
            testtext.setClickable(true);
            testtext.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.alart_kanpan) {

                        //アラートダイアログの出力
                        AlertDialog.Builder alert;
                        alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("乾パン");
                        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                        final View viw;
                        viw = inflater.inflate(R.layout.activity_kanpan, null);

                        //プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("kanpan", i);
                        String str = String.valueOf(i);

                        //必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.kanpanText);

                        //はいっちゃう
                        et.setText(str);

                        //大人子供幼児
                        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                        SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                        int a = adult.getInt("adult", 0);
                        int c = child.getInt("child",0);
                        int b = baby.getInt("baby",0);

                        String a_str = "大人"+String.valueOf(a)+"人";
                        String c_str = "子供"+String.valueOf(c)+"人";
                        String b_str = "幼児"+String.valueOf(b)+"人";


                        EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                        EditText child_et = (EditText)viw.findViewById(R.id.child);
                        EditText baby_et = (EditText)viw.findViewById(R.id.adult);

                        adult_et.setText(a_str);
                        child_et.setText(c_str);
                        baby_et.setText(b_str);


                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                                // 最終入力日取得
                                Calendar today =Calendar.getInstance();
                                String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                                SharedPreferences.Editor etoday = prefs.edit();
                                etoday.putString("today",today_last);
                                etoday.commit();

                                EditText et = (EditText) viw.findViewById(R.id.kanpanText);
                                String str = et.getText().toString();

                                if(str.length() <= 0){
                                    str = "0";
                                }

                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = prefs.edit();
                                e.putInt("kanpan",i);
                                // e.putString("ga"," ");
                                e.commit();

                                // Sub 画面を起動
                                Intent intent = new Intent();
                                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                                startActivity(intent);
                                dialog.dismiss();


                            }
                        });
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        kanpanYear = cal.getInt("kanpanyear",kanpanYear);
                        kanpanMonth = cal.getInt("kanpanmonth",kanpanMonth);
                        kanpanday = cal.getInt("kanpanday",kanpanday);
                        alert.setMessage("賞味期限は"+kanpanYear+"年"+(kanpanMonth+1)+"月"+kanpanday+"日です。");

                        alert.setView(viw);
                        alert.show();

                        ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                        btnCal.setOnClickListener(new View.OnClickListener(){
                            public  void onClick(View v) {

                                //プリファレンス呼び出し
                                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                                kanpanYear = cal.getInt("kanpanyear",kanpanYear);
                                kanpanMonth = cal.getInt("kanpanmonth",kanpanMonth);
                                kanpanday = cal.getInt("kanpanday",kanpanday);
                                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                        kanpanYear = year;
                                        kanpanMonth = monthOfYear;
                                        kanpanday = dayOfMonth;

                                        //プリファレンスに保存
                                        SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                        SharedPreferences.Editor kanpanyear = cal.edit();
                                        SharedPreferences.Editor kanpanmonth = cal.edit();
                                        SharedPreferences.Editor kanpanday = cal.edit();

                                        kanpanyear.putInt("kanpanyear",year);
                                        kanpanmonth.putInt("kanpanmonth",monthOfYear);
                                        kanpanday.putInt("kanpanday",dayOfMonth);

                                        kanpanyear.commit();
                                        kanpanmonth.commit();
                                        kanpanday.commit();
                                    }
                                };

                                kanpandatepickerdialog = new DatePickerDialog(
                                        MainActivity.this,
                                        listener,
                                        kanpanYear,
                                        kanpanMonth,
                                        kanpanday
                                );
                                kanpandatepickerdialog.show();

                            }

                        });

                    }
                }
            });

        }

        TextView alart_r2 = (TextView)findViewById(R.id.alart_r2);
        alart_r2.setText(pref.getString("alart_r2",""));
        if(pref.getString("alart_r2","")!=""){
            // テキスト画面遷移
            TextView testtext = (TextView)findViewById(R.id.alart_r2);
            testtext.setClickable(true);
            testtext.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.alart_r2) {
                        //アラートダイアログの出力
                        AlertDialog.Builder alert;
                        alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("レトルト");
                        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                        final View viw;
                        viw = inflater.inflate(R.layout.activity_retoruto, null);

                        //プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("retoruto", i);
                        String str = String.valueOf(i);

                        //必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.retorutoText);

                        //はいっちゃう
                        et.setText(str);

                        //大人子供幼児
                        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                        SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                        int a = adult.getInt("adult", 0);
                        int c = child.getInt("child",0);
                        int b = baby.getInt("baby",0);

                        String a_str = "大人"+String.valueOf(a)+"人";
                        String c_str = "子供"+String.valueOf(c)+"人";
                        String b_str = "幼児"+String.valueOf(b)+"人";


                        EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                        EditText child_et = (EditText)viw.findViewById(R.id.child);
                        EditText baby_et = (EditText)viw.findViewById(R.id.adult);

                        adult_et.setText(a_str);
                        child_et.setText(c_str);
                        baby_et.setText(b_str);


                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                                // 最終入力日取得
                                Calendar today =Calendar.getInstance();
                                String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                                SharedPreferences.Editor etoday = prefs.edit();
                                etoday.putString("today",today_last);
                                etoday.commit();

                                EditText et = (EditText) viw.findViewById(R.id.retorutoText);
                                String str = et.getText().toString();
                                if(str.length() <= 0){
                                    str = "0";
                                }
                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = prefs.edit();
                                e.putInt("retoruto",i);
                                // e.putString("ga"," ");
                                e.commit();

                                // Sub 画面を起動
                                Intent intent = new Intent();
                                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                                startActivity(intent);
                                dialog.dismiss();


                            }
                        });
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        r2Year = cal.getInt("r2year",r2Year);
                        r2Month = cal.getInt("r2month",r2Month);
                        r2Day = cal.getInt("r2day",r2Day);
                        alert.setMessage("賞味期限は"+r2Year+"年"+(r2Month+1)+"月"+r2Day+"日です。");

                        alert.setView(viw);
                        alert.show();

                        ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                        btnCal.setOnClickListener(new View.OnClickListener(){
                            public  void onClick(View v) {

                                //プリファレンス呼び出し
                                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                                r2Year = cal.getInt("r2year",r2Year);
                                r2Month = cal.getInt("r2month",r2Month);
                                r2Day = cal.getInt("r2day",r2Day);
                                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                        r2Year = year;
                                        r2Month = monthOfYear;
                                        r2Day = dayOfMonth;

                                        //プリファレンスに保存
                                        SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                        SharedPreferences.Editor r2year = cal.edit();
                                        SharedPreferences.Editor r2month = cal.edit();
                                        SharedPreferences.Editor r2day = cal.edit();

                                        r2year.putInt("r2year",year);
                                        r2month.putInt("r2month",monthOfYear);
                                        r2day.putInt("r2day",dayOfMonth);

                                        r2year.commit();
                                        r2month.commit();
                                        r2day.commit();
                                    }
                                };

                                r2datepickerdialog = new DatePickerDialog(
                                        MainActivity.this,
                                        listener,
                                        r2Year,
                                        r2Month,
                                        r2Day
                                );
                                r2datepickerdialog.show();

                            }

                        });


                    }
                }
            });
        }

        TextView alart_k2 = (TextView)findViewById(R.id.alart_k2);
        alart_k2.setText(pref.getString("alart_kan2",""));
        if(pref.getString("alart_k2","")!=""){
            // テキスト画面遷移
            TextView testtext = (TextView)findViewById(R.id.alart_k2);
            testtext.setClickable(true);
            testtext.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.alart_k2) {
                        //アラートダイアログの出力
                        AlertDialog.Builder alert;
                        alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("缶詰");
                        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                        final View viw;
                        viw = inflater.inflate(R.layout.activity_kandume_syusai, null);

                        //プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("kandumes", i);
                        String str = String.valueOf(i);

                        //必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.kansyuText);

                        //はいっちゃう
                        et.setText(str);

                        //大人子供幼児
                        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                        SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                        int a = adult.getInt("adult", 0);
                        int c = child.getInt("child",0);
                        int b = baby.getInt("baby",0);

                        String a_str = "大人"+String.valueOf(a)+"人";
                        String c_str = "子供"+String.valueOf(c)+"人";
                        String b_str = "幼児"+String.valueOf(b)+"人";


                        EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                        EditText child_et = (EditText)viw.findViewById(R.id.child);
                        EditText baby_et = (EditText)viw.findViewById(R.id.adult);

                        adult_et.setText(a_str);
                        child_et.setText(c_str);
                        baby_et.setText(b_str);


                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                                // 最終入力日取得
                                Calendar today =Calendar.getInstance();
                                String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                                SharedPreferences.Editor etoday = prefs.edit();
                                etoday.putString("today",today_last);
                                etoday.commit();

                                EditText et = (EditText) viw.findViewById(R.id.kansyuText);
                                String str = et.getText().toString();

                                if(str.length() <= 0){
                                    str = "0";
                                }

                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = prefs.edit();
                                e.putInt("kandumes",i);
                                // e.putString("ga"," ");
                                e.commit();

                                // Sub 画面を起動
                                Intent intent = new Intent();
                                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                                startActivity(intent);
                                dialog.dismiss();


                            }
                        });
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        r2Year = cal.getInt("r2year",r2Year);
                        r2Month = cal.getInt("r2month",r2Month);
                        r2Day = cal.getInt("r2day",r2Day);
                        alert.setMessage("賞味期限は"+r2Year+"年"+(r2Month+1)+"月"+r2Day+"日です。");

                        alert.setView(viw);
                        alert.show();

                        ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                        btnCal.setOnClickListener(new View.OnClickListener(){
                            public  void onClick(View v) {

                                //プリファレンス呼び出し

                                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                                k2Year = cal.getInt("k2year",k2Year);
                                k2Month = cal.getInt("k2month",k2Month);
                                k2Day = cal.getInt("k2day",k2Day);
                                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                        k2Year = year;
                                        k2Month = monthOfYear;
                                        k2Day = dayOfMonth;

                                        //プリファレンスに保存
                                        SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                        SharedPreferences.Editor k2year = cal.edit();
                                        SharedPreferences.Editor k2month = cal.edit();
                                        SharedPreferences.Editor k2day = cal.edit();

                                        k2year.putInt("k2year",year);
                                        k2month.putInt("k2month",monthOfYear);
                                        k2day.putInt("k2day",dayOfMonth);

                                        k2year.commit();
                                        k2month.commit();
                                        k2day.commit();
                                    }
                                };

                                k2datepickerdialog = new DatePickerDialog(
                                        MainActivity.this,
                                        listener,
                                        k2Year,
                                        k2Month,
                                        k2Day
                                );
                                k2datepickerdialog.show();

                            }

                        });

                    }
                }
            });
        }

        TextView alart_f = (TextView)findViewById(R.id.alart_f);
        alart_f.setText(pref.getString("alart_f",""));
        if (pref.getString("alart_f","")!=""){
            // テキスト画面遷移
            TextView testtext = (TextView)findViewById(R.id.alart_f);
            testtext.setClickable(true);
            testtext.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.alart_f) {

                        //アラートダイアログの出力
                        AlertDialog.Builder alert;
                        alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("フリーズドライ");
                        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                        final View viw;
                        viw = inflater.inflate(R.layout.activity_freaze, null);

                        //プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                        SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);

                        int i = 0;
                        i = pref.getInt("freaze", i);
                        int a = adult.getInt("adult", 0);
                        int c = child.getInt("child",0);
                        int b = baby.getInt("baby",0);


                        String str = String.valueOf(i);
                        String a_str = "大人"+String.valueOf(a)+"人";
                        String c_str = "子供"+String.valueOf(c)+"人";
                        String b_str = "幼児"+String.valueOf(b)+"人";

                        //必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.freazeText);
                        EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                        EditText child_et = (EditText)viw.findViewById(R.id.child);
                        EditText baby_et = (EditText)viw.findViewById(R.id.adult);


                        //はいっちゃう
                        et.setText(str);
                        adult_et.setText(a_str);
                        child_et.setText(c_str);
                        baby_et.setText(b_str);


                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                                // 最終入力日取得
                                Calendar today =Calendar.getInstance();
                                String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                                SharedPreferences.Editor etoday = prefs.edit();
                                etoday.putString("today",today_last);
                                etoday.commit();

                                EditText et = (EditText) viw.findViewById(R.id.freazeText);
                                String str = et.getText().toString();

                                if(str.length() <= 0){
                                    str = "0";
                                }
                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = prefs.edit();
                                e.putInt("freaze",i);
                                // e.putString("ga"," ");
                                e.commit();

                                // Sub 画面を起動
                                Intent intent = new Intent();
                                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                                startActivity(intent);
                                dialog.dismiss();


                            }
                        });

                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        fYear = cal.getInt("fyear",fYear);
                        fMonth = cal.getInt("fmonth",fMonth);
                        fDay = cal.getInt("fday",fDay);
                        alert.setMessage("賞味期限は"+fYear+"年"+(fMonth+1)+"月"+fDay+"日です。");

                        alert.setView(viw);
                        alert.show();

                        ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                        btnCal.setOnClickListener(new View.OnClickListener(){
                            public  void onClick(View v) {

                                //プリファレンス呼び出し
                                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                                fYear = cal.getInt("fyear",fYear);
                                fMonth = cal.getInt("fmonth",fMonth);
                                fDay = cal.getInt("fday",fDay);
                                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                        fYear = year;
                                        fMonth = monthOfYear;
                                        fDay = dayOfMonth;

                                        //プリファレンスに保存
                                        SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                        SharedPreferences.Editor fyear = cal.edit();
                                        SharedPreferences.Editor fmonth = cal.edit();
                                        SharedPreferences.Editor fday = cal.edit();

                                        fyear.putInt("fyear",year);
                                        fmonth.putInt("fmonth",monthOfYear);
                                        fday.putInt("fday",dayOfMonth);

                                        fyear.commit();
                                        fmonth.commit();
                                        fday.commit();
                                    }
                                };

                                fdatepickerdialog = new DatePickerDialog(
                                        MainActivity.this,
                                        listener,
                                        fYear,
                                        fMonth,
                                        fDay
                                );
                                fdatepickerdialog.show();

                            }

                        });


                    }
                }
            });
        }

        TextView alart_kal = (TextView)findViewById(R.id.alart_kal);
        alart_kal.setText(pref.getString("alart_karo",""));
        if(pref.getString("alart_karo","")!=""){
            // テキスト画面遷移
            TextView testtext = (TextView)findViewById(R.id.alart_kal);
            testtext.setClickable(true);
            testtext.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.alart_kal) {

                        //アラートダイアログの出力
                        AlertDialog.Builder alert;
                        alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("カロリーメイト");
                        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                        final View viw;
                        viw = inflater.inflate(R.layout.activity_karori, null);

                        //プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("karori", i);
                        String str = String.valueOf(i);

                        //必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.karoriText);

                        //はいっちゃう
                        et.setText(str);

                        //大人子供幼児
                        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                        SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                        int a = adult.getInt("adult", 0);
                        int c = child.getInt("child",0);
                        int b = baby.getInt("baby",0);

                        String a_str = "大人"+String.valueOf(a)+"人";
                        String c_str = "子供"+String.valueOf(c)+"人";
                        String b_str = "幼児"+String.valueOf(b)+"人";


                        EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                        EditText child_et = (EditText)viw.findViewById(R.id.child);
                        EditText baby_et = (EditText)viw.findViewById(R.id.adult);

                        adult_et.setText(a_str);
                        child_et.setText(c_str);
                        baby_et.setText(b_str);


                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                                // 最終入力日取得
                                Calendar today =Calendar.getInstance();
                                String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                                SharedPreferences.Editor etoday = prefs.edit();
                                etoday.putString("today",today_last);
                                etoday.commit();

                                EditText et = (EditText) viw.findViewById(R.id.karoriText);
                                String str = et.getText().toString();
                                if(str.length() <= 0){
                                    str = "0";
                                }
                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = prefs.edit();
                                e.putInt("karori",i);
                                // e.putString("ga"," ");
                                e.commit();

                                // Sub 画面を起動
                                Intent intent = new Intent();
                                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                                startActivity(intent);
                                dialog.dismiss();


                            }
                        });
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        karoYear = cal.getInt("kalyear",karoYear);
                        karoMonth = cal.getInt("kalmonth",karoMonth);
                        karoDay = cal.getInt("kalday",karoDay);
                        alert.setMessage("賞味期限は"+karoYear+"年"+(karoMonth+1)+"月"+karoDay+"日です。");

                        alert.setView(viw);
                        alert.show();

                        ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                        btnCal.setOnClickListener(new View.OnClickListener(){
                            public  void onClick(View v) {
                                //プリファレンス呼び出し
                                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                                karoYear = cal.getInt("kalyear",karoYear);
                                karoMonth = cal.getInt("kalmonth",karoMonth);
                                karoDay = cal.getInt("kalday",karoDay);
                                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                        karoYear = year;
                                        karoMonth = monthOfYear;
                                        karoDay = dayOfMonth;

                                        //プリファレンスに保存
                                        SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                        SharedPreferences.Editor kalyear = cal.edit();
                                        SharedPreferences.Editor kalmonth = cal.edit();
                                        SharedPreferences.Editor kalday = cal.edit();

                                        kalyear.putInt("kalyear",year);
                                        kalmonth.putInt("kalmonth",monthOfYear);
                                        kalday.putInt("kalday",dayOfMonth);

                                        kalyear.commit();
                                        kalmonth.commit();
                                        kalday.commit();
                                    }
                                };

                                karodatepickerdialog = new DatePickerDialog(
                                        MainActivity.this,
                                        listener,
                                        karoYear,
                                        karoMonth,
                                        karoDay
                                );
                                karodatepickerdialog.show();

                            }

                        });

                    }
                }
            });
        }

        TextView alart_oka = (TextView)findViewById(R.id.alart_oka);
        alart_oka.setText(pref.getString("alart_oka",""));
        if(pref.getString("alart_oka","")!=""){
            // テキスト画面遷移
            TextView testtext = (TextView)findViewById(R.id.alart_oka);
            testtext.setClickable(true);
            testtext.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.alart_oka) {

                        //アラートダイアログの出力
                        AlertDialog.Builder alert;
                        alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("お菓子");
                        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                        final View viw;
                        viw = inflater.inflate(R.layout.activity_okasi, null);

                        //プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("okasi", i);
                        String str = String.valueOf(i);



                        //必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.okasiText);

                        //はいっちゃう
                        et.setText(str);

                        //大人子供幼児
                        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                        SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                        int a = adult.getInt("adult", 0);
                        int c = child.getInt("child",0);
                        int b = baby.getInt("baby",0);

                        String a_str = "大人"+String.valueOf(a)+"人";
                        String c_str = "子供"+String.valueOf(c)+"人";
                        String b_str = "幼児"+String.valueOf(b)+"人";


                        EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                        EditText child_et = (EditText)viw.findViewById(R.id.child);
                        EditText baby_et = (EditText)viw.findViewById(R.id.adult);

                        adult_et.setText(a_str);
                        child_et.setText(c_str);
                        baby_et.setText(b_str);


                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                                //最終入力日を保存
                                Calendar today =Calendar.getInstance();
                                String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                                SharedPreferences.Editor etoday = prefs.edit();
                                etoday.putString("today",today_last);
                                etoday.commit();

                                EditText et = (EditText) viw.findViewById(R.id.okasiText);
                                String str = et.getText().toString();

                                if(str.length() <= 0){
                                    str = "0";
                                }

                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = prefs.edit();

                                e.putInt("okasi",i);
                                // e.putString("ga"," ");
                                e.commit();
                                // Sub 画面を起動
                                Intent intent = new Intent();
                                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                                startActivity(intent);

                                dialog.dismiss();


                            }
                        });

                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        okaYear = cal.getInt("okayear",okaYear);
                        okaMonth = cal.getInt("okamonth",okaMonth);
                        okaDay = cal.getInt("okaday",okaDay);

                        alert.setMessage("賞味期限は"+okaYear+"年"+(okaMonth+1)+"月"+okaDay+"日です。");

                        alert.setView(viw);
                        alert.show();


                        ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                        btnCal.setOnClickListener(new View.OnClickListener(){
                            public  void onClick(View v) {
                                //プリファレンス呼び出し
                                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                                okaYear = cal.getInt("okayear",okaYear);
                                okaMonth = cal.getInt("okamonth",okaMonth);
                                okaDay = cal.getInt("okaday",okaDay);

                                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                        okaYear = year;
                                        okaMonth = monthOfYear;
                                        okaDay = dayOfMonth;

                                        //プリファレンスに保存
                                        SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                        SharedPreferences.Editor okayear = cal.edit();
                                        SharedPreferences.Editor okamonth = cal.edit();
                                        SharedPreferences.Editor okaday = cal.edit();

                                        okayear.putInt("okayear",year);
                                        okamonth.putInt("okamonth",monthOfYear);
                                        okaday.putInt("okaday",dayOfMonth);

                                        okayear.commit();
                                        okamonth.commit();
                                        okaday.commit();
                                    }
                                };
                                okadatepickerdialog = new DatePickerDialog(
                                        MainActivity.this,
                                        listener,
                                        okaYear,
                                        okaMonth,
                                        okaDay
                                );


                                okadatepickerdialog.show();

                            }

                        });


                    }
                }
            });
        }

        TextView alart_rinyuu = (TextView)findViewById(R.id.alart_rinyuu);
        alart_rinyuu.setText(pref.getString("alart_rinyuu",""));
        if(pref.getString("alart_rinyuu","")!=""){
            // テキスト画面遷移
            TextView testtext = (TextView)findViewById(R.id.alart_rinyuu);
            testtext.setClickable(true);
            testtext.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.alart_rinyuu) {

                        //アラートダイアログの出力
                        AlertDialog.Builder alert;
                        alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("離乳食");
                        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                        final View viw;
                        viw = inflater.inflate(R.layout.activity_pokari, null);

                        //プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("rinyuu", i);
                        String str = String.valueOf(i);

                        //必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.pokariText);

                        //はいっちゃう
                        et.setText(str);

                        //大人子供幼児
                        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                        SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                        int a = adult.getInt("adult", 0);
                        int c = child.getInt("child",0);
                        int b = baby.getInt("baby",0);

                        String a_str = "大人"+String.valueOf(a)+"人";
                        String c_str = "子供"+String.valueOf(c)+"人";
                        String b_str = "幼児"+String.valueOf(b)+"人";


                        EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                        EditText child_et = (EditText)viw.findViewById(R.id.child);
                        EditText baby_et = (EditText)viw.findViewById(R.id.adult);

                        adult_et.setText(a_str);
                        child_et.setText(c_str);
                        baby_et.setText(b_str);


                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                                // 最終入力日取得
                                Calendar today =Calendar.getInstance();
                                String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                                SharedPreferences.Editor etoday = prefs.edit();
                                etoday.putString("today",today_last);
                                etoday.commit();

                                EditText et = (EditText) viw.findViewById(R.id.pokariText);
                                String str = et.getText().toString();

                                if(str.length() <= 0){
                                    str = "0";
                                }

                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = prefs.edit();
                                e.putInt("rinyuu",i);
                                // e.putString("ga"," ");
                                e.commit();
                                // Sub 画面を起動
                                Intent intent = new Intent();
                                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                                startActivity(intent);

                                dialog.dismiss();


                            }
                        });
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        pYear = cal.getInt("pyear",pYear);
                        pMonth = cal.getInt("pmonth",pMonth);
                        pDay = cal.getInt("pday",pDay);
                        alert.setMessage("賞味期限は"+pYear+"年"+(pMonth+1)+"月"+pDay+"日です。");

                        alert.setView(viw);
                        alert.show();

                        ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                        btnCal.setOnClickListener(new View.OnClickListener(){
                            public  void onClick(View v) {

                                //プリファレンス呼び出し
                                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                                pYear = cal.getInt("pyear",pYear);
                                pMonth = cal.getInt("pmonth",pMonth);
                                pDay = cal.getInt("pday",pDay);
                                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                        pYear = year;
                                        pMonth = monthOfYear;
                                        pDay = dayOfMonth;

                                        //プリファレンスに保存
                                        SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                        SharedPreferences.Editor pyear = cal.edit();
                                        SharedPreferences.Editor pmonth = cal.edit();
                                        SharedPreferences.Editor pday = cal.edit();

                                        pyear.putInt("pyear",year);
                                        pmonth.putInt("pmonth",monthOfYear);
                                        pday.putInt("pday",dayOfMonth);

                                        pyear.commit();
                                        pmonth.commit();
                                        pday.commit();
                                    }
                                };

                                pdatepickerdialog = new DatePickerDialog(
                                        MainActivity.this,
                                        listener,
                                        pYear,
                                        pMonth,
                                        pDay
                                );
                                pdatepickerdialog.show();

                            }

                        });

                    }
                }
            });
        }

        TextView alart_kona = (TextView)findViewById(R.id.alart_kona);
        alart_kona.setText(pref.getString("alart_kona",""));
        if(pref.getString("alart_kona","")!=""){
            // テキスト画面遷移
            TextView testtext = (TextView)findViewById(R.id.alart_kona);
            testtext.setClickable(true);
            testtext.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.alart_kona) {
                        //アラートダイアログの出力
                        AlertDialog.Builder alert;
                        alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("粉ミルク");
                        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                        final View viw;
                        viw = inflater.inflate(R.layout.activity_konamilk, null);

                        //プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("konamilk", i);
                        String str = String.valueOf(i);

                        //必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.konaText);

                        //はいっちゃう
                        et.setText(str);

                        //大人子供幼児
                        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                        SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                        int a = adult.getInt("adult", 0);
                        int c = child.getInt("child",0);
                        int b = baby.getInt("baby",0);

                        String a_str = "大人"+String.valueOf(a)+"人";
                        String c_str = "子供"+String.valueOf(c)+"人";
                        String b_str = "幼児"+String.valueOf(b)+"人";


                        EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                        EditText child_et = (EditText)viw.findViewById(R.id.child);
                        EditText baby_et = (EditText)viw.findViewById(R.id.adult);

                        adult_et.setText(a_str);
                        child_et.setText(c_str);
                        baby_et.setText(b_str);


                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                                // 最終入力日取得
                                Calendar today =Calendar.getInstance();
                                String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                                SharedPreferences.Editor etoday = prefs.edit();
                                etoday.putString("today",today_last);
                                etoday.commit();

                                EditText et = (EditText) viw.findViewById(R.id.konaText);
                                String str = et.getText().toString();

                                if(str.length() <= 0){
                                    str = "0";
                                }

                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = prefs.edit();
                                e.putInt("konamilk",i);
                                // e.putString("ga"," ");
                                e.commit();

                                // Sub 画面を起動
                                Intent intent = new Intent();
                                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                                startActivity(intent);

                                dialog.dismiss();


                            }
                        });
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        pYear = cal.getInt("konayear",pYear);
                        pMonth = cal.getInt("konamonth",pMonth);
                        pDay = cal.getInt("konaday",pDay);
                        alert.setMessage("賞味期限は"+pYear+"年"+(pMonth+1)+"月"+pDay+"日です。");

                        alert.setView(viw);
                        alert.show();

                        ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                        btnCal.setOnClickListener(new View.OnClickListener(){
                            public  void onClick(View v) {

                                //プリファレンス呼び出し
                                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                                pYear = cal.getInt("konayear",pYear);
                                pMonth = cal.getInt("konamonth",pMonth);
                                pDay = cal.getInt("konaday",pDay);
                                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                        pYear = year;
                                        pMonth = monthOfYear;
                                        pDay = dayOfMonth;

                                        //プリファレンスに保存
                                        SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                        SharedPreferences.Editor konayear = cal.edit();
                                        SharedPreferences.Editor konamonth = cal.edit();
                                        SharedPreferences.Editor konaday = cal.edit();

                                        konayear.putInt("konayear",year);
                                        konamonth.putInt("konamonth",monthOfYear);
                                        konaday.putInt("konaday",dayOfMonth);

                                        konayear.commit();
                                        konamonth.commit();
                                        konaday.commit();
                                    }
                                };

                                pdatepickerdialog = new DatePickerDialog(
                                        MainActivity.this,
                                        listener,
                                        pYear,
                                        pMonth,
                                        pDay
                                );
                                pdatepickerdialog.show();

                            }

                        });

                    }
                }
            });
        }
        int adult_s=0,baby_s=0,child_s=0,cop_sum=0,utuwa_sum=0,taoru_sum=0,gun_sum=0;
        int kodomo,kai,cop,utuwa,taoru,arumi,rap,hukuro,spoon,hasi,denti,radio,kankiri,masuku,juudenn,bin,omutu;
        double hituju_sum=0,benri_sum=0,
                nebukuro_sum=0;
        String str_sp;


        switch (hoge) {
            case 0:
                if(baby_n>=1) {
                    otona = pref.getInt("sitagi", 0);
                    if (otona >= adult_n * 2) {
                        otona = adult_n * 2;
                    }

                    kodomo = pref.getInt("kodomo", 0);
                    if (kodomo >= child_n * 2) {
                        kodomo = child_n * 2;
                    }

                    cop = pref.getInt("koppu", 0);
                    if (cop >= adult_n * 1) {
                        adult_s = adult_n * 1;
                    }
                    cop = cop - adult_s;
                    if (cop >= child_n * 1) {
                        child_s = child_n * 1;
                    }
                    cop = cop - child_s;
                    if (cop >= baby_n * 1) {
                        baby_s = baby_n * 1;
                    }
                    cop_sum = adult_s + child_s + baby_s;
                    adult_s = 0;
                    baby_s = 0;
                    child_s = 0;

                    utuwa = pref.getInt("utuwa", 0);
                    if (utuwa >= adult_n * 1) {
                        adult_s = adult_n * 1;
                    }
                    utuwa = utuwa - adult_s;
                    if (utuwa >= child_n * 1) {
                        child_s = child_n * 1;
                    }
                    utuwa = utuwa - child_s;
                    if (utuwa >= baby_n * 1) {
                        baby_s = baby_n * 1;
                    }
                    utuwa_sum = adult_s + child_s + baby_s;
                    adult_s = 0;
                    baby_s = 0;
                    child_s = 0;

                    taoru = pref.getInt("taoru", 0);
                    if (taoru >= adult_n * 3) {
                        adult_s = adult_n * 3;
                    }
                    taoru = taoru - adult_s;
                    if (taoru >= child_n * 3) {
                        child_s = child_n * 3;
                    }
                    taoru = taoru - child_s;
                    if (taoru >= baby_n * 6) {
                        baby_s = baby_n * 6;
                    }

                    taoru_sum = adult_s + child_s + baby_s;
                    adult_s = 0;
                    baby_s = 0;
                    child_s = 0;

                    arumi = pref.getInt("almi", 0);
                    if (arumi >= adult_n * 2) {
                        arumi = adult_n * 2;
                    }

                    rap = pref.getInt("rap", 0);
                    if (rap >= adult_n * 3) {
                        rap = adult_n * 3;
                    }

                    if (b >= 5) {
                        b = 5;
                    }

                    if (g >= 1) {
                        g = 1;
                    }

                    if (t >= 3) {
                        t = 3;
                    }

                    kai = pref.getInt("kaityuu", 0);
                    if (kai >= 1) {
                        kai = 1;
                    }

                    hukuro = pref.getInt("hukuro", 0);
                    if (hukuro >= 1) {
                        hukuro = 1;
                    }

                    spoon = pref.getInt("spoon", 0);
                    if (spoon >= 1) {
                        spoon = 1;
                    }

                    hasi = pref.getInt("hasi", 0);
                    if (hasi >= 1) {
                        hasi = 1;
                    }

                    denti = pref.getInt("denti", 0);
                    if (denti >= 4) {
                        denti = 4;
                    }
                    bin = pref.getInt("bin",0);
                    if(bin>=1){bin=1;}
                    omutu = pref.getInt("omutu",0);
                    if(omutu>=10){omutu=10;}

                    hituju_sum = otona + kodomo + kai + cop_sum + utuwa_sum + taoru_sum + arumi + rap + b + g + t + hukuro + spoon + hasi + denti+bin+omutu;
                    MAX = adult_n * 7 + child_n * 7 + baby_n * 19 + 22;
                    hituju_sum = (hituju_sum / MAX) * 60;
                }


                else{
                    otona = pref.getInt("sitagi", 0);
                    if (otona >= adult_n * 2) {
                        otona = adult_n * 2;
                    }

                    kodomo = pref.getInt("kodomo", 0);
                    if (kodomo >= child_n * 2) {
                        kodomo = child_n * 2;
                    }

                    cop = pref.getInt("koppu", 0);
                    if (cop >= adult_n * 1) {
                        adult_s = adult_n * 1;
                    }
                    cop = cop - adult_s;
                    if (cop >= child_n * 1) {
                        child_s = child_n * 1;
                    }
                    cop = cop - child_s;
                    if (cop >= baby_n * 1) {
                        baby_s = baby_n * 1;
                    }
                    cop_sum = adult_s + child_s + baby_s;
                    adult_s = 0;
                    baby_s = 0;
                    child_s = 0;

                    utuwa = pref.getInt("utuwa", 0);
                    if (utuwa >= adult_n * 1) {
                        adult_s = adult_n * 1;
                    }
                    utuwa = utuwa - adult_s;
                    if (utuwa >= child_n * 1) {
                        child_s = child_n * 1;
                    }
                    utuwa = utuwa - child_s;
                    if (utuwa >= baby_n * 1) {
                        baby_s = baby_n * 1;
                    }
                    utuwa_sum = adult_s + child_s + baby_s;
                    adult_s = 0;
                    baby_s = 0;
                    child_s = 0;

                    taoru = pref.getInt("taoru", 0);
                    if (taoru >= adult_n * 3) {
                        adult_s = adult_n * 3;
                    }
                    taoru = taoru - adult_s;
                    if (taoru >= child_n * 3) {
                        child_s = child_n * 3;
                    }
                    taoru = taoru - child_s;
                    if (taoru >= baby_n * 6) {
                        baby_s = baby_n * 6;
                    }

                    taoru_sum = adult_s + child_s + baby_s;
                    adult_s = 0;
                    baby_s = 0;
                    child_s = 0;

                    arumi = pref.getInt("almi", 0);
                    if (arumi >= adult_n * 2) {
                        arumi = adult_n * 2;
                    }

                    rap = pref.getInt("rap", 0);
                    if (rap >= adult_n * 3) {
                        rap = adult_n * 3;
                    }

                    if (b >= 5) {
                        b = 5;
                    }

                    if (g >= 1) {
                        g = 1;
                    }

                    if (t >= 3) {
                        t = 3;
                    }

                    kai = pref.getInt("kaityuu", 0);
                    if (kai >= 1) {
                        kai = 1;
                    }

                    hukuro = pref.getInt("hukuro", 0);
                    if (hukuro >= 1) {
                        hukuro = 1;
                    }

                    spoon = pref.getInt("spoon", 0);
                    if (spoon >= 1) {
                        spoon = 1;
                    }

                    hasi = pref.getInt("hasi", 0);
                    if (hasi >= 1) {
                        hasi = 1;
                    }

                    denti = pref.getInt("denti", 0);
                    if (denti >= 4) {
                        denti = 4;
                    }

                    hituju_sum = otona + kodomo + kai + cop_sum + utuwa_sum + taoru_sum + arumi + rap + b + g + t + hukuro + spoon + hasi + denti;
                    MAX = adult_n * 7 + child_n * 7 + baby_n * 8 + 22;
                    hituju_sum = (hituju_sum / MAX) * 60;
                }
            //便利品の計算
            if(gun>=adult_n*1){adult_s=adult_n*1;}
            gun=gun-adult_s;
            if(gun>=child_n*1){child_s=child_n*1;}
            gun_sum=adult_s+child_s;
            adult_s = 0;
            baby_s = 0;
            child_s = 0;

            if(nebukuro>=adult_n*1){adult_s=adult_n*1;}
            nebukuro=nebukuro-adult_s;
            if(nebukuro>=child_n*1){child_s=child_n*1;}
            nebukuro_sum=adult_s+child_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

            if(h>=1){h=1;}

            if(m>=1){m=1;}

            radio=pref.getInt("radio",0);
            if(radio>=1){radio=1;}

            kankiri=pref.getInt("kankiri",0);
            if(kankiri>=1){kankiri=1;}

            masuku = pref.getInt("masuku",0);
            if(masuku>=1){masuku=1;}

            juudenn = pref.getInt("juudennki",0);
            if(juudenn>=1){juudenn=1;}

            benri_sum=gun_sum+nebukuro_sum+h+m+radio+kankiri+masuku+juudenn;
            MAX=adult_n*2+child_n*2+6;
            benri_sum = (benri_sum/MAX)*40;

            int y = (int)hituju_sum+(int)benri_sum;
            str_sp = "備蓄は" + y + "%です。";

            TextView et5 = (TextView) findViewById(R.id.stock_p);
            et5.setText(str_sp);
            if (y >= 10 && y < 20) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.graph1);
            } else if (y >= 20 && y < 30) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.graph2);
            } else if (y >= 30 && y < 40) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.graph3);
            } else if (y >= 40 && y < 50) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.graph4);
            } else if (y >= 50 && y < 60) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.graph5);
            } else if (y >= 60 && y < 70) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.graph6);
            } else if (y >= 70 && y < 80) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.graph7);
            } else if (y >= 80 && y < 90) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.graph8);
            } else if (y >= 90 && y < 100) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.graph9);
            } else if (y == 100) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.graph10);
            }
            break;

            case 1:
                otona = pref.getInt("sitagi", 0);
                if (otona >= adult_n * 1) {
                    otona = adult_n * 1;
                }

                kodomo = pref.getInt("kodomo", 0);
                if (kodomo >= child_n * 1) {
                    kodomo = child_n * 1;
                }

                cop = pref.getInt("koppu", 0);
                if (cop >= adult_n * 1) {
                    adult_s = adult_n * 1;
                }
                cop = cop - adult_s;
                if (cop >= child_n * 1) {
                    child_s = child_n * 1;
                }
                cop = cop - child_s;
                if (cop >= baby_n * 1) {
                    baby_s = baby_n * 1;
                }
                cop_sum = adult_s + child_s + baby_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

                utuwa = pref.getInt("utuwa", 0);
                if (utuwa >= adult_n * 1) {
                    adult_s = adult_n * 1;
                }
                utuwa = utuwa - adult_s;
                if (utuwa >= child_n * 1) {
                    child_s = child_n * 1;
                }
                utuwa = utuwa - child_s;
                if (utuwa >= baby_n * 1) {
                    baby_s = baby_n * 1;
                }
                utuwa_sum = adult_s + child_s + baby_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

                taoru = pref.getInt("taoru", 0);
                if (taoru >= adult_n * 1) {
                    adult_s = adult_n * 1;
                }
                taoru = taoru - adult_s;
                if (taoru >= child_n * 1) {
                    child_s = child_n * 1;
                }
                taoru = taoru - child_s;
                if (taoru >= baby_n * 2) {
                    baby_s = baby_n * 2;
                }

                taoru_sum = adult_s + child_s + baby_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

                arumi = pref.getInt("almi", 0);
                if (arumi >= adult_n * 1) {
                    arumi = adult_n * 1;
                }

                rap = pref.getInt("rap", 0);
                if (rap >= adult_n * 1) {
                    rap = adult_n * 1;
                }

                if (b >= 2) {
                    b = 2;
                }

                if (g >= 1) {
                    g = 1;
                }

                if (t >= 1) {
                    t = 1;
                }

                kai = pref.getInt("kaityuu", 0);
                if (kai >= 1) {
                    kai = 1;
                }

                hukuro = pref.getInt("hukuro", 0);
                if (hukuro >= 1) {
                    hukuro = 1;
                }

                spoon = pref.getInt("spoon", 0);
                if (spoon >= 1) {
                    spoon = 1;
                }

                hasi = pref.getInt("hasi", 0);
                if (hasi >= 1) {
                    hasi = 1;
                }

                denti = pref.getInt("denti", 0);
                if (denti >= 2) {
                    denti = 2;
                }

                hituju_sum = otona+kodomo+kai+cop_sum+utuwa_sum+taoru_sum+arumi+rap+b+g+t+hukuro+spoon+hasi+denti;
                MAX=adult_n*4+child_n*4+baby_n*4+12;
                hituju_sum = (hituju_sum/MAX)*60;

                //便利品の計算
                if(gun>=adult_n*1){adult_s=adult_n*1;}
                gun=gun-adult_s;
                if(gun>=child_n*1){child_s=child_n*1;}
                gun_sum=adult_s+child_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

                if(nebukuro>=adult_n*1){adult_s=adult_n*1;}
                nebukuro=nebukuro-adult_s;
                if(nebukuro>=child_n*1){child_s=child_n*1;}
                nebukuro_sum=adult_s+child_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

                if(h>=1){h=1;}

                if(m>=1){m=1;}

                radio=pref.getInt("radio",0);
                if(radio>=1){radio=1;}

                kankiri=pref.getInt("kankiri",0);
                if(kankiri>=1){kankiri=1;}

                masuku = pref.getInt("masuku",0);
                if(masuku>=1){masuku=1;}

                juudenn = pref.getInt("juudennki",0);
                if(juudenn>=1){juudenn=1;}

                benri_sum=gun_sum+nebukuro_sum+h+m+radio+kankiri+masuku+juudenn;
                MAX=adult_n*2+child_n*2+6;
                benri_sum = (benri_sum/MAX)*40;

                int cy = (int)hituju_sum+(int)benri_sum;
                str_sp = "備蓄は" + cy + "%です。";

                TextView cet5 = (TextView) findViewById(R.id.stock_p);
                cet5.setText(str_sp);
                if (cy >= 10 && cy < 20) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph1);
                } else if (cy >= 20 && cy < 30) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph2);
                } else if (cy >= 30 && cy < 40) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph3);
                } else if (cy >= 40 && cy < 50) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph4);
                } else if (cy >= 50 && cy < 60) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph5);
                } else if (cy >= 60 && cy < 70) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph6);
                } else if (cy >= 70 && cy < 80) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph7);
                } else if (cy >= 80 && cy < 90) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph8);
                } else if (cy >= 90 && cy < 100) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph9);
                } else if (cy == 100) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph10);
                }
                break;

            case 2:
                otona = pref.getInt("sitagi", 0);
                if (otona >= adult_n * 0) {
                    otona = adult_n * 0;
                }

                kodomo = pref.getInt("kodomo", 0);
                if (kodomo >= child_n * 1) {
                    kodomo = child_n * 1;
                }

                cop = pref.getInt("koppu", 0);
                if (cop >= adult_n * 1) {
                    adult_s = adult_n * 1;
                }
                cop = cop - adult_s;
                if (cop >= child_n * 1) {
                    child_s = child_n * 1;
                }
                cop = cop - child_s;
                if (cop >= baby_n * 1) {
                    baby_s = baby_n * 1;
                }
                cop_sum = adult_s + child_s + baby_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

                utuwa = pref.getInt("utuwa", 0);
                if (utuwa >= adult_n * 1) {
                    adult_s = adult_n * 1;
                }
                utuwa = utuwa - adult_s;
                if (utuwa >= child_n * 1) {
                    child_s = child_n * 1;
                }
                utuwa = utuwa - child_s;
                if (utuwa >= baby_n * 1) {
                    baby_s = baby_n * 1;
                }
                utuwa_sum = adult_s + child_s + baby_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

                taoru = pref.getInt("taoru", 0);
                if (taoru >= adult_n * 1) {
                    adult_s = adult_n * 1;
                }
                taoru = taoru - adult_s;
                if (taoru >= child_n * 1) {
                    child_s = child_n * 1;
                }
                taoru = taoru - child_s;
                if (taoru >= baby_n * 1) {
                    baby_s = baby_n * 1;
                }
                taoru_sum = adult_s + child_s + baby_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

                arumi = pref.getInt("almi", 0);
                if (arumi >= adult_n * 1) {
                    arumi = adult_n * 1;
                }

                rap = pref.getInt("rap", 0);
                if (rap >= adult_n * 1) {
                    rap = adult_n * 1;
                }

                if (b >= 1) {
                    b = 1;
                }

                if (g >= 1) {
                    g = 1;
                }

                if (t >= 1) {
                    t = 1;
                }

                kai = pref.getInt("kaityuu", 0);
                if (kai >= 1) {
                    kai = 1;
                }

                hukuro = pref.getInt("hukuro", 0);
                if (hukuro >= 1) {
                    hukuro = 1;
                }

                spoon = pref.getInt("spoon", 0);
                if (spoon >= 1) {
                    spoon = 1;
                }

                hasi = pref.getInt("hasi", 0);
                if (hasi >= 1) {
                    hasi = 1;
                }

                denti = pref.getInt("denti", 0);
                if (denti >= 2) {
                    denti = 2;
                }

                hituju_sum = otona+kodomo+kai+cop_sum+utuwa_sum+taoru_sum+arumi+rap+b+g+t+hukuro+spoon+hasi+denti;
                MAX=adult_n*3+child_n*4+baby_n*3+11;
                hituju_sum = (hituju_sum/MAX)*60;

                //便利品の計算
                if(gun>=adult_n*1){adult_s=adult_n*1;}
                gun=gun-adult_s;
                if(gun>=child_n*1){child_s=child_n*1;}
                gun_sum=adult_s+child_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

                if(nebukuro>=adult_n*1){adult_s=adult_n*1;}
                nebukuro=nebukuro-adult_s;
                if(nebukuro>=child_n*1){child_s=child_n*1;}
                nebukuro_sum=adult_s+child_s;
                adult_s = 0;
                baby_s = 0;
                child_s = 0;

                if(h>=1){h=1;}

                if(m>=1){m=1;}

                radio=pref.getInt("radio",0);
                if(radio>=1){radio=1;}

                kankiri=pref.getInt("kankiri",0);
                if(kankiri>=0){kankiri=0;}

                masuku = pref.getInt("masuku",0);
                if(masuku>=1){masuku=1;}

                juudenn = pref.getInt("juudennki",0);
                if(juudenn>=1){juudenn=1;}

                benri_sum=gun_sum+nebukuro_sum+h+m+radio+kankiri+masuku+juudenn;
                MAX=adult_n*2+child_n*2+5;
                benri_sum = (benri_sum/MAX)*40;

                int ay = (int)hituju_sum+(int)benri_sum;
                str_sp = "備蓄は" + ay + "%です。";

                TextView et5a = (TextView) findViewById(R.id.stock_p);
                et5a.setText(str_sp);

                if (ay >= 10 && ay < 20) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph1);
                } else if (ay >= 20 && ay < 30) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph2);
                } else if (ay >= 30 && ay < 40) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph3);
                } else if (ay >= 40 && ay < 50) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph4);
                } else if (ay >= 50 && ay < 60) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph5);
                } else if (ay >= 60 && ay < 70) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph6);
                } else if (ay >= 70 && ay < 80) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph7);
                } else if (ay >= 80 && ay < 90) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph8);
                } else if (ay >= 90 && ay < 100) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph9);
                } else if (ay == 100) {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.graph10);
                }break;

            default:break;


        }

        ImageView btnDisp = (ImageView)findViewById(R.id.set_button);
        btnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.setting");
                startActivity(intent);
            }
        });

        ImageView btnstk = (ImageView)findViewById(R.id.stock_button);
        btnstk.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.stock");
                startActivity(intent);
            }
        });

        ImageView btnfood = (ImageView)findViewById(R.id.food_button);
        btnfood.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.food");
                startActivity(intent);
            }
        });


    }



}
