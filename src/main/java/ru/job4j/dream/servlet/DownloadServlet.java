package ru.job4j.dream.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        id += ".jpg";
        File downloadFile = null;
        for (File file : Objects.requireNonNull(new File("c:\\images\\").listFiles())) {
            if (id.equals(file.getName())) {
                downloadFile = file;
                break;
            }
        }
        resp.setContentType("application/octet-stream");
        if (downloadFile != null) {
            resp.setHeader("Content-Disposition", "attachment; filename=\""
                    + downloadFile.getName() + "\"");
            try (FileInputStream stream = new FileInputStream(downloadFile)) {
                resp.getOutputStream().write(stream.readAllBytes());
            }
        }
    }
}
