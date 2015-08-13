package com.example.pc_user.fudora;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by msalad on 8/12/2015.
 */
public class EventAdapter extends BaseExpandableListAdapter {


    private Context ctx;
    private HashMap<String, List<String>> event_Category;
    private List<String> event_List;

    EventAdapter(Context ctx, HashMap<String, List<String>> event_Category, List<String> event_List) {
        this.ctx = ctx;
        this.event_Category = event_Category;
        this.event_List = event_List;


    }

    @Override
    public View getChildView(int parent, int child, boolean lastChild, View convertView, ViewGroup parentView) {
        String child_title = (String) getChild(parent, child);
        if (convertView == null) {
            LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.child_layout_java, parentView, false);
        }
        TextView child_textview = (TextView) convertView.findViewById(R.id.child_txt);
        child_textview.setText(child_title);

        return convertView;

    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertview, ViewGroup parentview) {
        // TODO Auto-generated method stub
        String group_title = (String) getGroup(parent);
        if (convertview == null) {
            LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview = inflator.inflate(R.layout.parent_layout_java, parentview, false);
        }
        TextView parent_textview = (TextView) convertview.findViewById(R.id.parent_txt);
        parent_textview.setTypeface(null, Typeface.BOLD);
        parent_textview.setText(group_title);
        return convertview;
    }

    @Override
    public boolean isChildSelectable(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getGroupCount() {
        // TODO Auto-generated method stub
        return event_List.size();
    }

    @Override
    public long getGroupId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    @Override
    public int getChildrenCount(int arg0) {

        return event_Category.get(event_List.get(arg0)).size();
    }

    @Override
    public Object getGroup(int arg0) {
        // TODO Auto-generated method stub
        return event_List.get(arg0);
    }



    @Override
    public Object getChild(int parent, int child) {


        return event_Category.get(event_List.get(parent)).get(child);
    }

    @Override
    public long getChildId(int parent, int child) {
        // TODO Auto-generated method stub
        return child;
    }

    @Override
    public boolean hasStableIds() {
        // TODO Auto-generated method stub
        return false;
    }
}