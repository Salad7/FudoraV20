package com.example.pc_user.fudora;

import java.util.UUID;

/**
 * Created by msalad on 6/22/2015.
 */
public class UserData {

    private String mTitle;
    private String mPurpose;
    private String mAttendence;
    private String mCost;
    private String mPhone;
    private String mAddress;
    private UUID mId;

    UserData()
    {

    }
    UserData(String title, String purpose, String attendence, String cost, String phone, String address)
    {
        mTitle = title;
        mPurpose = purpose;
        mAttendence = attendence;
        mCost = cost;
        mPhone = phone;
        mAddress = address;
        mId = UUID.randomUUID();
    }

    public void setTitle(String title)
    {
        mTitle = title;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public void setPurpose(String purpose)
    {
        mPurpose = purpose;
    }

    public String getPurpose()
    {
        return mPurpose;
    }

    public void setAttendence(String attendence)
    {
        mAttendence = attendence;
    }

    public String getAttendence()
    {
        return mAttendence;
    }


    public void setCost(String cost)
    {
        mCost = cost;
    }

    public String getCost()
    {
        return mCost;
    }


    public void setPhone(String phone)
    {
        mPhone = phone;
    }

    public String getPhone()
    {
        return mPhone;
    }


    public void setAddress(String address)
    {
        mAddress = address;
    }
    public String getAddress()
    {
        return mAddress;
    }

    public UUID getUUID()
    {
        return mId;
    }



}
