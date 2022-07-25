package com.ssi.utils;

import com.google.gson.Gson;
import com.ssi.entity.Employee;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

public class ApiUtils {
    public static  <T> T getRequestBody (HttpServletRequest request, Class<T> type) {
        StringBuilder stringBuilder = new StringBuilder();
        Gson gson = new Gson();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        T t = gson.fromJson(stringBuilder.toString(), type);
        return t;
    }
}
