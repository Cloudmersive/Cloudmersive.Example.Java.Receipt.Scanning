package pkg;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;

import java.io.File;

import com.cloudmersive.client.GenerateBarcodeApi;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
        String value = "value_example"; // String | QR code text to convert into the QR code barcode
        try {
            File result = apiInstance.generateBarcodeQRCode(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeQRCode");
            e.printStackTrace();
        }
    }
}
