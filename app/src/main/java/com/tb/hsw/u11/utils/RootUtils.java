package com.tb.hsw.u11.utils;

import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 */

public class RootUtils {

    private RootUtils(){}

    public static void su(String cmd){
        Process process;
        try {
            process = Runtime.getRuntime().exec("su");
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    process.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    process.getOutputStream()));
            BufferedReader error = new BufferedReader(new InputStreamReader(
                    process.getErrorStream()));
            writer.write(cmd + "\n");
            writer.write("exit\n");
            writer.flush();

            String line;
            while ((line = reader.readLine()) != null) {

                // 处理结果

            }
            while ((line = error.readLine()) != null) {
                Log.e("error", line);
            }
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
