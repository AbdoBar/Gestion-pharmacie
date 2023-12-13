package plagiat;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;

public class ArticlePlagiarismChecker {

    private static final String COPYSCAPE_API_ENDPOINT = "https://www.copyscape.com/api/";
    private static final String COPYSCAPE_USERNAME = "abderrahmane";
    private static final String COPYSCAPE_API_KEY = "e450im7fp5i9wrrv";
    private static final MediaType JSON_MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");
    private OkHttpClient client;

    public ArticlePlagiarismChecker() {
        client = new OkHttpClient();
    }

    /*public void checkPlagiarism(String articleToCheck) throws JSONException{
        JSONObject requestJson = new JSONObject();
        requestJson.put("u", COPYSCAPE_USERNAME);
        requestJson.put("k", COPYSCAPE_API_KEY);
        requestJson.put("o", "csearch");
        requestJson.put("t", articleToCheck);

        RequestBody requestBody = RequestBody.create(JSON_MEDIA_TYPE, requestJson.toString());
        Request request = new Request.Builder()
                .url(COPYSCAPE_API_ENDPOINT)
                .post(requestBody)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String responseJson = response.body().string();
                JSONObject jsonResponse = new JSONObject(responseJson);

                JSONArray resultArray = jsonResponse.getJSONArray("result");

                for (int i = 0; i < resultArray.length(); i++) {
                    JSONObject resultItem = resultArray.getJSONObject(i);
                    String title = resultItem.getString("title");
                    double plagiarismPercentage = resultItem.getDouble("pct");
                    System.out.println("Article Title: " + title);
                    System.out.println("Plagiarism Percentage: " + plagiarismPercentage);
                    System.out.println();
                }
            } else {
                System.out.println("Error: " + response.code() + " - " + response.message());
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }*/
public void checkPlagiarism(String articleToCheck) throws JSONException {
    JSONObject requestJson = new JSONObject();
    requestJson.put("u", COPYSCAPE_USERNAME);
    requestJson.put("k", COPYSCAPE_API_KEY);
    requestJson.put("o", "csearch");
    requestJson.put("t", articleToCheck);

    RequestBody requestBody = RequestBody.create(JSON_MEDIA_TYPE, requestJson.toString());
    Request request = new Request.Builder()
            .url(COPYSCAPE_API_ENDPOINT)
            .post(requestBody)
            .build();

    try (Response response = client.newCall(request).execute()) {
        if (response.isSuccessful()) {
            String responseJson = response.body().string();
            System.out.println("Response Body: " + responseJson); // Print response body for troubleshooting

            JSONObject jsonResponse = new JSONObject(responseJson);
            // Rest of the code...
        } else {
            System.out.println("Error: " + response.code() + " - " + response.message());
        }
    } catch (IOException | JSONException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        ArticlePlagiarismChecker checker = new ArticlePlagiarismChecker();
        String articleToCheck = "This is the article to check for plagiarism.";
        try {
            checker.checkPlagiarism(articleToCheck);
        } catch (JSONException ex) {
            Logger.getLogger(ArticlePlagiarismChecker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
