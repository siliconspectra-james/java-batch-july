package com.ssi.utils;

import com.ssi.entity.Employee;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DatabaseUtils {
    public static Map<Integer, Employee> map = new ConcurrentHashMap<>();
}
