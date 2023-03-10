import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

public class Dos implements Runnable {

private final String USER_AGENT =   "Mozilla/5.0 (Android; Linux armv7l; rv:10.0.1) Gecko/20100101 Firefox/10.0.1 Fennec/10.0.1Mozilla/5.0 (Android; Linux armv7l; rv:10.0.1) Gecko/20100101 Firefox/10.0.1 Fennec/10.0.1";

    private static int amount = 0;
    private static String url = "https://www.google.com/accounts/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/&ss=1&scc=1&sq=%23";
    int seq;
    int type;

 boolean done;
    ArrayList<Integer> data;

    @Override
    public void run() {
    try {
    URL url = new URL(url);
    HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
    connection.setRequestMethod("POST");
    connection.setDoInput(true);
    connection.setDoOutput(true);
    connection.setUseCaches(false);
    connection.setSocketTimeout(30000);
    DataOutputStream out = new DataOutputStream(connection.getOutputStream());
    out.writeUTF(USER_AGENT);
    out.flush();
    byte[] bytes = new byte[1024];
    int bytesRead = 0;
    while ((bytesRead = in.read(bytes)) > 0) {
        data.add(bytesRead);
    }
    in.close();
    out.close();
    connection.disconnect();
    } catch (Exception and) {
        System.err.println("Exception while trying to post: " + and);
    }
    }
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));    private static DataOutputStream out = new DataOutputStream(System.out);
    }