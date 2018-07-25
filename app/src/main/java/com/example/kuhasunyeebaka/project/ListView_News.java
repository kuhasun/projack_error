package com.example.kuhasunyeebaka.project;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListView_News extends AppCompatActivity {


    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view__news);
        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new ListViewAdapter(getApplicationContext()));
    }


    //คลาส Adapter เอาไว้เพือโหลด Layout ขึ้นมาแสดงผล
    public class ListViewAdapter extends BaseAdapter {


        public Context mContext;            //สรา้งตัวแปรเพือ รอ ประกาศ ออกมา
        public LayoutInflater mInflater;        //ตัวแปรจะใช้ในการโหลด Layout
        // สร้างตัวคอนสตรักเตอร์ ที่รับค่า Context เข้ามา
        public ListViewAdapter (Context context){
            mContext = context;                     // ตัวแบคอัพ
            mInflater = LayoutInflater.from(mContext);      //ตัวโหลด ที่ประกาศเอาไว้

        }
        @Override
        //จะถามว่ามีกี ROW เพือที่จะไห้แสดงขึ้นมา
        public int getCount() {
            return 5;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        //จะทำการเรียก ตามที่ getRount ระบุไว้
        public View getView(int i, View convertView, ViewGroup viewGroup) {

            ViewHolder holder = null;
            if (convertView == null){
                //Load layout
                convertView = mInflater.inflate(R.layout.item_listview , null);
                holder = new ViewHolder();
                holder.title = (TextView) convertView.findViewById(R.id.textNewsTitle);
                convertView.setTag(holder);
            }else {
                //rebind widget

                holder = (ViewHolder) convertView.getTag();
            }
            holder.title.setText("ข่าว."+ String.valueOf(i));
            return convertView;
        }
    }

    //ประกาศตัวแปรที่ใช้ในการ ByWidget (เพือใช้ในการแก้ไขตัวไหนบ้างง)
    public class ViewHolder{
        TextView title;
        ImageView authorImage;
        ImageView youtubeThumnail;
        TextView description;

    }
}
