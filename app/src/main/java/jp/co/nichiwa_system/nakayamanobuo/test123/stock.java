package jp.co.nichiwa_system.nakayamanobuo.test123;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.DialogInterface;
//import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View.OnClickListener;

import java.util.Calendar;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class stock extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_stock);
        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        //イメージボタンを押された時の動き
        ImageButton btn = (ImageButton) findViewById(R.id.gas);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                //アラートダイアログの出力
                AlertDialog.Builder gas_alert;
                gas_alert = new AlertDialog.Builder(stock.this);
                gas_alert.setTitle("ガスコンロ");

                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw = inflater.inflate(R.layout.activity_popup_1, null);


                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("ga", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.gasText);

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



                EditText adult_et = (EditText)viw.findViewById(R.id.adult);


                adult_et.setText(a_str);



                gas_alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.gasText);
                        String str = et.getText().toString();

                        if(str.length() <= 0){
                            str = "0";
                        }

                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("ga",i);
                       // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });
                gas_alert.setView(viw);
                gas_alert.show();
            }
        });

        //イメージボタンを押された時の動き
        ImageButton btnmatti = (ImageButton) findViewById(R.id.matti);
        btnmatti.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("マッチ・ライター");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_2, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("matti", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.fireText);

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

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.fireText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("matti",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnbomb = (ImageButton) findViewById(R.id.bombe);
        btnbomb.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("ガスボンベ");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_3, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("bomb", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.bombText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.bombText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("bomb",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnhue = (ImageButton) findViewById(R.id.hue);
        btnhue.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("笛");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_4, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("hue", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.hueText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.hueText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("hue",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnsitagi = (ImageButton) findViewById(R.id.sitagi);
        btnsitagi.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("下着");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_5, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("sitagi", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.sitagiText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);


                adult_et.setText(a_str);



                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.sitagiText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("sitagi",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnthissyu = (ImageButton) findViewById(R.id.thissyu);
        btnthissyu.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("ティッシュ");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_6, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("thissyu", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.thissyuText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);


                adult_et.setText(a_str);



                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        EditText et = (EditText) viw.findViewById(R.id.thissyuText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("thissyu",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnalmi = (ImageButton) findViewById(R.id.arumi);
        btnalmi.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("アルミホイル");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_7, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("almi", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.almiText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";



                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);



                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.almiText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("almi",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btngunnte = (ImageButton) findViewById(R.id.gunnte);
        btngunnte.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("軍手");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_8, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("gunnte", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.gunnteText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);


                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);

                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);


                adult_et.setText(a_str);
                child_et.setText(c_str);



                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.gunnteText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("gunnte",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });
        ImageButton btnkaityu = (ImageButton) findViewById(R.id.kaityuu);
        btnkaityu.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("懐中電灯");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_kaityuu, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kaityuu", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.kaityuutxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.kaityuutxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("kaityuu",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnkoppu = (ImageButton) findViewById(R.id.cop);
        btnkoppu.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("コップ");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_koppu, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("koppu", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.kopputxt);

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
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

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
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.kopputxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("koppu",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnutuwa = (ImageButton) findViewById(R.id.utuwa);
        btnutuwa.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("器");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_utuwa, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("utuwa", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.utuwatxt);

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
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

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
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.utuwatxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("utuwa",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btntaoru = (ImageButton) findViewById(R.id.taoru);
        btntaoru.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("タオル");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_taoru, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("taoru", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.taorutxt);

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
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

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
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.taorutxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("taoru",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnrappu = (ImageButton) findViewById(R.id.rap);
        btnrappu.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("ラップ");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_rap, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("rap", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.raptxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.raptxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("rap",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnhukuro = (ImageButton) findViewById(R.id.hukuro);
        btnhukuro.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("袋");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_hukuro, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("hukuro", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.hukurotxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";

                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.hukurotxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("hukuro",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnspoon = (ImageButton) findViewById(R.id.spoon);
        btnspoon.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("スプーン");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_spoon, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("spoon", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.spoontxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.spoontxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("spoon",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnhasi = (ImageButton) findViewById(R.id.hasi);
        btnhasi.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("箸");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_hasi, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("hasi", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.hasitxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.hasitxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("hasi",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btndenti = (ImageButton) findViewById(R.id.denti);
        btndenti.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("乾電池[単三]");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_denti, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("denti", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.dentitxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.dentitxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("denti",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnradio = (ImageButton) findViewById(R.id.rajio);
        btnradio.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("ラジオ");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_radio, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("radio", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.radiotxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.radiotxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("radio",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnkannkiri = (ImageButton) findViewById(R.id.kankiri);
        btnkannkiri.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("缶切り");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_kankiri, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kankiri", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.kankiritxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.kankiritxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("kankiri",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnmasuku = (ImageButton) findViewById(R.id.masuku);
        btnmasuku.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("マスク");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_mask, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("masuku", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.masktxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.masktxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("masuku",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });


        ImageButton btnjuudenn = (ImageButton) findViewById(R.id.juudennki);
        btnjuudenn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("携帯電話充電器[単三]");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_juudennki, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("juudennki", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.juudenntxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);


                int a = adult.getInt("adult", 0);

                String a_str = "大人"+String.valueOf(a)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);

                adult_et.setText(a_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.juudenntxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("juudennki",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });
        ImageButton btnbin = (ImageButton) findViewById(R.id.honyuu);
        btnbin.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("哺乳瓶");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_bin, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("bin", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.bintxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int b = baby.getInt("baby",0);

                String b_str = "幼児"+String.valueOf(b)+"人";


                EditText baby_et = (EditText)viw.findViewById(R.id.adult);

                baby_et.setText(b_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.bintxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("bin",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });
        ImageButton btnomutu = (ImageButton) findViewById(R.id.omutu);
        btnomutu.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("オムツ");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_omutu, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("omutu", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.omututxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);
                int b = baby.getInt("baby",0);
                String b_str = "幼児"+String.valueOf(b)+"人";
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);
                baby_et.setText(b_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.omututxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("omutu",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnnebukuro = (ImageButton) findViewById(R.id.nebukuro);
        btnnebukuro.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("寝袋");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_nebukuro, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("nebukuro", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.nebukuroText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);



                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);

                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);

                adult_et.setText(a_str);
                child_et.setText(c_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.nebukuroText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("nebukuro",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });
        ImageButton btnkodomo = (ImageButton) findViewById(R.id.sitagi_c);
        btnkodomo.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("子供下着");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_sitagi_c, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kodomo", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.kodomotxt);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                int c = child.getInt("child",0);
                String c_str = "子供"+String.valueOf(c)+"人";
                EditText child_et = (EditText)viw.findViewById(R.id.child);
                child_et.setText(c_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        //最終入力日を保存
                        Calendar today =Calendar.getInstance();
                        String today_last =today.get(Calendar.YEAR)+"年"+(today.get(Calendar.MONTH)+1)+"月"+today.get(Calendar.DATE)+"日です。";
                        SharedPreferences.Editor etoday = prefs.edit();
                        etoday.putString("today_s",today_last);
                        etoday.commit();

                        EditText et = (EditText) viw.findViewById(R.id.kodomotxt);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("kodomo",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });
        ImageView btnDisp = (ImageView)findViewById(R.id.set_button);
        btnDisp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.setting");
                startActivity(intent);
            }
        });

        ImageView btnstk = (ImageView)findViewById(R.id.food_button);
        btnstk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.food");
                startActivity(intent);
            }
        });

        ImageView btnfood = (ImageView)findViewById(R.id.home);
        btnfood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.nakayamanobuo.test123","jp.co.nichiwa_system.nakayamanobuo.test123.MainActivity");
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
