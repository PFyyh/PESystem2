package com.pesystem.vo;

import com.pesystem.po.Faculty;

public class FacultyCustom extends Faculty {
    @Override
    public String toString(){
        return super.getFacultyId()+super.getFacultyName();
    }
}
