package com.ssh;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mashape.unirest.http.exceptions.UnirestException;
/**
 * @author Evim
 * @date 2019/3/2020:10
 **/
public class Test {

    public static void main(String[] args) throws FileNotFoundException, UnirestException {
        List list = new ArrayList(7);
        list.add(null);
        System.out.println(list.size());

    }
}
