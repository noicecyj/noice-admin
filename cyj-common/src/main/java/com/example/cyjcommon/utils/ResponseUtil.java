package com.example.cyjcommon.utils;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Exrickx
 */

public class ResponseUtil {

        /**
         * 使用response输出JSON
         *
         * @param response response
         * @param res      res
         */
        public static void out(HttpServletResponse response, String res) {
                response.setContentType("application/json;charset=UTF-8");
                response.setHeader("Cache-Control", "no-store, max-age=0, no-cache, must-revalidate");
                response.addHeader("Cache-Control", "post-check=0, pre-check=0");
                response.setHeader("Pragma", "no-cache");
                try {
                        PrintWriter out = response.getWriter();
                        out.write(res);
                        out.flush();
                        out.close();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

}
